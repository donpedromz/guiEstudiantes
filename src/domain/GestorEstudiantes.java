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

    public GestorEstudiantes() {
        this.estudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante e){
        this.estudiantes.add(e);
    }
    public List<Estudiante> obtenerListaEstudiantes(){
        return this.estudiantes;
    }
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
