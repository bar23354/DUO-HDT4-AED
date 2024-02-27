/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

public interface Lista<T> {
    void agregar(T elemento);
    T remover(int indice);
    T obtener(int indice);
    int tamano();
    boolean estaVacia();
}
