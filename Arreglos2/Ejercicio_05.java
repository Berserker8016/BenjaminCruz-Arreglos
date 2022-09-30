/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Benjamin Cruz
 */

public class Ejercicio_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1={1,2,3,4,5};
        int[] array2=new int[array1.length];
        
        for(int i=(array1.length-1),j=0;i>=0;i--,j++){
            array2[j]=array1[i];
            System.out.println(array2[j]);
        }
    }
    
}
