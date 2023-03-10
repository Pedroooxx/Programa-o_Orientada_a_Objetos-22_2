//Nome: Pedro de Oliveira Machado -  RA: 2417855

/*b.1)_ Implemente as outras operações matemática “simples” a saber Multiplicação
(*), divisão (/) e subtração (-), sendo com primeiro termo da operação a variável
“a” e o segundo termo a variável “b”, imprimindo seu resultado a cada operação.*/

public class Exb_1 {
    public static void main(String arg[]){

        System.out.println("Impressão de Resultado de Cálculos:");
        
        System.out.println(" ");

        float a = 3, b = 2;
        
        float c=a+b;
        System.out.println("O resultado da soma de A e B é:" + c);

        c = a - b;
        System.out.println("\nO resultado da subtracao de A e B é:" + c);

        c =a * b;
        System.out.println("\nO resultado da multilicacao de A e B é:" + c);

        float d = a / b;
        System.out.println("\nO resultado da divisao de A e B é:" + d + "\n");
    }
}
    