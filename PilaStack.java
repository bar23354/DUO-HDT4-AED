/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

public interface PilaStack<T> {
    void push(T elemento);
    T pop();
    T peek();
    boolean estaVacia();
    int tamano();
}
