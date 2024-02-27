/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

public class PilaLista<T> extends AbstractPila<T> {
    private Lista<T> elementos;

    public PilaLista(Lista<T> lista) {
        this.elementos = lista;
    }

    @Override
    public void push(T elemento) {
        elementos.agregar(elemento);
    }

    @Override
    public T pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return elementos.remover(elementos.tamano() - 1);
    }

    @Override
    public T peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return elementos.obtener(elementos.tamano() - 1);
    }

    @Override
    public boolean estaVacia() {
        return elementos.estaVacia();
    }

    @Override
    public int tamano() {
        return elementos.tamano();
    }
}
