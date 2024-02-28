/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

//Pila

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
