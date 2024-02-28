# Verificador de Palíndromo com Pilha em Java

<img style="width: 50px" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" />
          

Este é um programa simples em Java que verifica se uma string é um palíndromo. O programa utiliza uma pilha para inverter a string e depois compara os caracteres para determinar se é um palíndromo.

## Requisitos

- Java JDK instalado
- Editor de código (por exemplo, Visual Studio Code, IntelliJ IDEA)

## Como Executar

1. Clone o repositório ou baixe o arquivo `Palindromos.java`.
2. Abra o arquivo em um editor de código.
3. Compile o arquivo Java: `javac Palindromos.java`.
4. Execute o programa: `java Palindromos`.

## Implementação da Pilha

A pilha é implementada na classe `Pilha`, que utiliza um array de inteiros para armazenar os elementos. A pilha tem um tamanho máximo de 20 elementos.

A classe `Pilha` possui os seguintes métodos:

- `push(int value)`: Adiciona um elemento à pilha.
- `pop()`: Remove e retorna o elemento do topo da pilha.
- `isEmpty()`: Verifica se a pilha está vazia.

## Exemplo de Uso

```java
import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String entrada = scanner.nextLine();

        if (verificarPalindromo(entrada)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }

    public static boolean verificarPalindromo(String entrada) {
        Pilha pilha = new Pilha();

        for (int i = 0; i < entrada.length(); i++) {
            pilha.push((int) entrada.charAt(i));
        }

        for (int i = 0; i < entrada.length(); i++) {
            if (pilha.pop() != (int) entrada.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
