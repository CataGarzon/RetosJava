package Retos;
import java.util.Scanner;
public class reto1 
{
    public static void main(String[] args) 
    
    {
        double gradoF = 0;
		double gradoC = 0;
		int opcion = 0;
		
		
		System.out.println("escribe 1 si quieres pasar de °C a °F o escribe 2 si quieres pasar de °F a °C");
		Scanner LECTURA= new Scanner(System.in);
		opcion = LECTURA.nextInt();
		
		
		if(opcion == 1) 
		{
			System.out.println("Cuantos °C grados quieres convertir a °F ?");
			gradoC = LECTURA.nextDouble();
            gradoF = (gradoC *9/5) + 32;
            System.out.println(gradoC + " equivale a: " + gradoF + "°F");
	
        } 
        else if(opcion ==2)
        {
            System.out.println("Cuantos °F grados quieres convertir a  °C ?");
			gradoF = LECTURA.nextDouble();
            gradoC = (gradoF - 32) / 18;
            System.out.println(gradoF + " equivale a: " + gradoC + "°C");
            
        }
    LECTURA.close();
    }
}
