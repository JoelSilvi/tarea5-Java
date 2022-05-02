package clase5;

public class Empleado {
	public String nombre, apellidos, DNI, direccion, supervisor, tipoEmpleado;
	public int antiguedad, fonoContacto;
	public double aumento, salario;

	public Empleado(String _nombre, String _apellidos, String _DNI, String _direccion, int _fonoContacto,
			double _salario) {

		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.DNI = _DNI;
		this.direccion = _direccion;
		this.fonoContacto = _fonoContacto;
		this.salario = _salario;
	}

	public Empleado() {
		//this();
	}

	public void imprimirDatos() {
		System.out.println("el nombre es: " + nombre + "\nel apellido es: " + apellidos + "\nel DNI es: " + DNI
				+ "\nla dirección es: " + direccion + "\nel teléfono de contacto es: " + fonoContacto);
	}

	public void cambiarSupervisor(String _supervisor) {
		this.supervisor = _supervisor;
		System.out.println("El nuevo supervisor es: " + supervisor);
	}
	
	
	public void setAntiguedad(int _antiguedad) {
		this.antiguedad = _antiguedad;
		System.out.println("la antiguedad es: " + antiguedad + " años");
	}
	
	
	public void incrementaSalario(String _tipoEmpleado, int _auSalario) {
		this.tipoEmpleado = _tipoEmpleado;
		this.salario = _auSalario;
		if (tipoEmpleado == "SECRETARIO") {
			this.tipoEmpleado = _tipoEmpleado;
			aumento = (_auSalario * 0.05) * antiguedad;
			System.out.println("el salario actual es: " + salario);
			System.out.println("el aumento anual del secretario es de: " + aumento);
			System.out.println("el salario mas el aumento es de: " + (aumento+salario));
						 
		} else if (tipoEmpleado == "VENDEDOR") {
			this.tipoEmpleado = _tipoEmpleado;
			aumento = (_auSalario * 0.10) * antiguedad;
			System.out.println("el salario actual es: " + salario);
			System.out.println("el aumento anual del vendedor es de: " + aumento);
			System.out.println("el salario mas el aumento es de: " + (aumento+salario));
			
		}else if (tipoEmpleado == "JEFEZONA") {
			this.tipoEmpleado = _tipoEmpleado;
			aumento = (_auSalario * 0.20) * antiguedad;
			System.out.println("el salario actual es: " + salario);
			System.out.println("el aumento anual del Jefe de Zona es de: " + aumento);
			System.out.println("el salario mas el aumento es de: " + (aumento+salario));
		}
	}

}
