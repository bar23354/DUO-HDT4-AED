/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
 * @description clase principal, que lee el archivi "datos"
 * @date creación 24/02/2023 última modificación 27/02/2023
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<?> stack = Factory.createStack();
        List<?> list = Factory.createList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            String expression = reader.readLine();
            reader.close();
            String postfixExpression = convertInfixToPostfix(expression);
            int result = evaluatePostfixExpression(postfixExpression, stack);
            System.out.println("Resultado: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertInfixToPostfix(String expression) {
        Stack<Character> operators = new VectorStack<>();
        StringBuilder postfixExpression = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if (Character.isDigit(character)) {
                postfixExpression.append(character);
            } else if (character == '(') {
                operators.push(character);
            } else if (character == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    postfixExpression.append(operators.pop());
                }
                operators.pop();
            } else {
                while (!operators.isEmpty() && precedence(character) <= precedence(operators.peek())) {
                    postfixExpression.append(operators.pop());
                }
                operators.push(character);
            }
        }

        while (!operators.isEmpty()) {
            postfixExpression.append(operators.pop());
        }

        return postfixExpression.toString();
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    //Reconoce los operadores 
    private static int evaluatePostfixExpression(String postfixExpression, Stack<?> stack) {
        Stack<Integer> operandStack = new VectorStack<>();
        for (int i = 0; i < postfixExpression.length(); i++) {
            char character = postfixExpression.charAt(i);
            if (Character.isDigit(character)) {
                operandStack.push(Character.getNumericValue(character));
            } else {
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                switch (character) {
                    case '+':
                        operandStack.push(operand1 + operand2);
                        break;
                    case '-':
                        operandStack.push(operand1 - operand2);
                        break;
                    case '*':
                        operandStack.push(operand1 * operand2);
                        break;
                    case '/':
                        operandStack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Error en: " + character);
                }
            }
        }
        return operandStack.pop();
    }
}
