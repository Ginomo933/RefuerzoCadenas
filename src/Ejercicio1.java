public class Ejercicio1{
    static void main() {
        int[] num = {2,1,4,3,6};

        orden(num);
    }
    public static String orden(int[] num){

        boolean ascendente = true;
        boolean descendente = true;
        boolean iguales = true;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]){
                ascendente = false;
                iguales = false;
            }
            if (num[i] < num[i + 1]){
                descendente = false;
                iguales = false;
            }
            if (num[i] == num[i + 1]){
                descendente = false;
            }
        }
        if (ascendente){
            return "Ascendente";
        }else if(descendente){
            return "Descendente";
        }else if (iguales){
            return "Iguales";
        }else{
            return "Desordenado";
        }
    }
}
