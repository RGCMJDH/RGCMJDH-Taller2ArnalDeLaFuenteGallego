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

    // Atributos nom, dni, asignaturasMatriculadas
    private String nom;
    private String dni;
    private Asignatura[] asignaturasMatriculadas;

    public Estudiante(String nom, String dni, Asignatura[] asignaturasMatriculadas) {
        this.nom = nom;
        this.dni = dni;
        this.asignaturasMatriculadas = asignaturasMatriculadas;
    }

    @Override
    public String toString() {
        String res = "Estudiante{nom=" + nom + ", dni=" + dni + ", asignaturasMatriculadas=[";

        if (asignaturasMatriculadas != null) {
            boolean primero = true;
            for (int i = 0; i < asignaturasMatriculadas.length; i++) {
                Asignatura a = asignaturasMatriculadas[i];
                if (a != null) {
                    if (!primero) {
                        res += ", ";
                    }
                    res += a.getNombreAsignatura() + " (" + a.getCodigoAsignatura() + ")";
                    primero = false;
                }
            }
        }

        res += "]}";
        return res;
    }

    public void borrarMatriculada(String nombreAsignatura, String codigoAsignatura) {
        String buscado = nombreAsignatura + " " + codigoAsignatura;

        for (int i = 0; i < asignaturasMatriculadas.length; i++) {
            if (asignaturasMatriculadas[i].equals(buscado)) {

                // Desplazar todo a la izquierda desde i
                for (int j = i; j < asignaturasMatriculadas.length - 1; j++) {
                    asignaturasMatriculadas[j] = asignaturasMatriculadas[j + 1];
                }

                // Vaciar la última posición
                asignaturasMatriculadas[asignaturasMatriculadas.length - 1] = null;
                break; // ya lo hemos borrado, salimos
            }
        }
    }

    // Procedimientos
    void matricularEnAsignatura(Asignatura a) {
        // añade la asignatura a su lista de matriculación.
    }

    void listarAsignaturas() {
        // muestra todas las asignaturas en las que está matriculado, indicando el tipo y curso al que pertenecen.
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAsignaturasMatriculadas(Asignatura[] asignaturasMatriculadas) {
        this.asignaturasMatriculadas = asignaturasMatriculadas;
    }

}
