/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2_arnaldelafuentegallego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alber
 */
public class Taller2_ArnalDeLaFuenteGallego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Taller2_ArnalDeLaFuenteGallego().inicio();
    }

    private Scanner scan;
    private Llista listaCursos = new Llista();

    private void inicio() {
        scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== GESTIÓN DE CURSOS ===");
            System.out.println("1) Alta de curso");
            System.out.println("2) Matricular a alumnos por asignatura");
            System.out.println("3) Dar de baja un curso");
            System.out.println("4) Dar de baja una asignatura");
            System.out.println("5) Listar asignaturas por curso dado");
            System.out.println("6) Dada un asignatura, decir a que curso pertenece");
            System.out.println("7) Que asignaturas hace el alumno dado");
            System.out.println("0) Salir");
            System.out.print("Selecciona una opción: ");

            String input = scan.nextLine().trim();
            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                opcion = -1;
            }
            //listaCursos.imprimeCursos();
            switch (opcion) {
                case 1 -> {
                    darDeAltaCurso();
                }
                case 2 -> {

                    System.out.println("");
                    listaCursos.imprimeNombreCursos();
                    System.out.println("");
                    System.out.println("Elige un curso");

                    // 1️⃣ Guardas el curso que elige el usuario
                    String nombreCurso = scan.nextLine();
                    Curso cursoSeleccionado = listaCursos.buscaCursos(nombreCurso);

                    // 2️⃣ Muestras las asignaturas de ESE curso
                    listaCursos.imprimeAsignaturasCurso(cursoSeleccionado);

                    System.out.println("Ahora elige una asignatura: ");
                    String nombreAsignatura = scan.nextLine();

                    // 3️⃣ Buscas la asignatura dentro del curso y la guardas
                    Asignatura asignaturaSeleccionada = cursoSeleccionado.buscaAsignatura(nombreAsignatura);

                    // 4️⃣ A partir de aquí ya trabajas con el objeto Asignatura
                    System.out.print("Cuantos alumnos quieres meter en la asignatura: ");
                    int numAlumnos = Integer.parseInt(scan.nextLine());

                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                default -> {
                }
            }
        } while (opcion != 0);

        scan.close();
    }

    private Estudiante crear(Asignatura a) {
        Estudiante e = null;

        return e;
    }

    // Atributo en tu clase gestora
// private final List<Curso> cursos = new ArrayList<>();
// private Scanner scan;
    private void darDeAltaCurso() {

        System.out.println("¿Quieres que sea Bachiller (1) o FP (2)?");
        int opc = scan.nextInt();
        scan.nextLine();

        System.out.print("Nombre del curso: ");
        String nombreCurso = scan.nextLine();

        System.out.print("Codigo del curso: ");
        String codigoCurso = scan.nextLine();

        List<Asignatura> asignaturas = new ArrayList<>();
        //Curso curso = null;

        switch (opc) {
            case 1:
                System.out.print("Tipo de Bachiller (Primero/Segundo): ");
                String tipoBach = scan.nextLine();

                Bachiller b1 = new Bachiller(tipoBach, nombreCurso, asignaturas, codigoCurso);

                System.out.print("¿Cuántas asignaturas quieres meter? ");
                int num1 = scan.nextInt();
                scan.nextLine();

                b1.agregarAsignatura(scan, num1);

                listaCursos.meteCurso(b1);
                System.out.println("Bachiller dado de alta: " + nombreCurso + " (" + tipoBach + ")");
                break;

            case 2:
                System.out.print("Especialidad FP (Informatica, Mecanica, etc.): ");
                String especialidadFP = scan.nextLine();

                FP fp = new FP(especialidadFP, nombreCurso, asignaturas, codigoCurso);

                System.out.print("¿Cuántas asignaturas quieres meter? ");
                int num2 = scan.nextInt();
                scan.nextLine(); // limpia el \n

                // pasa el MISMO scanner
                fp.agregarAsignatura(scan, num2);

                listaCursos.meteCurso(fp);
                System.out.println("FP dado de alta: " + nombreCurso + " (" + especialidadFP + ")");
                break;

            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }

}
