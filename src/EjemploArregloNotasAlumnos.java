import java.text.DecimalFormat;
import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMate, claseHistoria, claseLenguaje;
        double sumNotasMate = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMate = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para Matematicas");
        for (int i = 0; i < claseMate.length; i++) {
            claseMate[i] = scan.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = scan.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = scan.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMate += claseMate[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMate = (sumNotasMate / claseMate.length);
        double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje / claseLenguaje.length);
        double promedioTotalCurso = (promedioMate + promedioHistoria + promedioLenguaje) / 3;

        //Encontrado en la web
        DecimalFormat formato = new DecimalFormat("#.#");
        String promedioFinalMate = formato.format(promedioMate);
        String promedioFinalHis = formato.format(promedioHistoria);
        String promedioFinalLen = formato.format(promedioLenguaje);
        String promedioFinalTotal = formato.format(promedioTotalCurso);

        System.out.println("Promedio clase Matematicas: " + promedioFinalMate);
        System.out.println("Promedio clase Historia: " + promedioFinalHis);
        System.out.println("Promedio clase Lenguaje: " + promedioFinalLen);
        System.out.println("Promedio total del curso: " + promedioFinalTotal);

        System.out.println("Ingrese identificador del alumno: ");
        int id = scan.nextInt();
        double promedioAlumno = (claseMate[id]+claseHistoria[id]+claseLenguaje[id])/3;
        String promedioFinalAlumno = formato.format(promedioAlumno);
        System.out.println("Promedio del alumno num " + id + " : " + promedioFinalAlumno);

    }
}
