/**
Crear un programa en Java que permita ingresar la edad, 
sexo de las personas y preguntar al usuario si desea continuar 
o finalizar con el proceso de registro de datos.
Visualizar la cantidad de alumno y el promedio de edad,
 la cantidad de alumnos de sexo masculino y femenino.
 */
package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
    //declarar variables
    boolean estado=true;
    int edad,cp,cpsm,cpsf;
    String sexo,rpta;
    double pe,se;
    sexo="";
    rpta="";
    cp=0;
    cpsm=0;
    cpsf=0;
    se=0.0;
Scanner lectura=new Scanner(System.in);
    //proceso de datos
        do {            
            System.out.print("Ingrese su edad");
            edad=lectura.nextInt();
            System.out.print("Ingrese su sexo: ");
            sexo=lectura.next();
        cp++;
        se+=edad;
            if (sexo.equals("m")) {
                cpsm++;
            }else{
                cpsf++;
            }
            do {                
                System.out.print("Desea continuar si/no? : ");
                rpta=lectura.next();
                if(rpta.equals("si")||rpta.equals("no")) {
                    estado=false;
                }else{
                    estado=true;
                    System.out.print("Solo se debe ingresar si o no");
                }    
            }while(estado);
        }while (rpta.equals("si"));
        pe=se/cp;
        System.out.println("La cantidad de alumnos es: " +cp);
        System.out.println("La cantidad de alumnos de sexo masculino es: " +cpsm);
        System.out.println("La cantidad de alumnos de sexo femenino es: " +cpsf);
        System.out.println("El promedio de edades es: "+pe);
    }
}

