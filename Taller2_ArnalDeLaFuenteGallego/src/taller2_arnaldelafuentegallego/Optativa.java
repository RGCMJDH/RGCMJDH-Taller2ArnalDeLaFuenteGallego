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
public class Optativa extends Asignatura {

    @Override
    public String toString() {
        return "Optativa (" + perfil + ")\n" + super.toString();
    }
    //return "Optativa (" + perfil + ")\n" + super.toString();
    // Atributos
    private String perfil; // (por ejemplo, teórico o práctico)

    public Optativa(String perfil, String nombreAsignatura, String codigoAsignatura, List<Estudiante> estudiantesMatriculado) {
        super(nombreAsignatura, codigoAsignatura, estudiantesMatriculado);
        this.perfil = perfil;
    }

    // Procedimientossdaas

    public String getPerfil() {
        return perfil;
    }
   
}
