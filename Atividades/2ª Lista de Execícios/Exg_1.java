//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*G1)_ Construa um programa que:
a)_ Permita o usuário entrar com 2 valores (que sejam armazenados em duas variáveis, por exemplo, “a” e “b”);
b)_ Apresente “menu de opções” com 4 opções:*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exg_1{
    public static void main(String arg[]) {

        boolean vai = true;
        int val1 = 0, val2 = 0, opcao = 0;
        String resp = "";

InputStreamReader tec = new InputStreamReader(System.in);    
BufferedReader buff = new BufferedReader(tec);

        //Capturando valor 1

        System.out.println("Informe o 1 valor: ");
        System.out.printf("--> ");
        try{
            resp = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\nERRO 404!");
        }
        
        val1 = Integer.parseInt(resp);

        // Fim valor 1 - Capturando o valor 2

        System.out.println("Informe o 2 valor: ");
        System.out.printf("--> ");
        try{
            resp = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\nERRO 404!");
        }
        
        val2 = Integer.parseInt(resp);

        // Fim valor 2

        while(vai){

            System.out.println("\n**********MENU**********\n");
            System.out.println("\n1 Somar\n");
            System.out.println("\n2 Subtrair\n");
            System.out.println("\n3 Dividir\n");
            System.out.println("\n4 Multiplicar\n");
            System.out.println("\n5 - SAIR -\n");

            System.out.println("\nEscolha uma operação: ");
            System.out.printf("--> ");

            try{
                resp = buff.readLine();
            }
            catch(IOException ioe){
                System.out.println("\nERRO 404!");
            }
            opcao = Integer.parseInt(resp);

            switch(opcao){

                case 1:{
                    System.out.printf("\nSomar");
                    System.out.printf("Resultado: " + somar(val1, val2));
                    break;
                }
                case 2:{
                    System.out.printf("Subtrair");
                    System.out.printf("Resultado: " + subtrair(val1, val2));
                    break;
                }
                case 3:{
                    System.out.printf("Dividir");
                    System.out.printf("Resultado: " + dividir(val1, val2));
                    break;
                }
                case 4:{
                    System.out.printf("Multiplicar");
                    System.out.printf("Resultado: " + multiplicar(val1, val2));
                    break;
                }
                case 5:{
                    System.out.printf("Sair.");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("\nDeve-se escolher um valor entre 1 e 5");
                    break;
                }
            }
        }
    }

    public static int somar(int a, int b){
        return (a+b);
    }
    public static int subtrair(int a, int b){
        return (a-b);
    }
    public static int dividir(int a, int b){
        return (a/b);
    }
    public static int multiplicar(int a, int b){
        return (a*b);
    }
}