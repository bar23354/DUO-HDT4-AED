/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

import java.util.ArrayList;

public class PilaArrayList<T> extends AbstractPila<T> {
    private ArrayList<T> elementos;

    public PilaArrayList() {
        elementos = new ArrayList<>();
    }

    @Override
    public void push(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public T peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return elementos.get(elementos.size() - 1);
    }

    @Override
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    @Override
    public int tamano() {
        return elementos.size();
    }
}