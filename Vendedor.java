package clase5;

public class Vendedor extends Empleado {
	String matricula, marca, modelo, telMovil, areaVenta;
	Double porcentaje, valProducto;
	
	public Vendedor(String _nombre, String _apellidos, String _DNI, String _direccion, int _fonoContacto,
		int _numFax, String _despacho, String _tipoEmpleado) {
		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.DNI = _DNI;
		this.direccion = _direccion;
		this.fonoContacto = _fonoContacto;
		this.tipoEmpleado = _tipoEmpleado;
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
		String[] clientes = new String[] {"Colun", "Nestle", "Cencosud", "Soprole"};
		for (String cadena:clientes)
		System.out.println("cliente es: " + cadena);
	}
	public void imprimirDatos() {
		super.imprimirDatos();
		super.setAntiguedad(1);
		super.incrementaSalario("VENDEDOR", 100);
		listadoClientes();
		System.out.println("Puesto de Empleado: " + this.tipoEmpleado);
	}
}
