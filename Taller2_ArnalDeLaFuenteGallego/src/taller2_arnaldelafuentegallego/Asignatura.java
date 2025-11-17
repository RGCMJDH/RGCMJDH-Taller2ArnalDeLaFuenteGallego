/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_arnaldelafuentegallego;

import java.util.List;

/**
 *
 * @author alber
 */
abstract class Asignatura {
    // Atributos
    private String nombreAsignatura;
    private String codigoAsignatura;
    private List<Estudiante> estudiantesMatriculado;

    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", codigoAsignatura=" + codigoAsignatura + ", estudiantesMatriculado=" + estudiantesMatriculado + '}';
    }

    public Asignatura(String nombreAsignatura, String codigoAsignatura, List<Estudiante> estudiantesMatriculado) {
        this.nombreAsignatura = nombreAsignatura;
        this.codigoAsignatura = codigoAsignatura;
        this.estudiantesMatriculado = estudiantesMatriculado;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public List<Estudiante> getEstudiantesMatriculado() {
        return estudiantesMatriculado;
    }

    
    // Procedimientos
    public void matricularEstudiante(Estudiante e) {
        estudiantesMatriculado.add(e);
    }

    void darDeBajaEstudiante(Estudiante e) {
        // elimina un estudiante de la asignatura.
    }

    void ordenarEstudiantesPorNombre() {
        // ordena los estudiantes matriculados por nombre.
    }
}
