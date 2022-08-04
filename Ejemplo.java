
import java.awt.*;
import java.util.Scanner;

public class Ejemplo{
    
    public static void main (String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int Categoria;
    	double Sueldo,AumentoSueldo,NuevoSueldo;
    	System.out.print("Ingrese el sueldo:");
    	Sueldo=sc.nextDouble();
    	System.out.print("Ingrese la categoria:");
    	Categoria=sc.nextInt();
    	switch(Categoria){
    		case 1:
    			AumentoSueldo=Sueldo*0.15;
    			NuevoSueldo=Sueldo+AumentoSueldo;
    			System.out.print("El nuevo sueldo es de: "+NuevoSueldo);
    			break;
    		case 2:
    			AumentoSueldo=Sueldo*0.10;
    			NuevoSueldo=Sueldo+AumentoSueldo;
    			System.out.print("El nuevo sueldo es de: "+NuevoSueldo);
    			break;
    		case 3:
    			AumentoSueldo=Sueldo*0.08;
    			NuevoSueldo=Sueldo+AumentoSueldo;
    			System.out.print("El nuevo sueldo es de: "+NuevoSueldo);
    			break;
    		case 4:
    			AumentoSueldo=Sueldo*0.07;
    			NuevoSueldo=Sueldo+AumentoSueldo;
    			System.out.print("El nuevo sueldo es de: "+NuevoSueldo);
    			break;
    		default:
    			System.out.print("Categoria no existente");
    			break;
    	}
	}
}