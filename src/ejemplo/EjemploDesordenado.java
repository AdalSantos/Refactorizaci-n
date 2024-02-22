package ejemplo;
import java.util.ArrayList;
import java.util.List;
public class EjemploDesordenado {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(10);
        
        int sumar = 0;
        int cantidad = 0;
        
        for (Integer numero : numeros) {
            sumar = sumar + numero;
            cantidad++;
        }
        double promedio = (double) sumar / cantidad;
        if (promedio >= 7) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println("Lo siento, has reprobado.");
        }
        System.out.println("El promedio final es: " + promedio);
    }
}