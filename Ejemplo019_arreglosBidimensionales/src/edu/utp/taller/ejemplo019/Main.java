package edu.utp.taller.ejemplo019;
import java.util.Scanner;
import java.util.Random;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner consola = new Scanner(System.in);
		Random generador =  new Random();
		int n, m;
		int [][] numeros;	//DECLARAMOS ARREGLO BIDIMENSIONAL
		double sumatoria = 0.00;
		//1.  INGRESO DE DATOS
		System.out.println("Ingrese la Cantidad de Filas : " );
        n = consola.nextInt();
        System.out.println("Ingrese la Cantidad de Columnas : " );
        m = consola.nextInt();
        //2. DIMENSIONAMOS EL ARREGLO BIDIMENSIONAL
        numeros = new int[n][m];
        //3. INGRESO DE DATOS
        for(int fila=0; fila < numeros.length; fila++)
        {   for(int col=0; col < numeros[0].length; col++)
            {
            	numeros[fila][col] = generador.nextInt(65) + 15;
            }
        }
        //4. IMPRIMIR CONTENIDO DEL ARREGLO BIDIMENSIONAL
        for(int f=0; f < numeros.length; f++)
        {   for(int c=0; c < numeros[0].length; c++)
            {
            	System.out.print(numeros[f][c] + "\t"); 
            }
        	System.out.println("");
        }
        //5. IMPRIMIR ARREGLO BIDIMENSIONAL INVERTIDO
        System.out.println("");
        for(int c=0; c < numeros[0].length; c++)
        {   
        	for(int f=0; f < numeros.length; f++)
            {
            	System.out.print(numeros[f][c] + "\t"); 
            }
        	System.out.println("");
        }
        //6. IMPRIMIR PROMEDIO DEL ARREGLO BIDIMENSIONAL
        System.out.println("");
        for(int c=0; c < numeros[0].length; c++)
        {   
        	for(int f=0; f < numeros.length; f++)
            {
        		sumatoria += numeros[f][c];
            }
        }
        System.out.println("Promedio : " + sumatoria / (numeros.length * numeros[0].length));
	}

}
