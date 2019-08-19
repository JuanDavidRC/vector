/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.vector;

import java.util.Scanner;

/**
 *
 * @author JUAN DAVID REYES CORTES
 * @version 1.0.0
 */
public class Arreglo {
     Scanner entrada = new Scanner(System.in);
       private  int tamano=100;//variable que tiene el tamno del vector que recibe datos
       private  int valores[];//vector que recibe los datos
       private  int auxiliar;//contenedora para  metodo burbuja
       private  int i,j,k;//iteradores 
       int opcion  ;//variable para continuar ingresando o no
       private int vectorAux [];//vector auxiliar para compara datos que no se repitan 
       private int reemplazo [];//vector al que se le envia los datos sin repetir que se mostraran
       private int cont1,contenedor,cont2=0 ;//contadores y contenedor para intercambios
       int vector[] = new int [100];//vector con el que se compara para hallar numeros faltantes
       
       /**
        * metodo que recibe datos  y permite al usuario
        * ingresar hasta que lo desee
        */
      public void recibirDatos(){
            valores = new int [tamano];//vector en el que se almacenan los datos
            
            System.out.println("Este prograga calcula los numeros faltantes desee hasta  100\n "
                    + "y no muestra los valores repetidos ");
           do{
                
           i++;
            
            System.out.println((i)+". Digite un valor");//inicia desde la posicion 1
            valores[i]=entrada.nextInt();//guarda 
            System.out.println("Para ingresar mas valores digite 1.\npara salir digite 2. ");
            opcion= entrada.nextInt();
           }while (opcion == 1);// pedira datos hasta que no se cumpla la condicion
        }
      /**
       * creacion del vector con el que se compara con el 
       * que dijita el usuario para  decir que
       * valores faltan
       */
      public void vectorComparar(){
  
          for(int i=0;i<100;i++){
           vector[i]=i;

        }
      }
      /**
       * metodo vacio que evalua y dice cuales son los numeros faltantes
       */
    public  void hallarNumeros() {
 
        for (int i = 0; i < vector.length; i++) {//recorre el vector con todos numeros 
            boolean estaNumero = true;//numero faltante
            for (int j = 0; j < valores.length; j++) {//recorre el vetor con datos que ingreso
                if (valores[j] == vector[i]) {//compara hata que no este el numero
                    estaNumero = false;
                }
            }
            if (estaNumero) {
                System.out.println("Falto el: " + vector[i]);//impresion de los numeros faltantes
            }
        }
    }
    /**
         * metodo burbuja que musetra los datos ordenados
         * e imprime el dato mayor y menor
         */
    public void mayorMenor(){
           for( i=0;i<(tamano-1);i++){//
               for(int j=0;j<tamano-1;j++){
                   if(valores[j]>valores[j+1]){
                    auxiliar= valores[j];
                    valores[j]= valores[j+1];
                    valores[j+1]= auxiliar;
                   }
                }
            }
              
        }
        /**
         * este metodo compara el vector que tiene los datos con un vector auxuliar
         * intercambia y guarda los datos que no se repitan y ese es el vector que se mostrara
         */
        public void mostrarDatos(){
             vectorAux = new int [100];//tamño hasta el que tendra y compara 
             reemplazo = new int [100];//tamño hasta el que tendra y compara 
             for (i=0;i<valores.length;i++) {
                cont1=0;
                contenedor=valores[i]; // envia datos del vector valor a auxiliar
                vectorAux[j]=contenedor;
                j++;
                for (k=0;k<valores.length;k++)
                        if ( vectorAux[k] == contenedor ) //evalua para enviar al vector que se mostrara sin numeros repetidos
                                cont1++;
                if ( cont1 == 1 ) {
                        reemplazo[cont2]=contenedor;//cambia y guarde en el vector que se muestra 
                        cont2++;
                }
            }
            System.out.println("Los numeros que ingreso son: \n");
            for (i=0;i<cont2;i++){
                System.out.println(" \n "+reemplazo[i]);//imprime vector con datos ordenados y sin repetise 
            }    
             System.out.println("\nel dato mayor es :"+valores[tamano-1]);//toma la ultima posicion la imprime como la mayor
             System.out.println("el dato menor es :"+valores[0]);//toma la primer posiscion y la deja como la menor
        }
        
        
}
