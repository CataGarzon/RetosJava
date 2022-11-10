package Retos;

import java.util.Scanner;
public class reto7 
{
    public static void main(String[] args) 
    {
        Double[]nota = new Double[1];
        int cantidadNotas;
        
        Scanner LECTURA = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de notas que va a evaluar: ");
        cantidadNotas = LECTURA.nextInt();
       for( int i= 1; i <= cantidadNotas; i++)
       {
        System.out.println("Ingresa la nota: ");
        nota[0] = LECTURA.nextDouble();
            if(nota[0] <3)
            {
                System.out.println("Repobaste");
            }
            else if(nota[0] >=3 && nota[0] <=4)
            {
                System.out.println("Pasaste raspando");
            }
            else if( nota[0] > 4)
            {
                System.out.println("Aprobaste con buenos resultados");
            }
       }
           
       
    }    
}
