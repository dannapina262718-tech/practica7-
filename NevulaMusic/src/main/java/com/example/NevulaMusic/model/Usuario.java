package com.example.NevulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String pseudonimo;
    private String genero;
    private String suscripcion;
    private String fecha_nacimiento;
    private String terminos;
    private String comentarios;

    public Usuario(String nombre, String correo, String contrasenia, String pseudonimo,
                   String genero, String suscripcion, String fecha_nacimiento, String terminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.pseudonimo = pseudonimo;
        this.genero = genero;
        this.suscripcion = suscripcion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.terminos = terminos;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public String getGenero() {
        return genero;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public String getfecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTerminos() {
        return terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setPseudpnimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
