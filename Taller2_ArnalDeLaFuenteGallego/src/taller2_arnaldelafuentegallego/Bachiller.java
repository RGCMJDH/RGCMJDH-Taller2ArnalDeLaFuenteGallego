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
public class Bachiller extends Curso {

    // Atributos
    private String tipoBachiller; // (primero o segundo)

    public Bachiller(String tipoBachiller, String nombreCurso, List<Asignatura> asignaturas, String codigoAsignatura) {
        super(nombreCurso, asignaturas, codigoAsignatura);
        this.tipoBachiller = tipoBachiller;
    }

    @Override
    public String toString() {
        return "Bachiller (" + tipoBachiller + ")\n" + super.toString();
    }

    public void mostrarInfoBachiller() {
        System.out.println("El curso de Bachiller es " + tipoBachiller);
    }

}
