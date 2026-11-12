public class Ejercicio6 {
    static void main() {
        int numero = 2408;

        esHyperpar(numero);

    }
        public static boolean esHyperpar(int numero){
            boolean Hyperpar = false;
            for (int i = 0; i < numero ; i++) {

                if (i % 2 == 0) {
                    Hyperpar = true;
                }else  {
                    Hyperpar = false;
                }
            }
            return Hyperpar;
        }


}
