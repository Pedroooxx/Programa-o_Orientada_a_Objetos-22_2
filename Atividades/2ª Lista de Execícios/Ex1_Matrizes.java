//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*1)_ Crie um programa, no qual terá um vetor de inteiros, cujo tamanho
será definido pelo valor de uma variável local, que permita ao usuário
entrar com os valores. Depois, estes valores serão apresentados na ordem
inversa à da entrada.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex1_Matrizes {
    public static void main(String arg[]) {

    int t = 10, cont, vetor[];
    vetor = new int[t];
    String resp = "";

    InputStreamReader tec = new InputStreamReader(System.in);  
    BufferedReader buff = new BufferedReader(tec);
    
        for(cont = 0; cont < t; cont ++){

            System.out.println("Digite o " + (cont+1) + "º numero: ");
            System.out.printf("--> ");

            try{
                resp = buff.readLine();
            }
            catch(IOException ioe){
            System.out.println("\nERRO 404!");
            }

            vetor[cont] = Integer.parseInt(resp);
        }
        for(cont = 9; cont >= 0; cont --){

            System.out.println("\t\n"  + vetor[cont]);
        }
    }
}