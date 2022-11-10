package Retos;
import java.util.Scanner;
public class reto3 
{
    public static void main(String[] args) 
    {
     
     int aleatorio, respuesta;
     Scanner LECTURA = new Scanner(System.in);
     System.out.println("juego carisellazo \n porfavor ponga 1 si desea cara o 2 si desea sello: ");
      respuesta = LECTURA.nextInt();
      System.out.println("la moneda se lanzo.");
      aleatorio =(int) (Math.random()*2)+1;
 
         if(aleatorio ==1 && respuesta==1)
         {
             System.out.println("salio cara ganaste");
         }
         else if(aleatorio ==2 && respuesta ==2)
         {
             System.out.println("salio sello ganaste");
         }
         else if(aleatorio ==1 && respuesta ==2)
         {
             System.out.println("salio cara perdiste");
         }
         else if(aleatorio ==2 && respuesta ==1)
         {
             System.out.println("salio sello perdiste");
         }
     
     }
}
