/*//Josselin Lanza // 202110020022
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2.poo;

class Recursos {

    // Primer metodo: Retorna un mensaje de bienvenida
    public String mensajeBienvenida() {
        return "Programación Orientada a Objetos";
    }

    // Segundo metodo: Retorna un mensaje dependiendo de la edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer metodo: Retorna el resultado de una multiplicación
    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    // Cuarto método: Retorna una lista de números del 1 al X
    public int[] listaNumeros(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}

public class Main {
    public static void main(String[] args) {
        // Instanciación de la clase Recursos
        Recursos recursos = new Recursos();

        // Llamada a los métodos de la clase Recursos
        System.out.println(recursos.mensajeBienvenida());
        System.out.println(recursos.verificarEdad(21));
        System.out.println("El resultado de la multiplicacion es: " + recursos.multiplicar(2, 10));

        // Llamada al cuarto método y muestra de la lista de números
        int[] lista = recursos.listaNumeros(20);
        System.out.print("Lista de numeros del 1 al 20: ");
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
    }
}