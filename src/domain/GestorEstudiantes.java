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
    /***
     * Se inicializa una lista vacia
     */
    public GestorEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }
    /***
     * Agregamos un estudiante creado a la lista de estudiantes del gestor
     * @param e => Estudiante proveniente de la UI
     */
    public void agregarEstudiante(Estudiante e){
        this.estudiantes.add(e);
    }
    public List<Estudiante> obtenerListaEstudiantes(){
        return this.estudiantes;
    }
    /***
     * Calculamos el promedio usando una variable acumuladora, a la cual se le suman
     * todas las notas de los estudiantes
     * @return El valor del promedio del salon. 0 si no hay ningun estudiante
     */
    public double calcularPromedioNotas(){
        if(this.estudiantes.isEmpty()){
            return 0;
        }
        double acum = 0;
        for(Estudiante e : estudiantes){
            acum += e.getNota();
        }
        return acum / estudiantes.size();
    }
}
