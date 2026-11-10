public class Ejercicio3 {
    static void main() {
        String numero = "1234";


        System.out.println(sumaDigitos(numero));

    }public static String  sumaDigitos(String numero) {
        int suma = 0;
        String res = "";

        for (int i = 0; i < numero.length(); i++) {
            suma += Character.getNumericValue(numero.charAt(i));
            if (i == numero.length() - 1) {
                res += numero.charAt(i) + " = " + suma;
            } else {
                res += numero.charAt(i) + " + ";
            }

        }
        return res;
    }
}
