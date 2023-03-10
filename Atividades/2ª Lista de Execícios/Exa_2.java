//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*a.2)_Crie um programa que imprima todos os seus dados cadastrais*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exa_2 {

    public static void main(String arg[]) {

        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);
        String nome = "";
        String idade = "";
        String ra = "";
        
        
        System.out.println("Seu nome é: ");
         
            try{

                nome = cd.readLine();
            }
            catch(IOException e){
                System.out.println("erro no nome");
            }
            
        System.out.println("Sua idade é: ");

            try{

                idade = cd.readLine();
         }
            catch(IOException e){
                System.out.println("erro na idade");
            }

            System.out.println("Seu RA é: ");

            try{

                ra = cd.readLine();
         }
            catch(IOException e){
                System.out.println("erro no ra");
            }
                
        System.out.println("Seu nome é: "+nome);
        System.out.println("Sua idade é: "+idade);
        System.out.println("Seu RA é: "+ra);
    }
}