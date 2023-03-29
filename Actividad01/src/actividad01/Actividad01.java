/**
 * Se tiene el nombre y la edad de tres personas. Se desea saber el nombre
 * y la edad de la persona de menor edad.
 * Realice el programa correspondiente.
 */
package actividad01;

public class Actividad01 {

    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;
        int edad1, edad2, edad3;

        nombre1 = "Juan";
        edad1 = 10;

        nombre2 = "Silvia";
        edad2 = 5;

        nombre3 = "Lautaro";
        edad3 = 17;

        if (edad1 < edad2 && edad1 < edad3) {
            System.out.println("Nombre: " + nombre1);
            System.out.println("Edad: " + edad1);
        } else {
            if (edad2 < edad1 && edad2 < edad3) {
                System.out.println("Nombre: " + nombre2);
                System.out.println("Edad: " + edad2);
            }else{
                System.out.println("Nombre: " + nombre3);
                System.out.println("Edad: " + edad3);
            }
        }

    }

}
