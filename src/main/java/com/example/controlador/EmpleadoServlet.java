package com.example.controlador;

import com.example.dao.EmpleadoDAO;
import com.example.model.Empleado;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/empleados")
public class EmpleadoServlet extends HttpServlet {
    private EmpleadoDAO dao = new EmpleadoDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("listar".equals(action)) {
            List<Empleado> empleados = dao.listar();
            request.setAttribute("empleados", empleados);
            request.getRequestDispatcher("/listar.jsp").forward(request, response);
            System.out.println("Empleados encontrados: " + empleados.size());

        } else {
            response.sendRedirect("index.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        double salario = Double.parseDouble(request.getParameter("salario"));

        Empleado emp = new Empleado(nombre, correo, salario);
        int resultado = dao.insertar(emp);

        String mensaje;
        boolean exito = true;
        if (resultado == 1) {
            mensaje = "Empleado registrado con éxito.";
        } else if (resultado == -1) {
            mensaje = "❌ Error: El correo ya está registrado.";
            exito = false;
        } else {
            mensaje = "❌ Error al registrar el empleado.";
            exito = false;
        }

        request.setAttribute("exito", exito);
        request.setAttribute("mensaje", mensaje);
        request.getRequestDispatcher("/resultado.jsp").forward(request, response);
    }
}