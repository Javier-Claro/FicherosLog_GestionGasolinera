package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.repostaje;
import servicios.implMenu;
import servicios.implRepostaje;
import servicios.interfazMenu;
import servicios.interfazRepostaje;

public class menu {

	public static void main(String[] args) {
		
		//Inicializa la interfaz de repostaje y menu
		interfazRepostaje intR = new implRepostaje();
		interfazMenu intM = new implMenu();
		//Listado de repostajes (BD)
		List<repostaje> listaRepostajes = new ArrayList<>();
				
				// Imprimir el menú por consola
				// Scanner con la opción del usuario
				Scanner entradaOpcion = new Scanner(System.in);		
				Boolean cerrarMenu = false;
				int opcion;
				while(!cerrarMenu) {	
					//Mostramos el menú
					intM.mostrarMenu();
					System.out.println("Introduza la opción deseada: ");
					opcion = entradaOpcion.nextInt();
					System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
					
					switch (opcion) {					
						case 0:
							cerrarMenu = true;
							break;							
						case 1:
												
							System.out.println();
							break;
						case 2:
							
							break;
						case 3:
							
							break;
						default:

					}
				}		

			}

	}