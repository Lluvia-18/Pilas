
import java.util.EmptyStackException;

// Interface Pila
// autor: Lluvia Villanueva
// fecha:29 de octubre de 2026


public class PilaArreglo<T> implements IPila<T> {

    private T[] datos;
    private int tope;

    @SuppressWarnings("unchecked")
    public PilaArreglo() {
        datos = (T[]) new Object[5];
        tope = 0;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pila vacía");
        }

        tope--;
        T dato = datos[tope];
        datos[tope] = null;

        return dato;
    }

    @Override
    public void push(T dato) {
        datos[tope] = dato;
        tope++;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Pila vacía");
        }

        return datos[tope - 1];
    }

    @Override
    public boolean isEmpty() {
        return tope == 0;
    }

    public static void main(String[] args) {
    IPila<Integer> pila = new PilaArreglo<>();

    pila.push(10);
    pila.push(20);
    pila.push(30);

    System.out.println(pila.peek());

    pila.pop();
    System.out.println(pila.peek());

    pila.pop();
    pila.pop();

    System.out.println(pila.isEmpty());
}
}