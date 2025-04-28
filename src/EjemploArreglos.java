public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        int b = 0;
        for(int a = 0; a <= numeros.length-1; a++){
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
