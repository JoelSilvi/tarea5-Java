package clase5;

public class pruebaEmpleado {
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Felipe", "Lopez","7979894", "Cerro Navia", 45458544, 100);
		
		Secretario secretario1 = new Secretario("Juan", "Perez","151513354", "Providencia", 54554545, 9998787, "Los boldos 155", "SECRETARIO");
		Vendedor vendedor1 = new Vendedor("Juan", "Perez","151513354", "Providencia", 54554545, 9998787, "Los boldos 155", "SECRETARIO");
		
		
		vendedor1.imprimirDatos();
		System.out.println("*******************************************");
		empleado1.imprimirDatos();
		
		
		
		System.out.println("*******************************************");
		secretario1.imprimirDatos();
		
		

		
	}
	
	
	
	
}
