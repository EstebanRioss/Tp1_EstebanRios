package ar.edu.unju.fi.ejercicio18Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18Model.Pais;
import ar.edu.unju.fi.ejercicio18Model.DestinoTuristico;

public class Main {

	public static void main(String[] args) {
		final int CantP = 6;
		Pais pais1 = new Pais("Ar-0000","Argentina");
		Pais pais2 = new Pais("Br-0001","Brazil");
		Pais pais3 = new Pais("Mx-0002","Mexico");
		Pais pais4 = new Pais("EC-0003","Ecuador");
		Pais pais5 = new Pais("PE-0004","Peru");
		Pais pais6 = new Pais("UR-0005","Uruguay");
		ArrayList<Pais> ListaPaises = new ArrayList<>(List.of(pais1,pais2,pais3,pais4,pais4,pais5,pais6));
		
		ArrayList<DestinoTuristico> ListaDestino = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		int Opcion = 0,CantDestino = 0;
		
		do {
			System.out.println("***Menu***");
			System.out.println("1-Alta de destino turístico");
			System.out.println("2-Mostrar todos los destinos turísticos.");
			System.out.println("3-Modificar el país de un destino turístico.");
			System.out.println("4-Limpiar el ArrayList de destino turísticos");
			System.out.println("5-Eliminar un destino turístico");
			System.out.println("6-Mostrar los destinos turísticos ordenados por nombre");
			System.out.println("7-Mostrar todos los países");
			System.out.println("8-Mostrar los destinos turísticos que pertenecen a un país");
			System.out.println("9-Salir");
			System.out.println("Ingrese una opcion: ");
			Opcion = sc.nextInt();
			
			switch(Opcion){
			case 1:{
				DestinoTuristico Destino = new DestinoTuristico();
				Boolean band = false;
				
				System.out.println("**Ingrese los datos del destino**");
				System.out.println("Nombre: ");
				String Nombre = sc.next();
				Destino.setNombre(Nombre);
				
				System.out.println("Codigo: ");
				String codigo = sc.next();
				Destino.setCodigo(codigo);
				
				System.out.println("Precio: ");
				Double Precio = sc.nextDouble();
				Destino.setPrecio(Precio);
				
				do {
					System.out.println("Ingrese el codigo del pais: ");
					String CodigoP = sc.next();
					
					for (int i = 0 ; i < CantP ; i++) {
						if( CodigoP.equals(ListaPaises.get(i).getCodigo())) {
							Destino.setPais(ListaPaises.get(i));
							band = true;
						}
						
					}
				}while (band != true);
				band = false;
				
				System.out.println("Cantidad de dias: ");
				int Dias = sc.nextInt();
				Destino.setCantDia(Dias);
				
				ListaDestino.add(CantDestino,Destino);
				CantDestino++;
				
				break;
			}
			case 2:{
				System.out.println("**Mostrar todos los destinos**");
				for(int i = 0 ; i < CantDestino ; i++) {
					ListaDestino.get(i).MostraDatos();
				}
				break;
			}
			case 3:{
				Boolean band = false;
				
				System.out.println("**Modificar el pais de un destino turistico**");
				System.out.println("Ingrese el nombre del destino turistico: ");
				String nombre = sc.next();
				
				for(int i = 0 ; i < CantDestino ; i ++) {
					if(nombre.equals(ListaDestino.get(i).getNombre())){
						Boolean b = false;
						do {
							System.out.println("Ingrese el codigo del nuevo pais: ");
							String codigo = sc.next();
							
							for (int p = 0 ; p < CantP ; p++) {
								if( codigo.equals(ListaPaises.get(p).getCodigo())) {
									ListaDestino.get(i).setPais(ListaPaises.get(p));
									b = true;
								}
							}
						}while (b != true);
					band = true;
					}
				}
				if(band == false) {
					System.out.println("No hay ningun destino con ese nombre");
				}
				
				break;
			}
			case 4:{
				System.out.println("**Eliminar todos los destino turisticos**");
				ListaDestino.clear();
				CantDestino = 0;
				break;
			}
			case 5:{
				Boolean band = false;
				
				System.out.println("**Eliminar un destino turistico**");
				System.out.println("Codigo: ");
				String codigo = sc.next();
				for(int i = 0; i < CantDestino ; i++){
					if (codigo.equals(ListaDestino.get(i).getCodigo())){
						ListaDestino.remove(i);
						CantDestino--;
						band = true;
						break;
					}
				}
				if(band == false) {
					System.out.println("No hay ningun destino con ese codigo");
				}
				break;
			}
			case 6:{
				System.out.println("**Destino ordenados por nombre");
				
				Collections.sort(ListaDestino, Comparator.comparing(DestinoTuristico::getNombre));
				for (DestinoTuristico destino : ListaDestino) {
		            System.out.println(destino.getNombre());
		        }
				break;
			}
			case 7:{
				System.out.println("**Mostrar datos de todos los paises**");
				for(int  i = 0; i < CantP ; i++){
					ListaPaises.get(i).MostrarDatos();
				}
				break;
			}
			case 8:{
				Boolean band = false;
				
				System.out.println("**Mostrar destino que tengan el mismo pais**");
				System.out.println("Codigo: ");
				String codigo = sc.next();
				
				for(int i = 0 ; i < CantDestino; i ++) {
					if(codigo.equals(ListaDestino.get(i).getPais().getCodigo())) {
						ListaDestino.get(i).MostraDatos();
						band = true;
					}
				}
				if(band == false) {
					System.out.println("No hay ningun destino con ese codigo");
				}
			}
			case 9:{
				System.out.println("Fin del programa");
				break;
			}
			default:{
				System.out.println("Opcion fuera del rango");
				break;
			}
			}
		}while(Opcion != 9);
		
		sc.close();
	}

}
