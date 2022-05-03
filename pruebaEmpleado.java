package clase5;

public class pruebaEmpleado {
	public static void main(String[] args) {
		
		Secretario secretario1 = new Secretario("Juan", "Perez Carez","8254354-5", "Providencia", 200, 99754545, 9998787, "Los boldos 155", "SECRETARIO");
		Secretario secretario2 = new Secretario("Camila", "Diaz Toro","5254354-5", "Lampa", 400,9157852, 9998787, "Los boldos 155", "SECRETARIO");
		Vendedor vendedor1 = new Vendedor("Pedro", "Perez Poblete","9789354-9", "Providencia", 100, 9778112, 9998787, "Los boldos 155", "VENDEDOR");
		Vendedor vendedor2 = new Vendedor("Felipe", "Osorio Velasquez","5320354-4", "Melipilla", 200, 9655789, 9158764, "Los alamos 123", "VENDEDOR");
		JefeZona jefezona1 = new JefeZona("Pepe", "Rodriguez Caro","4265789-2", "Colbun", 1000, 9458735, "Los guindos 458", "JEFEZONA");
		JefeZona jefezona2 = new JefeZona("Felipe", "Dominguez Res","6597854-1", "Tocopilla", 350, 96547893, "Los toldos ", "JEFEZONA");
		
		
		
		secretario1.imprimirDatos();
		System.out.println("*******************************************");
		secretario2.imprimirDatos();
		System.out.println("*******************************************");
		vendedor1.imprimirDatos();
		System.out.println("*******************************************");
		vendedor2.imprimirDatos2();
		System.out.println("*******************************************");
		jefezona1.imprimirDatos();
		System.out.println("*******************************************");
		jefezona2.imprimirDatos2();
		System.out.println("*******************************************");

		
	}
	
	
	
	
}
