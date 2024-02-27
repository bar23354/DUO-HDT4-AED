import java.util.*;

public class Factory {
    public static <T> Stack<T> createStack(String tipo) {
        switch (tipo) {
            case "ArrayList":
                return new StackArrayList<T>();
            case "Vector":
                return new StackVector<T>();
            case "Lista":
                return new StackLista<T>();
            default:
                return null;
        }
    }

    public static <T> List<T> createList(String tipo) {
        switch (tipo) {
            case "SimplementeEncadenada":
                return new ListaSimplementeEncadenada<T>();
            case "DoblementeEncadenada":
                return new ListaDoblementeEncadenada<T>();
            default:
                return null;
        }
    }
}
