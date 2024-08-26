/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;
import java.util.Scanner;
/**
 *
 * @author maria alejandra
 */
public class Parcial {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra= new Scanner(System.in);
        System.out.println("digite el ultimo numero de cedula de cada uno de los 15 alumnos");
        int digitocedula[]= new int [15];
        
        for (int a=0; a<15 ;a++){
            digitocedula[a]=entra.nextInt();
        } 
        
        modelos entrada=new modelos(digitocedula);
        
        entrada.modelo1();
        entrada.modelo2();
        entrada.modelo3();
        entrada.modelo4();
        entrada.modelo5();
        
        int modelo1=entrada.model1();
        int modelo2=entrada.model2();
        int modelo3=entrada.model3();
        int modelo4=entrada.model4();
        int modelo5=entrada.model5();
        
        System.out.println("la cantidad de estudiantes para el modelo 1 es: " +modelo1);
        System.out.println("la cantidad de estudiantes para el modelo 2 es: " +modelo2);
        System.out.println("la cantidad de estudiantes para el modelo 3 es: " +modelo3);
        System.out.println("la cantidad de estudiantes para el modelo 4 es: " +modelo4);
        System.out.println("la cantidad de estudiantes para el modelo 5 es: " +modelo5);
    }
}
    
    
