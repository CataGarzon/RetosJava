package Retos;

import java.util.Scanner;

public class reto4 
{
    public static void main(String[] args) 
    {
        int elegido, maquina;
        Scanner LECTURA = new Scanner(System.in);
        maquina =(int) (Math.random()*3)+1;
        System.out.println("Juego piedra, papel o tijera \n seleccione 1 para piedra \n seleccione 2 para papel \n seleccione 3 para tijeras ");
        elegido = LECTURA.nextInt();

        if(maquina==1)
        {
            System.out.println("la maquina escogio piedra");
            if(elegido==1)
            { 
                System.out.println("empatados");
            }
            else if (elegido == 2) 
            {
                System.out.println("eres el ganador");
            }
              else if (elegido== 3) 
              {
                System.out.println("perdiste");
              }
             
            }
            if(maquina==2)
            {
                System.out.println("la maquina escogio papel");
                if(elegido==1)
                { 
                    System.out.println("perdiste");
                }
                else if (elegido == 2) 
                {
                    System.out.println("empatados");
                }
                  else if (elegido== 3) 
                  {
                    System.out.println("eres el ganador");
                  }
                 
                }
                if(maquina==3)
                {
                    System.out.println("la maquina escogio tijera");
                    if(elegido==1)
                    { 
                        System.out.println("eres el ganador");
                    }
                    else if (elegido == 2) 
                    {
                        System.out.println("perdiste");
                    }
                      else if (elegido== 3) 
                      {
                        System.out.println("empatados");
                      }
                     
                    }
    
            

    }
    
}
