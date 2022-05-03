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

	}

	public void imprimirDatos() {
		System.out.println("el nombre es: " + nombre + "\nSus apellidos son: " + apellidos + "\nel DNI es: " + DNI
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
	
	
	public void incrementaSalario() {
		
		if (tipoEmpleado == "SECRETARIO") {
			aumento = (salario * 0.05) * antiguedad;
			System.out.println("el salario actual es: " + salario);
			System.out.println("el aumento anual del secretario es de: " + aumento);
			System.out.println("el salario mas el aumento es de: " + (aumento+salario));
						 
		} else if (tipoEmpleado == "VENDEDOR") {	
			aumento = (salario * 0.10) * antiguedad;
			System.out.println("el salario actual es: " + salario);
			System.out.println("el aumento anual del vendedor es de: " + aumento);
			System.out.println("el salario mas el aumento es de: " + (aumento+salario));
			
		}else if (tipoEmpleado == "JEFEZONA") {		
			aumento = (salario * 0.20) * antiguedad;
			System.out.println("el salario actual es: " + salario);
			System.out.println("el aumento anual del Jefe de Zona es de: " + aumento);
			System.out.println("el salario mas el aumento es de: " + (aumento+salario));
		}
	}

}
