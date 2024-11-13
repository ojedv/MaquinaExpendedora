package programacion_modular;

import java.util.*;

public class Menu_maquinaexp {
	public static int parsear(String par1) {
		int numparseado;
		numparseado = Integer.parseInt(par1);
		return numparseado;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int seleccion;

		int stock[][] = { 
			    { 3, 3, 3, 3 }, 
			    { 3, 3, 3, 3 }, 
			    { 3, 3, 3, 3 }, 
			    { 3, 3, 3, 3 } 
			};
		String[][] productos = { { "KitKat", "Sandwich mixto", "Kinder Bueno", "Caña chocolate" },
				{ "Pringles", "Coca cola", "Monster", "Agua" },
				{ "Aquarius", "Patatas sabor jamón", "Coca cola", "Twix" },
				{ "Mars", "Snickers", "Monster", "M&M’s" } };
		double precios[][] = { { 1.2, 1.6, 1.3, 1.8 }, { 1.55, 0.8, 0.95, 0.6 }, { 0.8, 0.65, 0.8, 1.2 },
				{ 1.25, 1.35, 0.95, 0.85 } };

		System.out.println("1. Pedir producto");
		System.out.println("2. Mostrar productos");
		System.out.println("3. Recargar productos");
		System.out.println("4. Apagar máquina");

		seleccion = (int) (leer.nextFloat());
		while (seleccion < 1 || seleccion > 4) {
			System.out.println("Introduce un numero valido");
			seleccion = (int) (leer.nextFloat());
		}

		while (seleccion != 4) {

			switch (seleccion) {
			case 1:
				String prodelegido; // numero que introduce ususario
				int numuno; // 1 numero dividido de prodelegido parseado
				int numdos; // 2 numero dividido de prodelegido parseado
				String numdiv[] = new String[2]; // numero dividido

				

				System.out.println("Introduce el codigo del producto"); // Pedimos introducir un codigo para el producto.
				prodelegido = leer.next();
				while (prodelegido.length() != 2) { // Comprobamos que el codigo que introduce sea de 2 digitos.
					System.out.println("Ingrese un codigo valido");
					prodelegido = leer.next();
				}
				numdiv = prodelegido.split("");
				numuno = parsear(numdiv[0]);
				numdos = parsear(numdiv[1]);

				if (stock[numuno][numdos] == 0) {//Comprueba si el stock es igual que 0 y sino sigue con el codigo.
					System.out.println("Lo siento ya no queda stock de este producto");
				}else {
					stock[numuno][numdos] = (stock[numuno][numdos]-1);
				
				System.out.println("El producto elegido es: " + productos[numuno][numdos]);
				
				System.out.println("1. Pedir producto"); //Volvemos a decirle las opciones al usuario y leemos la respuesta con el scanner.
				System.out.println("2. Mostrar productos");
				System.out.println("3. Recargar productos");
				System.out.println("4. Apagar máquina");
				seleccion = (int) (leer.nextFloat());
				}
				break;
			case 2:
				System.out.println("Estos son los productos: ");// Mostramos todos los productos por pantalla
				System.out.println("00-" + productos[0][0] + "-" + precios[0][0] + "€");
				System.out.println("01-" + productos[0][1] + "-" + precios[0][1] + "€");
				System.out.println("02-" + productos[0][2] + "-" + precios[0][2] + "€");
				System.out.println("03-" + productos[0][3] + "-" + precios[0][3] + "€");

				System.out.println("10-" + productos[1][0] + "-" + precios[1][0] + "€");
				System.out.println("11-" + productos[1][1] + "-" + precios[1][1] + "€");
				System.out.println("12-" + productos[1][2] + "-" + precios[1][2] + "€");
				System.out.println("13-" + productos[1][3] + "-" + precios[1][3] + "€");

				System.out.println("20-" + productos[2][0] + "-" + precios[2][0] + "€");
				System.out.println("21-" + productos[2][1] + "-" + precios[2][1] + "€");
				System.out.println("22-" + productos[2][2] + "-" + precios[2][2] + "€");
				System.out.println("23-" + productos[2][3] + "-" + precios[2][3] + "€");

				System.out.println("30-" + productos[3][0] + "-" + precios[3][0] + "€");
				System.out.println("31-" + productos[3][1] + "-" + precios[3][1] + "€");
				System.out.println("32-" + productos[3][2] + "-" + precios[3][2] + "€");
				System.out.println("33-" + productos[3][3] + "-" + precios[3][3] + "€");

				System.out.println("1. Pedir producto");
				System.out.println("2. Mostrar productos");
				System.out.println("3. Recargar productos");
				System.out.println("4. Apagar máquina");
				seleccion = (int) (leer.nextFloat());

				break;
			case 3:

				System.out.println("1. Pedir producto");
				System.out.println("2. Mostrar productos");
				System.out.println("3. Recargar productos");
				System.out.println("4. Apagar máquina");
				seleccion = (int) (leer.nextFloat());

				break;
			case 4:

				break;
			default:
				System.out.println("Error numero no detectado");
				break;

			}
		}
		System.out.println("Apagando maquina...");

		leer.close();

	}


}
