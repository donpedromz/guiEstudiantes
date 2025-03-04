/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 * Clase que guarda la info del estudiante
 * @author Juan Pablo
 */
public class Estudiante {
    /*
    * atributo que guarda el nombre del estudiante
    */
    private String nombre;
    private int edad;
    private double nota;
    /**
     * Constructor vacio de la clase Estudiante 
     */
    public Estudiante() {
    }
    
    /**
     * Contructor de la clase tudiante
     * @param nombre
     * @param edad
     * @param nota 
     */
    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    /**
     * 
     * @return String con la info del estudiante
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }
    

    /**
     * 
     * @return String con el nombre del Estudiante
     */
    public String getNombre() {
        return this.nombre;
    }
    /**
     * Actualiza el nombre del estudiante
     * @param nombre Nombre nuevo del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Valor entero con la edad del Estudiante
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Actualiza la edad del estudiante
     * @param edad Edad nueva del estudiante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return double con la Nota del estudiante
     */
    public double getNota() {
        return nota;
    }
    /**
     * Actualiza la nota del estudiante
     * @param nota Nota nueva del estudiante
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
