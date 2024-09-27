package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
    //declarar variables
    String nombre,mejoralum="",opc="";
    int nota,n1,n2,n3,i=0;
    double prom,promax=0;
    Scanner lectura=new Scanner(System.in);
    //proceso de datos
        do {
            System.out.print("Ingrese el nombre del " +(i+1)+ "° alumno: ");
            nombre=lectura.next();
            System.out.print("Ingrese la primera nota: ");
            n1=lectura.nextInt();
            System.out.print("Ingrese la segunda nota: ");
            n2=lectura.nextInt();
            System.out.print("Ingrese la tercera nota: ");
            n3=lectura.nextInt();
            prom=(n1+n2+n3)/3;
            System.out.print("El promedio es: " +prom);
            if (prom>promax) {
                promax=prom;
                mejoralum=nombre;
            }
            System.out.print("¿Desea continuar? [S/N] ");
            opc=lectura.next();
            i++;
            n1=0;
            n2=0;
            n3=0;
        } while (opc.equals("S"));
        //salida de datos
        System.out.println("----------------");
        System.out.println(mejoralum+ "tiene el mayor promedio");
        System.out.println("Obtuvo " +promax);
        System.out.println("----------------");
    }
}
