package Conceptos_Basicos.ejercicios;

public class Tema4_E3 {
    public static void main(String[] args) {

        String [] nombres = {"Pepe", "Luis", "Lola", "Rosana"};

        String contador = "";

        for (String nombre :nombres) {
            contador += nombre + " ";

        }

        System.out.println(contador);
    }
}
