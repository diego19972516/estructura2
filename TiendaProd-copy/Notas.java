import java.util.Scanner;
public class Notas
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroClientes;
        ClientesPOO[] losclientes = new ClientesPOO[50];
        String identificacion, cliente, curso;
        double prod1, prod2, prod3;
        double promedio = 0;
        System.out.println("Digite la cantidad de Clientes: ");
        numeroClientes = sc.nextInt();
        for(int i = 0; i < numeroClientes; i++){
            System.out.println("Digite la identificacion del Cliente: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Cliente: ");
            cliente = sc.next();
            System.out.println("Digite la producto 1 del Cliente: ");
            prod1 = sc.nextDouble();
            System.out.println("Digite la producto 2 del Cliente: ");
            prod2 = sc.nextDouble();
            System.out.println("Digite la producto 3 del Cliente: ");
            prod3 = sc.nextDouble();
            ClientesPOO unCliente = new ClientesPOO();
            unCliente.identificacion = identificacion;
            unCliente.cliente = cliente;
            unCliente.prod1 = prod1;
            unCliente.prod2 = prod2;
            unCliente.prod3 = prod3;
            losclientes[i] = unCliente;
        }
        for(int i =0; i < numeroClientes; i++){
            double sum= (losclientes[i].prod1 + losclientes[i].prod2+ losclientes[i].prod3)/3;
            promedio = promedio + sum / numeroClientes;
        }
        System.out.println("El promedio de los productos es: " + promedio);
    }    
}

   