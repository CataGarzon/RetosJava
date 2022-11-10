package Retos;
import java.util.Scanner;
public class reto5 
{
    public static void main(String[] args) 
    {
        double operacion=0; 
        int cantidad, valor;
    
        Scanner LECTURA = new Scanner(System.in);
        System.out.println("Bienvenido a la Tienda");
        System.out.println("Porfavor ingresa la cantidad de productos que desea comprar: ");
        cantidad = LECTURA.nextInt();

        for(int i = 1;  i <= cantidad; i++)
        {
            
            
            System.out.println("ingresa el valor del producto: "+i);
            valor= LECTURA.nextInt();
            
            operacion= valor+operacion;

        }

        System.out.println("el valor del producto es: " + operacion);
        System.out.println("el cliclo se se cerro: "+cantidad+" veces");
        LECTURA.close();
    }   
}
