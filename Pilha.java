
public class Pilha {
    private int[] elementos;
    private int top;

    public Pilha() {
        elementos = new int[20]; // Tamanho máximo da pilha
        top = -1;
    }

    public void push(int value) {
        if (top < elementos.length - 1) {
            top++;
            elementos[top] = value;
        } else {
            System.out.println("A pilha está cheia.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        int value = elementos[top];
        top--;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
