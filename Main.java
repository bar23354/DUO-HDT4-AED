/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
 * @description clase principal, que lee el archivi "datos"
 * @date creación 24/02/2023 última modificación 27/02/2023
 */

 import java.io.*;
 
 public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            String expresion = reader.readLine();
            reader.close();

            PilaStack<String> pila = Factory.createStack("ArrayList", expresion);
            Lista<String> lista = Factory.createList("SimplementeEncadenada");

            Calculadora calculadora = Calculadora.getInstance();
            int resultado = calculadora.evaluarInfix(expresion);
            System.out.println("Resultado: " + resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}