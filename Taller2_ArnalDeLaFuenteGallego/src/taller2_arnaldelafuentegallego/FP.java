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
public class FP extends Curso {

    private String especialidadFP;

    public FP(String especialidadFP, String nombreCurso, List<Asignatura> asignaturas, String codigoAsignatura) {
        super(nombreCurso, asignaturas, codigoAsignatura);
        this.especialidadFP = especialidadFP;
    }

    @Override
    public String toString() {
        return "FP (" + especialidadFP + ")\n" + super.toString();
    }

    public String mostrarInfoFP() {
        return especialidadFP;
    }

}
