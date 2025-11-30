package com.example.model;

public class Empleado {
    private int id;
    private String nombre;
    private String correo;
    private double salario;

    public Empleado() {}
    public Empleado(String nombre, String correo, double salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.salario = salario;
    }
    public Empleado(int id, String nombre, String correo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.salario = salario;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}