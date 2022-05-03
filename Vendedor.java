package clase5;

public class Vendedor extends Empleado {
	String matricula, marca, modelo, telMovil, areaVenta;
	double porcentaje, valProducto;
	
	
	public Vendedor(String _nombre, String _apellidos, String _DNI, String _direccion, double _salario, int _fonoContacto,
		int _numFax, String _despacho, String _tipoEmpleado) {
		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.DNI = _DNI;
		this.direccion = _direccion;
		this.fonoContacto = _fonoContacto;
		this.tipoEmpleado = _tipoEmpleado;
		this.salario = _salario;
	}
	
	
	public void porcentajeVentas(double _valProducto) {
		this.valProducto = _valProducto; 
		if(valProducto >= 100) {
			valProducto = (valProducto * 0.10);
			System.out.println("el porcentaje de ventas ganado es: " + valProducto);
		}else if (valProducto >= 1000) {
			valProducto = (valProducto * 0.05);
			System.out.println("el porcentaje de ventas ganado es: " + valProducto);
		}
	}
	
	public void listadoClientes() {
		int num = 1 ;	
		String[] clientes1 = new String[] {"Colun", "Nestle", "Cencosud", "Soprole"};
		
		for (String cadena:clientes1) {
			
			System.out.println("el cliente número " + num + " de " + nombre + " es: " + cadena);
			num++;
		}		
		
	}
	
	public void listadoClientes2() {
		int num = 1 ;	
		String[] clientes1 = new String[] {"Bresler", "Arcor", "Torre", "Calo"};
		
		for (String cadena:clientes1) {
			
			System.out.println("el cliente número " + num + " de " + nombre + " es: " + cadena);
			num++;
		}		
		
	}
	
	
	public void imprimirDatos() {
		super.imprimirDatos();
		super.setAntiguedad(1);
		super.incrementaSalario();
		listadoClientes();
		System.out.println("Puesto de Empleado: " + this.tipoEmpleado);
	}
	
	
	public void imprimirDatos2() {
		super.imprimirDatos();
		super.setAntiguedad(1);
		super.incrementaSalario();
		listadoClientes2();
		System.out.println("Puesto de Empleado: " + this.tipoEmpleado);
	}
}
