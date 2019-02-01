package com.example.lbenitez.menuopciones;

import java.util.Objects;

public class Alumno {

    private long id;
    private String img;
    private String name;
    private String apellidos;
    private String curso;

    public Alumno() { }

    public Alumno(long id, String img, String name, String apellidos, String curso) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.apellidos = apellidos;
        this.curso = curso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(id, alumno.id) &&                         Objects.equals(img, alumno.img) &&
                Objects.equals(name, alumno.name) &&
                Objects.equals(apellidos, alumno.apellidos) &&
                Objects.equals(curso, alumno.curso);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, img, name, apellidos, curso);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + name + '\'' +
                ", name='" + name + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
