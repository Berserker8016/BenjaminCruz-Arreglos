/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4.benjamincruz;

import java.util.Scanner;

/**
 *
 * @author Benjamín Cruz
 */
public class Ejercicio_4 {
public static void main(String[] args) {

Scanner sn=new Scanner(System.in);

//Pedimos una longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();

//creo un array con esa longitud
int numeros[]=new int[longitud];

//recorro el arreglo y uso la funcion para crear un aleatorio
for(int i=0;i<numeros.length;i++){
numeros[i]=generaNumeroAleatorio(0,10);
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]);
}

}

//Crea un numero aleatorio, entre un minimo y un maximo
public static int generaNumeroAleatorio(int minimo, int maximo){

return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

}

}
