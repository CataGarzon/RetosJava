package Retos;

import java.util.Scanner;

public class reto8 
{

        public static void main(String[] args) 
    {   
        int nCantidad=0;
        double tGanador;
        Scanner LECTURA = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de nadadores: ");
        nCantidad = LECTURA.nextInt();
        String[]nombresCompetidor = new String[nCantidad];
        Double[]tiempo = new Double[nCantidad];
        for(int i = 0; i<nCantidad; i++)
        {
            System.out.println("ingresa datos del competidor: " +(i+1));
            System.out.println("Ingresa el nombre del nadador: ");
            nombresCompetidor[i] = LECTURA.next();
            System.out.println("Ingresa el tiempo en segundos del nadador: ");
            tiempo[i] = LECTURA.nextDouble(); 
          
        }
        tGanador = tiempo[0];
            for(int g = 0; g < nCantidad; g++) 
            {
            if(tiempo[g]< tGanador)
              {
                tGanador = tiempo[g];
              }
            }
          System.out.println("Los tiempos de los competidores son: ");
          for(int u=0; u < nCantidad; u++)
          {
            System.out.println("nombre: "+nombresCompetidor[u] + " tiempo: " + tiempo[u] );
            if(tiempo[u].equals(tGanador))
            {
              System.out.println("El tiempo de competidor ganador es: " + tGanador + "Felicidades");
            }
          }

    }    
}
