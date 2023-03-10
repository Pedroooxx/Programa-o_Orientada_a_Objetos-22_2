//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*1)_ Construa um programa que permita ao usuário entrar com determinada frase,
depois peSrmita “escolher” uma letra qualquer e: caso a letra escolhida esteja
na frase (seja maiúscula ou minúscula) diga quantas vezes ela apareceu e em
que posição da frase. Senão, apareça uma frase informando que esta letra
não existe na frase.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_String {
    public static void main(String arg[]) {

        String frase = "";
        char letra;
        int cont;
        int quant = 0;

        InputStreamReader tec = new InputStreamReader(System.in);    
        BufferedReader buff = new BufferedReader(tec);

        //Capturando Frase

        System.out.println("Digite uma frase: ");
        System.out.printf("--> ");
        
        try{
            frase = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\nERRO 404!");
        }

        frase = frase.toLowerCase();

        //Capturando Letra
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\nDigite a letra que voce quer: ");
            System.out.printf("--> ");

            letra = scan.next().charAt(0);
        }

        letra = Character.toLowerCase(letra);  

        for (cont = 0; cont<frase.length(); cont++) {
            char l = frase.charAt(cont);

            if(letra == l){
                quant++;
                System.out.println("\nA letra " + letra + " aparece em coordenada " + cont);
                
            }
        }
        System.out.println("\nA letra " + letra + " aparece um total de " + quant + " vezes.\n");
    }
}