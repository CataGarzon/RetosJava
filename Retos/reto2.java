package Retos;
import java.util.Scanner;
public class reto2 
{
    public static void main(String[] args) 
    {
        
        int pesoBebe = 0;
        int mesesBebe = 0;
        int dosisVacuna = 0;
        Scanner LECTURA= new Scanner(System.in);

        System.out.println("ingrese porfavor el peso del bebe: ");
		pesoBebe  = LECTURA.nextInt() + 10;
        System.out.println("ingrese porfavor los meses del bebe: ");
		mesesBebe = LECTURA.nextInt() * 10;

        dosisVacuna = pesoBebe + mesesBebe * 8;

        System.out.println("la dosis a aplicar es:" + dosisVacuna);
         
      
    }

}
