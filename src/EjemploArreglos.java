import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Valor 10";
        productos[1] = "Valor 90";
        productos[2] = "Valor 9";
        productos[3] = "Valor 34";
        productos[4] = "Valor 5";
        productos[5] = "Valor 2";
        productos[6] = "Valor 79";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos = " + prod1);
        System.out.println("productos = " + prod2);
        System.out.println("productos = " + prod3);
        System.out.println("productos = " + prod4);
        System.out.println("productos = " + prod5);
        System.out.println("productos = " + prod6);
        System.out.println("productos = " + prod7);


        int[] numeros = new int[4];

        int b = 0;
        for (int a = 0; a <= numeros.length - 1; a++) {
            numeros[a] = b++;
            //    System.out.println("numeros = " + numeros[a]);
        }

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];


        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }
}
