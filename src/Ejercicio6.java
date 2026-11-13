public class Ejercicio6 {
    public static void main(String[] args) {
        int numero = 2408;

        System.out.println(esHyperpar(numero));

    }

    public static boolean esHyperpar(int numero){
        String m = String.valueOf(numero);
        int digito;

        for (int i = 0; i < m.length() ; i++) {
            digito = m.charAt(i) - '0';
            if (digito %2 != 0) {
                return false;
            }
        }

        return true;
    }
}
