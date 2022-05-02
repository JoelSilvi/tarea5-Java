package clase5;

	public class Secretario extends Empleado{
		String despacho;
		int numFax;
		
		public Secretario(String _nombre, String _apellidos, String _DNI, String _direccion, int _fonoContacto,
			int _numFax, String _despacho, String _tipoEmpleado) {
			this.nombre = _nombre;
			this.apellidos = _apellidos;
			this.DNI = _DNI;
			this.direccion = _direccion;
			this.fonoContacto = _fonoContacto;
			this.despacho = _despacho;
			this.numFax = _numFax;
			this.tipoEmpleado = _tipoEmpleado;
		}
		
		@Override
		public void imprimirDatos() {
			super.imprimirDatos();
			super.setAntiguedad(1);
			super.incrementaSalario("SECRETARIO", 100);
			System.out.println("Puesto de Empleado: " + this.tipoEmpleado);
			System.out.println("Despacho: "+ this.despacho);
			System.out.println("El Fax es: "+ this.numFax);
		}
		
	}