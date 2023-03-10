//Nome: Pedro de Oliveira Machado -  RA: 2417855

/* Pesquisa e aplicação das Classes Wrappers */

import java.util.*;
import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Importações necessarias para a conversão de string para bytes a baixo */

public class Wrappers2{
    public static void main(String arg[]) {

        boolean x = true;

        String resp = "";
        int opcao;

        while(x){

            /* Uso de while para a criação do menu do usuario */

            System.out.println("\n*********MENU**********\n");
            System.out.println("USO DE CLASSES WRAPPERS\n");
            System.out.println("1 Integer**************\n");
            System.out.println("2 Boolean**************\n");
            System.out.println("3 Character************\n");
            System.out.println("4 Double***************\n");
            System.out.println("5 Byte*****************\n");
            System.out.println("6 Short****************\n");
            System.out.println("7 Float****************\n");
            System.out.println("8 Long*****************\n");
            System.out.println("0 ******- SAIR -*******\n");

            System.out.println("\nEscolha uma operação: ");
            System.out.printf("--> ");

    /* Configuração da leitura do teclado */
    
    InputStreamReader tec = new InputStreamReader(System.in);    
    BufferedReader buff = new BufferedReader(tec);

            try{
                resp = buff.readLine();
            }
            catch(IOException ioe){
                System.out.println("\nERRO 404!");
            }

            opcao = Integer.parseInt(resp);

            switch(opcao){

                /* Uso de Switch Case para receber o valor dado pelo usuario e selecionar a operação */

                case 1:{
                    System.out.printf("\nUtilização da Wrapper Integer");
                    System.out.printf("\nResultado: " + cinteger() + "\n");
                    break;
                }
                case 2:{
                    System.out.printf("\nUtilização da Wrapper Boolean\n");
                    System.out.printf("Resultado: " + cboolean() + "\n");
                    break;
                }
                case 3:{
                    System.out.printf("\nUtilização da Wrapper Character\n");
                    System.out.printf("Resultado: " + ccharacter() + "\n");
                    break;
                }
                case 4:{
                    System.out.printf("\nUtilização da Wrapper Double\n");
                    System.out.printf("Resultado: " + cdouble() + "\n");
                    break;
                }
                case 5:{
                    System.out.printf("\nUtilização da Wrapper Byte\n");
                    cbyte();
                    break;
                }
                case 6:{
                    System.out.printf("\nUtilização da Wrapper Short\n");
                    System.out.printf("Resultado: " + cshort() + "\n");
                    break;
                }
                case 7:{
                    System.out.printf("\nUtilização da Wrapper Float\n");
                    System.out.printf("Resultado: " + cfloat() + "\n");
                    break;
                }
                case 8:{
                    System.out.printf("\nUtilização da Wrapper Long\n");
                    System.out.printf("Resultado: " + clong() + "\n");
                    break;
                }
                case 0:{
                    System.out.printf("Sair.");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("\nDeve-se escolher um valor entre 0 e 8");
                    break;
                }
            }
        }
    }

    public static int cinteger(){

    /* i) Classe Wrapper Integer - Método -> 'parseInt()' */
    /* ii) 'parseInt()' transforma um valor em String para um int */
    /* iii) 'https://www.freecodecamp.org/portuguese/news/da-string-ao-int-em-java-como-converter-uma-string-em-um-inteiro/'*/

        String x = "9";

        try{
            int num = Integer.parseInt(x);
            /*Após fazer a conversão retorno o valor '+ 1' provando a conversão de tipos */
            return num + 1;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return 0;
    }

    public static boolean cboolean(){
        
    /* i) Classe Wrapper Boolean - Método -> 'parseBoolean()' */
    /* ii) 'parseBoolean()' transforma algo em String para um Boolean */
    /* iii) 'https://acervolima.com/metodo-booleano-parseboolean-em-java-com-exemplos/'*/

        String x = "true";

        boolean boo = Boolean.parseBoolean(x);
        /*Se a string = 'true', string retorna boolean 'true', caso não, retorna boolean 'false' */
        /*Cabe mencionar que se 'true' possui ou não letras maiusculas, resultado não difere. Ex: 'True', 'TRUE', não alteram o resultado */
        return boo;
    }

    public static char ccharacter(){

        /* i) Classe Wrapper Character - Método -> 'forDigit()' */
        /* ii) 'forDigit()' transforma um numero do tipo int em um char */
        /* iii) 'https://www.techiedelight.com/pt/conversion-between-char-and-int-java/'*/

        int x = 5;
 
        char c = Character.forDigit(x, 10);
    
        return c;
    }

    public static double cdouble(){

        /* i) Classe Wrapper Double - Método -> 'parseDouble()' */
        /* ii) 'parseDouble()' transforma um algo do tipo string em um double */
        /* iii) 'https://www.guj.com.br/t/o-que-e-double-e-parsedouble/24355/3'*/

        String str = "50";

        double doub = Double.parseDouble(str);

        return doub;
    }

    public static void cbyte(){
        
        /* i) Classe Wrapper Byte - Método -> 'getBytes()' */
        /* ii) 'getBytes()' transforma uma string em um byte */
        /* iii) 'https://acervolima.com/converter-string-em-matriz-de-bytes-em-java-usando-o-metodo-getbytes-codificacao/'*/

        try {

            String str = "Fr";

            byte[] bte = str.getBytes("UTF-16");

            System.out.println("Resultado: " + Arrays.toString(bte));

        }
        catch (UnsupportedEncodingException erro) {
            System.out.println("Unsupported cahrset :" + erro);
        }
    }

    public static short cshort(){

        /* i) Classe Wrapper Short - Método -> 'parseShort()' */
        /* ii) 'parseShort()' transforma uma string em um short */
        /* iii) 'https://acervolima.com/converter-string-em-matriz-de-bytes-em-java-usando-o-metodo-getbytes-codificacao/'*/
        
        String num = "25";

        short shrt = Short.parseShort(num);   

        return shrt;
    }

    public static float cfloat(){

        /* i) Classe Wrapper Float - Método -> 'parseFloat()' */
        /* ii) 'parseFloat()' transforma uma string em um float */
        /* iii) 'https://www.geeksforgeeks.org/float-parsefloat-method-in-java-with-examples/'*/

        String str = "20";

        float flt = Float.parseFloat(str);

        return flt;
    }

    public static long clong(){
        
        /* i) Classe Wrapper Long - Método -> 'parseLong()' */
        /* ii) 'parseLong()' transforma uma string em um long */
        /* iii) 'https://www.geeksforgeeks.org/java-program-to-convert-string-to-long/#:~:text=There%20are%20many%20methods%20for,Using%20constructor%20of%20Long%20class'*/

        String str = "100000000";
 
        long lng = Long.parseLong(str);

        return lng;
    }
}