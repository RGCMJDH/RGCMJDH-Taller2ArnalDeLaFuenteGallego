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
public class Obligatoria extends Asignatura {

    // Atributos
    private int creditos;

    public Obligatoria(int creditos, String nombreAsignatura, String codigoAsignatura, List<Estudiante> estudiantesMatriculado) {
        super(nombreAsignatura, codigoAsignatura, estudiantesMatriculado);
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Obligatoria ( Cts: " + creditos + ")\n" + super.toString();
    }

    // Procedimientos
    void mostrarInfoObligatoria() {
        // muestra los créditos y tipo de asignatura obligatoria.
    }
}
