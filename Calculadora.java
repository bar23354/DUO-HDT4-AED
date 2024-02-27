public class Calculadora {
    private static Calculadora instance;
    private Stack<String> stack; 

    private Calculadora() {
        stack = new Stack<>();
    }

    public static Calculadora getInstance() {
        if (instance == null) {
            instance = new Calculadora();
        }
        return instance;
    }

    // Método para evaluar una expresión postfix
    public int evaluarPostfix(String expresion) {
        // agregar algoritmo
        return 0;
    }

    // Método para convertir una expresión infix a postfix
    public String infixToPostfix(String expresion) {
        // Iagrgar algoritmo
        return "";
    }

    // Método para evaluar una expresión infix
    public int evaluarInfix(String expresion) {
        String postfix = infixToPostfix(expresion);
        return evaluarPostfix(postfix);
    }
}
