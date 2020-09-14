package Practica01;

import java.util.Scanner;
import java.io.*;
 

public class Menu {
	public static void main (String[] arg) {
		Scanner sc = new Scanner(System.in);
		boolean entrada=true;
		int val1;
		while (entrada == true) {
			System.out.println("Ingresar la opcion que desea agregar datos");
			System.out.println("1) Ingresar a hospital");
			System.out.println("2) Ingresar a Pacientes");
			System.out.println("3) Ingresar a Personal");
			System.out.println("4) Salir");
			val1 = sc.nextInt();
			Scanner d0 = new Scanner(System.in);
			Scanner d1 = new Scanner(System.in);
			Scanner d2 = new Scanner(System.in);
			Scanner d3 = new Scanner(System.in);
			Scanner d4 = new Scanner(System.in);
			Scanner d5 = new Scanner(System.in);			
			String r0,r1,r2,r3,r4,r5;
			switch (val1) {
			case 1:
				System.out.println("Ingresar los datos del hospital");
				System.out.println("Ingresar el nombre del hospital");
				r1=d1.nextLine();
				System.out.println("Ingresar la direccion del hospital");
				r2=d2.nextLine().toString();
				
				System.out.println("Ingresar el telefono del hospital");
				r3=d3.nextLine();
				System.out.println("Ingresar el fax del hospital");
				r4=d4.nextLine();
				Hospital H1 = new Hospital();
				H1.NuevoHospital(r1, r2, r3, r4);
				System.out.println("Son los siguiente datos");
				System.out.println("Nombre del hospital: " +H1.Nombre);
				System.out.println("La dirrecion es: " + H1.direccion);
				System.out.println("El telefono es: "+ H1.telefono);
				System.out.println("El fax es: "+H1.Fax);
				break;
				
			case 2:
				System.out.println("Ingrese los datos del paciente");
				System.out.println("Ingresar el Id del paciente");
				r0=d0.nextLine();
				System.out.println("Ingresar el DNI del paciente");
				r2=d2.nextLine();
				System.out.println("Ingresar los nombre y apellidos del paciente");
				r3=d3.nextLine();
				System.out.println("Ingresar la direccion del paciente");
				r4=d4.nextLine();
				System.out.println("Ingresar el telefono del paciente");
				r5=d5.nextLine();
				Paciente P1 = new Paciente();
				P1.NuevoPaciente(r0, r2, r3, r4, r5);
				System.out.println("Son los siguiente datos");
				System.out.println("El ID del paciente es: " +P1.IdPaciente);
				System.out.println("El DNI del paciente es: " + P1.dni);
				System.out.println("Los nombres y apellidos del paciente son: "+ P1.NombreApellido);
				System.out.println("La direccion del paciente es: "+P1.direccion);
				System.out.println("El Telefono del paciente es: "+P1.telefono);
				break;
			case 3:
				System.out.println("Ingrese los datos del Personal");
				System.out.println("Ingresar el DNI del personal");
				r2=d2.nextLine();
				System.out.println("Ingresar la direccion del personal");
				r3=d3.nextLine();
				System.out.println("Ingresar el telefono del personal");
				r4=d4.nextLine();
				System.out.println("Ingresar el cargo del personal");
				r5=d5.nextLine();
				Personal P2 = new Personal();
				P2.NuevoPersonal(r2, r3, r4, r5);
				System.out.println("Son los siguiente datos");
				System.out.println("El DNI del personal es: " + P2.dni);
				System.out.println("La direccion del personal es: "+P2.direccion);
				System.out.println("El Telefono del personal es: "+P2.telefono);
				System.out.println("El Cargo del personal es: "+P2.cargo);
				break;
				default:
					entrada=false;
				
			}
			
		}
		
		
	}




}
