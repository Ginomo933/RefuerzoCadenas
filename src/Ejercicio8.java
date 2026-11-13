import java.util.Arrays;

public class Ejercicio8 {
    static void main() {
        int[] numeros = {2,1,4,3,6};


        cualFalta(numeros);
    }

        public static int cualFalta(int[] numeros){
            int falta = -1;
            Arrays.sort(numeros);

            for (int i = 0 ; i < numeros.length -1 ; i++) {
                if (numeros[i + 1] - numeros[i] != 1) {
                    falta = numeros[i + 1];
                    return numeros[i] + 1;
                }
            }
            return falta -1;
        }
}
