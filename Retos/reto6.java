package Retos;
import java.util.Scanner;
public class reto6 
{
    public static void main(String[] args)  
    {
        int aleatorio, respuesta, continuar;
        int acomulado1 = 0;
        
        Scanner LECTURA = new Scanner(System.in);
        System.out.println("Bienvenido al juego carisellazo");

    
       do
       {
        System.out.println("Ingresa la cantidad de dinero que desea apostar: ");
        respuesta = LECTURA.nextInt();


                System.out.println(" porfavor ponga 1 si desea cara o 2 si desea sello: ");
                respuesta = LECTURA.nextInt();
                System.out.println("la moneda se lanzo.");
                aleatorio =(int) (Math.random()*2)+1;
            
                if(aleatorio ==1 && respuesta==1)
                {
                    System.out.println("salio cara ganaste");
                    acomulado1= acomulado1 +(respuesta*2);
                }
                else if(aleatorio ==2 && respuesta ==2)
                {
                    System.out.println("salio sello ganaste");
                    acomulado1= acomulado1+(respuesta*2);
                }
                else if(aleatorio ==1 && respuesta ==2)
                {
                    System.out.println("salio cara perdiste");
                    acomulado1= acomulado1 - respuesta;
                }
                else if(aleatorio ==2 && respuesta ==1)
                {
                    System.out.println("salio sello perdiste");
                    acomulado1= acomulado1 -respuesta;

                }
                    System.out.println("desea jugar de nuevo?\n3 Si\n4 No");
                    continuar= LECTURA.nextInt();
                    LECTURA.nextLine();

                    System.out.println("el dinero que se acomulo es: " + acomulado1);
       }
    
       while(continuar==3);
  
            System.out.println("\nGracias por jugar.");
            LECTURA.close();        
        
    }  
}
