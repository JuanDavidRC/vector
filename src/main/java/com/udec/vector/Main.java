/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.vector;

/**
 * clase main 
 * @author JUAN DAVID REYES CORTES
 * @version 1.0.0
 */
public class Main {
    public static void main (String [] args){
       //objeto para llamar metodos
        Arreglo n = new Arreglo();
        //lamado de metodos
        n.recibirDatos();
        n.mayorMenor();
        n.mostrarDatos();
        n.vectorComparar();
        n.hallarNumeros();
    }
}
