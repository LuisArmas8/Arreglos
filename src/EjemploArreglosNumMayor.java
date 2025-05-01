import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Ingresa 5 numeros enteros: ");
        for (int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        int max = 0;
        for(int i =0; i < a.length;i++){
            max = (a[max] > a[i]) ? max: i;
        }
        System.out.println("max = " + a[max]);
    }
}
