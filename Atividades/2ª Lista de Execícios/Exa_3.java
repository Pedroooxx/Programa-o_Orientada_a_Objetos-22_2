//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*a.3)_Crie um programa que imprima a frase “Meu nome é: ” que através de
parâmetros passados durante a chamada (interpretação: java ...) do
programa, imprima na tela esta frase + o nome passado.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exa_3 {

    public static void main(String arg[]) {

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String nome = "";
        
        System.out.println("Seu nome é: ");
         
            try{

                nome = cd.readLine();
            }
            catch(IOException e){
                System.out.println("erro");
            }
        System.out.println("Seu nome é: " +nome);
    }

}