package edu.utp.taller.ejemplo20;
import java.util.Scanner;
import edu.utp.taller.biblioteca.*;
public class Main 
{

	public static void main(String[] args) 
	{	Scanner consola = new Scanner(System.in);
	
		Prueba objPrueba = new Prueba();
		
		for(int con=1; con<=3; con++)
		{
			//CREACION DE LA INSTANCIA
			Mascota objMascota01;
			objMascota01 = new Mascota();
			//INGRESAMS DATOS EN LOS OBJETOS
			System.out.println("Ingrese el Nombre de la Mascota " + con + " :");
			objMascota01.nombre = consola.next();
			
			System.out.println("Ingrese el Raza de la Mascota " + con + " :");
			objMascota01.raza = consola.next();
			
			System.out.println("Ingrese el Tipo de Mascota " + con + " (1-Perros  |  2-Gatos");
			objMascota01.tipo = consola.nextInt();
			
			System.out.println("Ingrese el Edad de la Mascota  " + con + " :");
			objMascota01.edad = consola.nextInt();
			
			System.out.println("Ingrese el Sexo de la Mascota : (1-Macho | 2-Hembra");
			int sexo = consola.nextInt();
			objMascota01.sexo = (sexo==1?true:false);
			
			//MOSTRAMOS LOS DATOS DE LA MASCOTA
			System.out.println("DATOS DE LA MASCOTA\n-------------------------------------");
			System.out.println("Mascota : " + objMascota01.nombre + " Raza : " + objMascota01.raza);
			objMascota01.dormir();
			objMascota01.despertar();
			objMascota01.comer();
		}
	}

}
