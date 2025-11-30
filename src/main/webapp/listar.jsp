<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Lista de Empleados</title>
</head>
<body>
    <h2>Empleados Registrados</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Correo</th>
            <th>Salario</th>
        </tr>
        <c:forEach var="emp" items="${empleados}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.nombre}</td>
                <td>${emp.correo}</td>
                <td>${emp.salario}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="index.html">Registrar otro empleado</a>
</body>
</html>
