import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Samsung";
        productos[1] = "Huawei";
        productos[2] = "Apple";
        productos[3] = "Xiaomi";
        productos[4] = "HTC Mobile";
        productos[5] = "Sony";
        productos[6] = "LG Eletronics";

        Arrays.sort(productos);
        System.out.println("---------- Usando FOR ----------");
        for(int i = 0; i < total;i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("\n---------- Usando FOREACH ----------");
        for (String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("\n---------- Usando WHILE ----------");
        int i = 0;
        while (i < total){
            System.out.println("Para indice "+ i + " : " + productos[i]);
            i++;
        }

        System.out.println("\n---------- Usando DO WHILE ----------");
        int j = 0;
        do {
            System.out.println("Para indice "+ j + " : " + productos[j]);
            j++;
        }
        while (j < total);

        System.out.println();
        int[] numeros = new int[10];
        int totalNum = numeros.length;

        for (int k = 0; k < totalNum;k++){
            numeros[k] = k * 3;
        }

        for (int k = 0; k < totalNum; k++){
            System.out.println("Numero " +k+" x 3 = " + numeros[k]);
        }
    }
}
