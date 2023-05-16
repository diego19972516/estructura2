import java.util.Scanner;

public class Taller
{
    public static void main(String[]args){
        int id[];
        id = new int [3];
        int prod1[];
        prod1 = new int [3];
        int prod2[];
        prod2 = new int [3];
        int prod3[];
        prod3 = new int [3];
        String nombres[];
        nombres = new String [3];
        int clientes,i,produ1,produ2,produ3;
        int promedio;
        int ids;
        String nom;
        promedio = 0;
        
        Scanner a = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        System.out.println("Ingrese el numero de clientes");
        clientes = a.nextInt();
        
        for (i=0;i <= clientes -1;i++){
            System.out.println("Ingrese Documento ");
            ids = a.nextInt();
            System.out.println("Ingrese su nombre");
            nom = txt.nextLine();
            System.out.println("Ingrese el valor del primer producto de Aseo ");
            produ1 = a.nextInt();
            System.out.println("Ingrese el valor del segundo producto de Aseo");
            produ2 = a.nextInt();
            System.out.println("Ingrese el valor del tercer producto de Aseo");
            produ3 = a.nextInt();
            id[i] = ids;
            nombres[i] = nom;
            prod1[i] = produ1;
            prod2[i] = produ2;
            prod3[i] = produ3;
            promedio += ((prod1[i] + prod2[i] + prod3[i])/3)/clientes;
        }
        System.out.println("El promedio de ventas fue " + promedio);
    }
}   