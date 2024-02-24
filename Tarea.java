import java.util.Scanner;
public class Tarea {
    public static void main(String []args) {

        String name;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner recibirDatos = new Scanner(System.in);

        System.out.println("Ingrese Nombre Completo");
        name = recibirDatos.nextLine();

        System.out.println("Ingrese primer numero: ");
        num1 = recibirDatos.nextInt();

        System.out.println("Ingrese segundo numero: ");
        num2 = recibirDatos.nextInt();

        System.out.println("Ingrese tercer numero: ");
        num3 = recibirDatos.nextInt();

        System.out.println("Su nombre completo es: " +name);
        System.out.println("El primer numero es: " + num1);
        System.out.println("El segundo numero es: " + num2);
        System.out.println("El tercer numero es: " + num3);
    }
}