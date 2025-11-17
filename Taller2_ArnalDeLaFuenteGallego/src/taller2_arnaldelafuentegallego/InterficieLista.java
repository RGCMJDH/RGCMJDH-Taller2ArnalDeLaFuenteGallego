/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_arnaldelafuentegallego;

/**
 *
 * @author alber
 */
abstract interface InterficieLista {

    abstract void meteCurso(Curso c);

    abstract void imprimeCursos();

    abstract Curso eliminaCursos(int numSelec, int modo);
    
    abstract void imprimeNombreCursos();
    
    abstract void imprimeAsignaturasCurso(Curso c);
}
