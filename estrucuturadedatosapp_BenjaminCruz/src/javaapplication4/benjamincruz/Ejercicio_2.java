/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4.benjamincruz;

/**
 *
 * @author Benjamín Cruz
 */
public class Ejercicio_2 {
public static void main(String[] args) {
//Creo un array
int[] numeros=new int[100];
//Declaro las variables necesarias
int suma=0;
double media;
//Recorro el arreglo, asigno números y sumo
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Calculo la media y muestro la suma y la media
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;
System.out.println("La media es "+media);
}
} 
