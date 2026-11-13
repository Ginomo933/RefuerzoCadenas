import java.util.Arrays;

public class Ejercicio5 {
    static void main() {
        int numerito[] = {1,2,6,20,18,2,2,46,31,20};
        Arrays.sort(numerito);

        mediana(numerito);
    }

    public static double mediana(int numerito[]){
            double mediana = 0;

            if (numerito.length % 2 == 0){
                mediana =(numerito[numerito.length/2] +  numerito[numerito.length/2 - 1]) / 2;
                System.out.println(mediana);
            }else{
                mediana = numerito[numerito.length / 2];
                System.out.println(mediana);
            }

            return mediana;
    }
}
