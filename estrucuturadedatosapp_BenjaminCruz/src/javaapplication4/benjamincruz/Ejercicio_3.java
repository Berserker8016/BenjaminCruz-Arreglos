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
public class Ejercicio_3 {
public static void main(String[] args) {

Scanner sn=new Scanner(System.in);

//Pido una longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();

//Creo el arreglo con esa longitud
int numeros[]=new int[longitud];

int num;

//Recorro el array
for(int i=0;i<numeros.length;i++){

System.out.println("Inserte un número en la posicion "+i);

do{
//pido el numero en una posicion especifica
num=sn.nextInt();

if(!(num>=0 && num<=10)){
System.out.println("Error. Solo números del 0 al 10. "
+ "Inserte un número en la posicion "+i);
}

}while(!(num>=0 && num<=10));

//asigno, ya que sé que el número es correcto
numeros[i]=num;

}

//Esta parte es opcional para que se vea lo que hemos insertado
System.out.println("Estos son los números elegidos por el usuario");
for(int i=0;i<numeros.length;i++){
System.out.println(numeros[i]);
}

}

}

