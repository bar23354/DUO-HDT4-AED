/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

import java.util.Stack;

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
        // Agregar algoritmo de evaluación postfix
        return 0;  // Reemplazar con la lógica adecuada
    }

    // Método para convertir una expresión infix a postfix
    public String infixToPostfix(String expresion) {
        // Agregar algoritmo de conversión infix a postfix
        return "";  // Reemplazar con la lógica adecuada
    }

    // Método para evaluar una expresión infix
    public int evaluarInfix(String expresion) {
        String postfix = infixToPostfix(expresion);
        return evaluarPostfix(postfix);
    }
}
