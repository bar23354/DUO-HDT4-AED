/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/


public interface List<T> {
    void add(T element);
    void remove(int index);
    T get(int index);
    int size();
}

