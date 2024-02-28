/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 40
 * @author Roberto José Barreda Siekavizza, 23354
 * @author Mia Alejandra Fuentes Merida, 23775
*/

//Interacción con el usuario

import java.util.Scanner;


public class Factory {
    
    public static Stack<?> createStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la implementación de la Pila:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return new ArrayListStack<>();
            case 2:
                return new VectorStack<>();
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }
    
    public static List<?> createList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la implementación de la Lista:");
        System.out.println("1. Simplemente encadenada");
        System.out.println("2. Doblemente encadenada");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return new SinglyLinkedList<>();
            case 2:
                return new DoublyLinkedList<>();
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }
}