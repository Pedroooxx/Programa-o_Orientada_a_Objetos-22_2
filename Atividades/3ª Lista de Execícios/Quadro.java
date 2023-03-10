import java.util.Scanner;

public class Quadro {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please input a character: ");

            char value = scanner.next().charAt(0);

            System.out.println("Character: "+value);
        }

   }
}