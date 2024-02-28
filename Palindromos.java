import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String Entrada = scanner.nextLine();

        if (VerificarPalindromo(Entrada)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }

    public static boolean VerificarPalindromo(String Entrada) {
        Pilha pilha = new Pilha();

        for (int i = 0; i < Entrada.length(); i++) {
            pilha.push((int) Entrada.charAt(i));
        }

        for (int i = 0; i < Entrada.length(); i++) {
            if (pilha.pop() != (int) Entrada.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}