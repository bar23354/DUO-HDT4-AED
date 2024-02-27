/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

public class Factory {
    public static <T> PilaStack<T> createStack(String tipoPila, String tipoLista) {
        switch (tipoPila) {
            case "ArrayList":
                return new PilaArrayList<T>();
            case "Vector":
                return new PilaVector<T>();
            case "Lista":
                return new PilaLista<T>(createList(tipoLista));
            default:
                return null;
        }
    }

    public static <T> AbstractLista<T> createList(String tipo) {
        switch (tipo) {
            case "SimplementeEncadenada":
                return new ListaSE<T>();
            case "DoblementeEncadenada":
                return new ListaDE<T>();
            default:
                return null;
        }
    }
}



