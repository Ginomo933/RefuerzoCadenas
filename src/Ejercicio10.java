import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        System.out.println(litros(3,100,10));
    }
    public static int litros(int n, int maxLitros, int diferencia){
        int litros = 0;
        int litrosActual = maxLitros;

        for (int i = 0; i < n; i++){
            litros += litrosActual;
            litrosActual -= diferencia;

        }
        return litros;
    }
}


