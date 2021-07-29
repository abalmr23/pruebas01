package edu.utp.taller.ejemplo20;

public class Mascota 
{
	//ATRIBUTOS
	String nombre;
	String raza;
	int tipo;		//1-Perro  2-Gato
	int edad;
	boolean sexo;
	
	//MÉTODOS
	void dormir()
	{	System.out.println("Soy " + nombre + " De raza " + raza);
		System.out.println("Estoy durmiendo!!!  ... zzzzzzzz");
	}
	void despertar()
	{
		System.out.println(nombre + "Ya despertó, sácame a pasear!!!!");
	}
	void comer()
	{	System.out.println("Soy " + (tipo==1?" Perrito":" Gatito" ));
		System.out.println("Tengo hambre!!, comer ahora!!!!");
	}
	
	
}
