/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

public class ListaSE<T> extends AbstractLista<T> {
    private Nodo<T> cabeza;

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    @Override
    public void agregar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    @Override
    public T remover(int indice) {
        if (indice < 0 || indice >= tamano()) {
            throw new IndexOutOfBoundsException("Indice fuera de límites.");
        }

        T resultado;
        if (indice == 0) {
            resultado = cabeza.dato;
            cabeza = cabeza.siguiente;
        } else {
            Nodo<T> temp = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                temp = temp.siguiente;
            }
            resultado = temp.siguiente.dato;
            temp.siguiente = temp.siguiente.siguiente;
        }

        return resultado;
    }

    @Override
    public T obtener(int indice) {
        if (indice < 0 || indice >= tamano()) {
            throw new IndexOutOfBoundsException("Índiice fuera de limites.");
        }

        Nodo<T> temp = cabeza;
        for (int i = 0; i < indice; i++) {
            temp = temp.siguiente;
        }

        return temp.dato;
    }

    @Override
    public int tamano() {
        int contador = 0;
        Nodo<T> temp = cabeza;
        while (temp != null) {
            contador++;
            temp = temp.siguiente;
        }
        return contador;
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }
}