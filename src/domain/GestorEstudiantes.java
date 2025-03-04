/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Pablo
 */
public class GestorEstudiantes {

    public List<Estudiante> estudiantes;

    /**
     * *
     * Se inicializa una lista vacia que almacenará los estudiantes
     */
    public GestorEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }

    /**
     * Se crea una instancia de Estudiante, y se agrega a la lista de esudiantes de la clase.
     * @param nombre Nombre del estudiante recibido de la UI
     * @param edad Edad del estudiante recibida de la UI
     * @param nota nota del estudiante recibida de la UI
     * @throws Exception Si la nota es menor a 1 o mayor a 5 PARA UN SISTEMA DE CALIFICACIONES ESTANDAR DE COLOMBIA)
     */
    public void agregarEstudiante(String nombre, int edad, double nota) throws Exception{
        if (nota < 0 || nota > 5) {
            throw new Exception("NOTA INVALIDA");
        }
        Estudiante estudiante = new Estudiante(nombre,edad,nota);
        this.estudiantes.add(estudiante);
    }

    /**
     *
     * @return Lista de estudiantes que estan almacenados en el gestor
     */
    public List<Estudiante> obtenerListaEstudiantes() {
        return this.estudiantes;
    }

    /**
     * *
     * Calculamos el promedio usando una variable acumuladora, a la cual se le
     * suman todas las notas de los estudiantes
     *
     * @return double con el valor del promedio del salon. 0 si no hay ningun
     * estudiante
     */
    public double calcularPromedioNotas() {
        if (this.estudiantes.isEmpty()) {
            return 0;
        }
        double acum = 0;
        for (Estudiante e : estudiantes) {
            acum += e.getNota();
        }
        return acum / estudiantes.size();
    }
    
    /***
     * Se usa un StringBuilder para formatear la informacion del estudiante
     * como su nombre, edad y a nota.
     * @return Una cadena con la información de los estudiantes formateada
     */
    public String formatearListaEstudiantes(){
        if(this.estudiantes.isEmpty()){
            return "NO HAY ESTUDIANTES EN LA LISTA, POR FAVOR AGREGUE UNO";
        }
        StringBuilder sb = new StringBuilder();
        for(Estudiante e : estudiantes){
            sb.append("NOMBRE: ");
            sb.append(e.getNombre()).append(" ");
            sb.append("EDAD: ");
            sb.append(e.getEdad()).append(" ");
            sb.append("NOTA: ");
            sb.append(e.getNota()).append('\n');
        }
        return sb.toString();
    }
}
