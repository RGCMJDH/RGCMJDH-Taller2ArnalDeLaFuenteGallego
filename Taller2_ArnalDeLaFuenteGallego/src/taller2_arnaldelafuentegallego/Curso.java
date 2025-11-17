/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_arnaldelafuentegallego;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alber
 */
abstract class Curso {

    // Atributos
    private String nombreCurso;
    private List<Asignatura> asignaturas;
    private String codigoAsignatura; // Int/String codigoAsignatura

    public Curso(String nombreCurso, List<Asignatura> asignaturas, String codigoAsignatura) {
        this.nombreCurso = nombreCurso;
        this.asignaturas = asignaturas;
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    @Override
    public String toString() {
        String out = "";
        out += "Curso: " + nombreCurso + " | Código: " + codigoAsignatura + "\n";

        if (asignaturas != null && !asignaturas.isEmpty()) {
            for (Asignatura a : asignaturas) {
                out += "  - " + a.toString() + "\n"; // cada Asignatura cuenta su detalle
            }
        }
        return out;
    }

    public Asignatura buscaAsignatura(String asig) {
        for (Asignatura a : asignaturas) {
            if (a.getNombreAsignatura().equals(asig)) {
                return a;
            }
        }
        return null; // si no la encuentra
    }

    public String imprimeListaAsignaturas() {
        if (asignaturas == null || asignaturas.isEmpty()) {
            return "";
        }
        String res = "";
        for (Asignatura a : asignaturas) {
            res += a.toString() + "\n";
        }
        return res;
    }

    // Curso - BACH O FP
    // Procedimientos
    private void ordenarAsignaturas() {
        asignaturas.sort(Comparator.comparingInt(a -> Integer.parseInt(a.getCodigoAsignatura())));
    }

    // Dentro de Curso (o donde la tengas). Usa this.asignaturas
    public void agregarAsignatura(Scanner scan, int numAsign) {

        for (int i = 1; i <= numAsign; i++) {
            System.out.println("Asignatura " + i + ":");

            System.out.print("  Nombre: ");
            String nom = scan.nextLine();

            System.out.print("  Código: ");
            String cod = scan.nextLine();

            System.out.print("Asignatura Obligatoria (1) u Optativa (2)? ");
            int opc = Integer.parseInt(scan.nextLine()); // lee línea completa y convierte
            switch (opc) {
                case 1:
                    // Obligatoria
                    System.out.print("  Créditos: ");
                    int cred = Integer.parseInt(scan.nextLine()); // igual: línea -> int
                    asignaturas.add(new Obligatoria(cred, nom, cod, new ArrayList<>()));
                    break;
                case 2:
                    // Optativa
                    System.out.print("  ¿Asignatura Teórica o Práctica? ");
                    String perfil = scan.nextLine(); // aquí ya no se cuela el \n
                    this.asignaturas.add(new Optativa(perfil, nom, cod, new ArrayList<>()));
                    break;
                default:
                    System.out.println("  Opción de asignatura no válida. Se omite esta entrada.");
                    i--; // para reintentar la misma posición si quieres; o quita esta línea para saltarla
                    break;
            }
            ordenarAsignaturas();
        }
    }

    public void eliminarAsignatura(Asignatura a) {
        // elimina una asignatura del curso junto con los estudiantes matriculados en ella.
    }

    private void listarAsignaturas() {
        // muestra todas las asignaturas del curso con sus estudiantes.
    }
}
