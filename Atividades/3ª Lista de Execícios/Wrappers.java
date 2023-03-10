//Nome: Pedro de Oliveira Machado -  RA: 2417855

/* Pesquisa e aplicação das Classes Wrappers */

import java.util.*;
import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Importações necessarias para a conversão de string para bytes a baixo */

public class Wrappers{
    public static void main(String arg[]) {

        boolean x = true;

        String op;
        
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
            System.out.printf("\nEscolha uma operação: ");
            op = entDados("--> ");
            int opcao = Integer.parseInt(op);

            switch(opcao){

                /* Uso de Switch Case para receber o valor dado pelo usuario e selecionar a operação */

                case 1:{
                    System.out.printf("\nUtilização da Wrapper Integer\n");
                    System.out.printf("\nResultado: " + cinteger() + "\n");
                    break;
                }
                case 2:{
                    System.out.printf("\nUtilização da Wrapper Boolean\n");
                    System.out.printf("\nResultado: " + cboolean() + "\n");
                    break;
                }
                case 3:{
                    System.out.printf("\nUtilização da Wrapper Character\n");
                    System.out.printf("\nResultado: " + ccharacter() + "\n");
                    break;
                }
                case 4:{
                    System.out.printf("\nUtilização da Wrapper Double\n");
                    System.out.printf("\nResultado: " + cdouble() + "\n");
                    break;
                }
                case 5:{
                    System.out.printf("\nUtilização da Wrapper Byte\n");
                    cbyte();
                    break;
                }
                case 6:{
                    System.out.printf("\nUtilização da Wrapper Short\n");
                    System.out.printf("\nResultado: " + cshort() + "\n");
                    break;
                }
                case 7:{
                    System.out.printf("\nUtilização da Wrapper Float\n");
                    System.out.printf("\nResultado: " + cfloat() + "\n");
                    break;
                }
                case 8:{
                    System.out.printf("\nUtilização da Wrapper Long\n");
                    System.out.printf("\nResultado: " + clong() + "\n");
                    break;
                }
                case 0:{
                    System.out.printf("\nSair.");
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

    public static String entDados(String rotulo){

		System.out.printf(rotulo);

		InputStreamReader teclado =  new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String resp = "";

		try{
			resp = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\n== ERRO ==");
		}
		return resp;
	}

    public static int cinteger(){

    /* i) Classe Wrapper Integer - Método -> 'parseInt()' */
    /* ii) 'parseInt()' transforma um valor em String para um int */
    /* iii) 'https://www.freecodecamp.org/portuguese/news/da-string-ao-int-em-java-como-converter-uma-string-em-um-inteiro/'*/

        String str = entDados("Digite um numero: ");
        System.out.println("\nEle será recebido como uma String");
        System.out.println("então convertido para int e somado em 1.");
        int x = Integer.parseInt(str);

        return x + 1;
    }

    public static boolean cboolean(){
        
    /* i) Classe Wrapper Boolean - Método -> 'parseBoolean()' */
    /* ii) 'parseBoolean()' transforma algo em String para um Boolean */
    /* iii) 'https://acervolima.com/metodo-booleano-parseboolean-em-java-com-exemplos/'*/
        
        System.out.println("\nDigite uma String");
        System.out.println("\nEla será convertida em boolean");
        System.out.println("\ncaso tenha digitado 'true' retornara 'true'");
        System.out.println("\ncaso digite outra coisa, retornara 'false'.");
        String x = entDados("\nDigite: ");

        boolean boo = Boolean.parseBoolean(x);

        /*Cabe mencionar que se 'true' possui ou não letras maiusculas, resultado não difere. Ex: 'True', 'TRUE', não alteram o resultado */
        
        return boo;
    }

    public static char ccharacter(){

        /* i) Classe Wrapper Character - Método -> 'forDigit()' */
        /* ii) 'forDigit()' transforma um numero do tipo int em um char */
        /* iii) 'https://www.techiedelight.com/pt/conversion-between-char-and-int-java/'*/

        String str = entDados("\nDigite um numero: ");
        System.out.println("\nEle sera convertido de int para char");
        System.out.println("\ne apresentado novamente.");
        
        int x = Integer.parseInt(str);
 
        char c = Character.forDigit(x, 10);
    
        return c;
    }

    public static double cdouble(){

        /* i) Classe Wrapper Double - Método -> 'parseDouble()' */
        /* ii) 'parseDouble()' transforma um algo do tipo string em um double */
        /* iii) 'https://www.guj.com.br/t/o-que-e-double-e-parsedouble/24355/3'*/

        String str = entDados("\nDigite um numero: ");
        System.out.println("\nEle sera convertido de String para Double");
        System.out.println("\ne então subtraido em 1.");

        double doub = Double.parseDouble(str);

        return doub - 1;
    }

    public static void cbyte(){
        
        /* i) Classe Wrapper Byte - Método -> 'getBytes()' */
        /* ii) 'getBytes()' transforma uma string em um byte */
        /* iii) 'https://acervolima.com/converter-string-em-matriz-de-bytes-em-java-usando-o-metodo-getbytes-codificacao/'*/

        try {

            String str = entDados("\nDigite uma String: ");
            System.out.println("\nEle sera convertido de String para Byte");
            System.out.println("\ne então apresentado de volta.");

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

        String str = entDados("\nDigite um numero: ");
        System.out.println("\nEle sera convertido de String para Short");
        System.out.println("\ne então apresentado de volta.");

        short shrt = Short.parseShort(str);   

        return shrt;
    }

    public static float cfloat(){

        /* i) Classe Wrapper Float - Método -> 'parseFloat()' */
        /* ii) 'parseFloat()' transforma uma string em um float */
        /* iii) 'https://www.geeksforgeeks.org/float-parsefloat-method-in-java-with-examples/'*/

        String str = entDados("\nDigite um numero: ");
        System.out.println("\nEle sera convertido de String para Float");
        System.out.println("\nmultiplicado por 2 e então");
        System.out.println("\napresentado de volta.");

        float flt = Float.parseFloat(str);

        return flt * 2;
    }

    public static long clong(){
        
        /* i) Classe Wrapper Long - Método -> 'parseLong()' */
        /* ii) 'parseLong()' transforma uma string em um long */
        /* iii) 'https://www.geeksforgeeks.org/java-program-to-convert-string-to-long/#:~:text=There%20are%20many%20methods%20for,Using%20constructor%20of%20Long%20class'*/

        String str = entDados("\nDigite um numero: ");
        System.out.println("\nEle sera convertido de String para Long");
        System.out.println("\ndivido por 2 e então");
        System.out.println("\napresentado de volta.");
 
        long lng = Long.parseLong(str);

        return lng / 2;
    }
}