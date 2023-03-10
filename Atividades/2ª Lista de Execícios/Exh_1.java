//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*h1)_ Utilizando a Linguagem de programação Java, implemente um programa que permita
a entrada de um valor inteiro e informe se este valor é “par” ou “ímpar”.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exh_1{
    public static void main(String arg[]) {

        String resp = "";
        int num;

InputStreamReader tec = new InputStreamReader(System.in);    
BufferedReader buff = new BufferedReader(tec);

        //Capturando valor

        System.out.println("Digite um numero: ");
        System.out.printf("--> ");
        
        try{
            resp = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\nERRO 404!");
        }
        
        num = Integer.parseInt(resp);

        if(num % 2 == 0){
            System.out.printf(num + " é par.");
        }
        else{
            System.out.printf(num + " é impar.");
        }


    }
}