/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_arnaldelafuentegallego;

/**
 *
 * @author alber
 */
public class Estudiante {
    // Atributos
    private String nom;
    private String dni;
    private Asignatura[] asignaturasMatriculadas;

    public Estudiante(String nom, String dni, Asignatura[] asignaturasMatriculadas) {
        this.nom = nom;
        this.dni = dni;
        this.asignaturasMatriculadas = asignaturasMatriculadas;
    }

    
    // Procedimientos
    void matricularEnAsignatura(Asignatura a) {
        // añade la asignatura a su lista de matriculación.
    }

    void darDeBajaDeAsignatura(Asignatura a) {
        // elimina una asignatura de su lista.
    }

    void listarAsignaturas() {
        // muestra todas las asignaturas en las que está matriculado, indicando el tipo y curso al que pertenecen.
    }
}