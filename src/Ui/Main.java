package Ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Tables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio el Programa");

		// Client
		System.out.println("SECCION CLIENTES");
		Client client1 = new Client("Diego", "Molina", "1223121", true);
		System.out.println("El Nuevo Cliente Es:" + client1.getName() + " "
				+ client1.getLastName());

		client1.setName("Andres");

		System.out.println("El Nuevo Cliente Es:" + client1.getName() + " "
				+ client1.getLastName());

		Client client2 = new Client("Roberto", "Gomez", "9321345", false);
		System.out.println(" El Cliente Dos Es: " + client2.getName() + " "
				+ client2.getLastName() + " " + "Identidicado con CC:"
				+ client2.getId());

		client2.setId("93213345");
		System.out.println(" El Cliente Dos Es: " + client2.getName() + " "
				+ client2.getLastName() + " " + "Identidicado con CC:"
				+ client2.getId());

		Client client3 = new Client("Jose", "Perez", "1110507243", false);
		System.out.println("El CLiente Tres Es: " + client3.getName() + " "
				+ client3.getLastName() + " " + "Y Tiene Hijos?" + " "
				+ client3.isChild());
		client3.setChild(true);
		System.out.println("El CLiente Tres Es: " + client3.getName() + " "
				+ client3.getLastName() + " " + "Y Tiene Hijos?" + " "
				+ client3.isChild());

		// Product
		System.out.println("SECCION PRODUCTOS");
		Product productUno = new Product("Arroz", " Supremo", 2000, 12);
		System.out.println(" " + "Producto Uno:" + " " + productUno.getName()
				+ "\n" + " " + "Marca:" + productUno.getBrand() + "\n" + " "
				+ "Precio:" + "$" + productUno.getPrice() + "\n" + " "
				+ "Unidades Disponibles:" + " " + productUno.getQuantity());

		productUno.setPrice(1900.90);
		System.out.println("Variacion Precios del Mercado");
		System.out.println(" " + "Producto Uno:" + " " + productUno.getName()
				+ "\n" + " " + "Marca:" + productUno.getBrand() + "\n" + " "
				+ "Precio:" + "$" + productUno.getPrice() + "\n" + " "
				+ "Unidades Disponibles:" + " " + productUno.getQuantity());

		Product productDos = new Product("Frijol", "Del Huerto", 3500.00, 8);
		System.out.println(" " + "Producto Dos:" + " " + productDos.getName()
				+ "\n" + " " + "Marca:" + productDos.getBrand() + "\n" + " "
				+ "Precio:" + "$" + productDos.getPrice() + "\n" + " "
				+ "Unidades Disponibles:" + " " + productDos.getQuantity());
		productDos.setQuantity(2);
		System.out.println("Actualizacion Invenario Despues de Consumo");
		System.out.println(" " + "Producto Dos:" + " " + productDos.getName()
				+ "\n" + " " + "Marca:" + productDos.getBrand() + "\n" + " "
				+ "Precio:" + "$" + productDos.getPrice() + "\n" + " "
				+ "Unidades Disponibles:" + " " + productDos.getQuantity());
		Product productTres = new Product("Maiz Tierno", "El Dorado", 3250, 10);
		System.out.println(" " + "Producto Tres:" + " " + productTres.getName()
				+ "\n" + " " + "Marca:" + productTres.getBrand() + "\n" + " "
				+ "Precio:" + "$" + productTres.getPrice() + "\n" + " "
				+ "Unidades Disponibles:" + " " + productTres.getQuantity());
		productTres.setPrice(3000);
		System.out.println(" " + "Producto Tres:" + " " + productTres.getName()
				+ "\n" + " " + "Marca:" + productTres.getBrand() + "\n" + " "
				+ "Precio:" + "$" + productTres.getPrice() + "\n" + " "
				+ "Unidades Disponibles:" + " " + productTres.getQuantity());
		// Recipe
		System.out.println("SECCION RECETAS");
		Recipe recipeUno = new Recipe("Frijolada", 15000);
		System.out.println("Menu \n" + recipeUno.getName() + "-------- "
				+ "Precio-----$-" + recipeUno.getPrice());
		recipeUno.setPrice(16000);
		System.out.println("Menu \n" + recipeUno.getName() + "-------- "
				+ "Precio-----$-" + recipeUno.getPrice());
		Recipe recipeDos = new Recipe("Desgranado Misto", 8000);
		System.out.println("Menu \n" + recipeDos.getName() + "-------- "
				+ "Precio-----$-" + recipeDos.getPrice());
		recipeDos.setName("Desgranado Mixto");
		System.out.println("Menu \n" + recipeDos.getName() + "-------- "
				+ "Precio-----$-" + recipeDos.getPrice());

		// Tables
		System.out.println("SECCION MESAS");

		Tables tablesUno = new Tables("1", 4, "Primer Piso");
		System.out.println(" Mesa Nº" + " " + tablesUno.getNumber() + " "
				+ "En el " + tablesUno.getLocation() + " " + "Capacidad Para" + " "
				+ tablesUno.getCapacity() + " " + "Personas");
		tablesUno.setLocation("Segundo Piso");
		System.out.println(" Mesa Nº" + " " + tablesUno.getNumber() + " "
				+ "En el " + tablesUno.getLocation() + " " + "Capacidad Para" + " "
				+ tablesUno.getCapacity() + " " + "Personas");
		Tables tablesDos = new Tables ("2", 6, "Primer Piso");
		System.out.println(" Mesa Nº" + " " + tablesDos.getNumber() + " "
				+ "En el " + tablesDos.getLocation() + " " + "Capacidad Para" + " "
				+ tablesDos.getCapacity() + " " + "Personas");
		tablesDos.setCapacity(5);
		System.out.println(" Mesa Nº" + " " + tablesDos.getNumber() + " "
				+ "En el " + tablesDos.getLocation() + " " + "Capacidad Para" + " "
				+ tablesDos.getCapacity() + " " + "Personas");
		Tables tablesTres = new Tables ("4", 6, " Segundo Piso");
		System.out.println(" Mesa Nº" + " " + tablesTres.getNumber() + " "
				+ "En el " + tablesTres.getLocation() + " " + "Capacidad Para" + " "
				+ tablesTres.getCapacity() + " " + "Personas");
		tablesTres.setNumber("3");
		System.out.println(" Mesa Nº" + " " + tablesTres.getNumber() + " "
				+ "En el " + tablesTres.getLocation() + " " + "Capacidad Para" + " "
				+ tablesTres.getCapacity() + " " + "Personas");
	}
}
