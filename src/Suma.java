/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dekuw
 */
public class Suma {
    public static void main(String[]args){
     try (Scanner input = new Scanner(System.in)) {
      System.out.println("Hola querido usuario, para empezar coloca tu nombre");
       String Name =input.nextLine();
       System.out.println("Hola "+ Name+" este programa esta hecho para realisar una suma con dos numeros que escojas, por favor dime el primer numero");
       String Num1=input.nextLine();
       double num1=Double.parseDouble(Num1);
       System.out.println("Ahora dame el segundo numero por favor");
       String Num2=input.nextLine();
       double num2=Double.parseDouble(Num2);
       double suma= num1+num2;
       System.out.println("La suma de los dos numeros que colocaste es de:"+suma);
    } catch (NumberFormatException e) {
      
      e.printStackTrace();
    }
     System.out.println("Gracias por utilizar este programa" );
     
       
  }   
}
