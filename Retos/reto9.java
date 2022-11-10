package Retos;

import java.util.Scanner;

//matrices
public class reto9 
{
    public static void main(String[] args) 
    {
        String[][] productoN = new String[4][4];
        Double[][] productoV = new Double[4][4];
        Scanner LECTURA = new Scanner(System.in);
         for(int f =0; f <productoN.length;f++)
         {
        for(int c = 0; c< productoV.length; c++)
        {
          System.out.println("ingresa el  nombre producto: "+f+c);
          productoN[f][c] = LECTURA.next();
          System.out.println("ingresa el valor del producto: ");
          productoV[f][c]= LECTURA.nextDouble();
        }

       }
       
       for(int f = 0; f<productoN.length; f++)
       {
            for(int c =0; c < productoV.length; c++)
            {
                System.out.println(" el nombre y precio de el producto es: "+ f +" "+c+ " " +productoN[f][c] + " "+productoV[f][c]);
            }
        }
    }
}
