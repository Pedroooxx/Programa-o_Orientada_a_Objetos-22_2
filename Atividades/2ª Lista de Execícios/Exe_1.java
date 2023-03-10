//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*e.1)_ Da mesma forma que implementou o exercício c.1,
implemente o e.1 usando a estrutura de repetição “do..while*/

public class Exe_1 {
    public static void main(String arg[]){
        
        int a = 0;
        int b = 10;

        System.out.println("\nO Valor de B é: " + b);

        do{
            b--;

            System.out.println("\nO Valor de B dentro do DO.WHILE é: " + b);

        }while(b > a);
    }
}