//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*2)_ Faça o mesmo procedimento do exercício anterior, porém desta
vez estará usando uma matriz bidimensional.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex2_Matrizes {
    public static void main(String arg[]) {

    int t = 2, contlinha = 0, contcoluna = 0, matriz[][];
    matriz = new int[t][t];
    String resp = "";

    InputStreamReader tec = new InputStreamReader(System.in);    
    BufferedReader buff = new BufferedReader(tec);
    
        for(contlinha = 0; contlinha < t; contlinha++){

            for(contcoluna = 0; contcoluna < t; contcoluna++){

            System.out.println("Digite o " + (contlinha + 1) + "º numero da linha " + (contcoluna + 1));
            System.out.printf("--> ");
                
            try{
                resp = buff.readLine();
            }
            catch(IOException ioe){
            System.out.println("\nERRO 404!");
            }
    
            matriz[contlinha][contcoluna] = Integer.parseInt(resp);  
            }
        }

        System.out.printf("\n");

        for(contlinha = 1; contlinha >= 0; contlinha--){

            for(contcoluna = 1; contcoluna >= 0; contcoluna--){

            System.out.printf("Elemento " + (contlinha + 1) + "º numero da coluna " + (contcoluna + 1));
            System.out.printf("\n-->" +  matriz[contlinha][contcoluna] + "\n");
            }
        }
    }
}