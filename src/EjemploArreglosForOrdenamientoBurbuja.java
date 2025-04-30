import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo) {

        int total = arreglo.length;
        int total2 = arreglo.length;

        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador++;
            }
            System.out.println("contador = " + contador);
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Samsung", "Huawei", "Apple", "Xiaomi",
                "HTC Mobile", "Sony", "LG Eletronics"};
        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("---------- Usando FOR ----------");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println();
        Integer[] numeros = new Integer[10];

        numeros[0] = 23;
        numeros[1] = 56;
        numeros[2] = 41;
        numeros[3] = 34;
        numeros[4] = 59;
        numeros[5] = 15;
        numeros[6] = 26;
        numeros[7] = 89;
        numeros[8] = 92;
        numeros[9] = 71;


        System.out.println("\n------ Ordenamiento de numeros con metodo ------");
        sortBurbuja(numeros);
        for (int k = 0; k < numeros.length; k++){
            System.out.println("Numero = " + numeros[k]);
        }

    }
}
