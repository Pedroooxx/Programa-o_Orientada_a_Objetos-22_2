//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*G1)_ Construa um programa que:
a)_ Permita o usuário entrar com 2 valores (que sejam armazenados em duas variáveis, por exemplo, “a” e “b”);
b)_ Apresente “menu de opções” com 4 opções:*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exf_1 {
    public static void main(String arg[]){
    
        int a = 0, b = 0;
        String resp = "";

InputStreamReader tec = new InputStreamReader(System.in);    
BufferedReader buff = new BufferedReader(tec);

        System.out.println("Informe o valor de A: ");
        System.out.printf("--> ");
        try{
            resp = buff.readLine();
        }
        catch(IOException ioe){
        System.out.println("\nERRO 404!");
        }

        a = Integer.parseInt(resp);

        System.out.println("Informe o valor de B: ");
        System.out.printf("--> ");
        try{
            resp = buff.readLine();
        }
        catch(IOException ioe){
        System.out.println("\nERRO 404!");
        }

        b = Integer.parseInt(resp);
            
        if( a == b){
   
            System.out.println("\nA é igual a B, logo A vale: " + a +" e B vale: " + b + "\n");
        }
        else if( a > b){
   
            System.out.println("\nA é maior que B, logo A vale: " + a +" e B vale: " + b + "\n");
        }
        else if( a < b){
            
            System.out.println("\nA é menor que B, logo A vale: " + a +" e B vale: " + b + "\n");
        }
    }
}