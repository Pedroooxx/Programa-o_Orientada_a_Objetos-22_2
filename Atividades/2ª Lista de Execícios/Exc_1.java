//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*c.1)_ Usando o laço “for”, construa um programa que ao invés de incrementar
a variável “a” até que atinja o valor de da variável “b”, faça o inverso,
decremente “b” até que achegue ao valor de “a”.*/

public class Exc_1 {
    public static void main(String arg[]){
        
        int a = 0;
        int b = 10;

        System.out.println("\nO Valor de A é: " + b);

        for(b = 10; b >= a; b--){

            System.out.println("\nO Valor de A dentro do FOR é: " + b);
        }
    }
} 