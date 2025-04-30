import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

    //    String[] productos = new String[7];
        String[] productos = {"Samsung", "Huawei", "Apple","Xiaomi",
                              "HTC Mobile", "Sony","LG Eletronics"};
        int total = productos.length;

/*  //Agregar valores a arreglo - Forma 1
        productos[0] = "Samsung";
        productos[1] = "Huawei";
        productos[2] = "Apple";
        productos[3] = "Xiaomi";
        productos[4] = "HTC Mobile";
        productos[5] = "Sony";
        productos[6] = "LG Eletronics";
*/
        Arrays.sort(productos);
        System.out.println("---------- Usando FOR ----------");
        for(int i = 0; i < total;i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("\n---------- Usando FOR inverso ----------");
        for (int i = 0; i < total; i++){
            System.out.println("Para i = " + (total-1-i) + " : " + productos[total-1-i]);
        }

        System.out.println("\n---------- Usando FOR inverso 2 ----------");
        for (int i = total -1; i >= 0; i--){
            System.out.println("Para i = " +i+ " valor " + productos[i]);
        }
    }
}
