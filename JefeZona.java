package clase5;

public class JefeZona extends Empleado {
	
		String despacho, secretario, coche, matricula, marca, modelo;
		String[] vendedores = new String[] {"Pepito", "Juanito", "Carlitos"};
		
		public JefeZona(String _nombre, String _apellidos, String _DNI, String _direccion,
						 double _salario, int _fonoContacto,
						 String _despacho, String _tipoEmpleado) {
			this.nombre = _nombre;
			this.apellidos = _apellidos;
			this.DNI = _DNI;
			this.direccion = _direccion;
			this.salario = _salario;
			this.fonoContacto = _fonoContacto;
			this.despacho = _despacho;
			this.tipoEmpleado = _tipoEmpleado;
		}
		
		
		public void cambiarSecretario(String _secretario) {
			this.secretario = _secretario;
			System.out.println("El nuevo secretario de " + nombre + " es " + secretario);
		}
		
		public void cambiarCoche(String _coche, String _matricula, String _marca, String _modelo) {
			this.coche = _coche;
			this.matricula = _matricula;
			this.marca = _marca;
			this.modelo = _modelo;
			System.out.println("El coche es: " + coche + " la matricula es " + matricula +
					           "\nla marca es: " + marca + " el modelo es " + modelo);
		}
		
		@Override
		public void imprimirDatos() {
			super.imprimirDatos();
			super.setAntiguedad(1);
			super.incrementaSalario();
			cambiarSecretario("Carmen");
			cambiarCoche("Auto", "KG-6587", "Mazda", "CX5");
			System.out.println("Puesto de Empleado: " + this.tipoEmpleado);
			System.out.println("Despacho: "+ this.despacho);
		}
		
		public void imprimirDatos2() {
			super.imprimirDatos();
			super.setAntiguedad(1);
			super.incrementaSalario();
			cambiarSecretario("Natalia");
			cambiarCoche("Camioneta", "PO-9875", "Suzuki", "CG98");
			System.out.println("Puesto de Empleado: " + this.tipoEmpleado);
			System.out.println("Despacho: "+ this.despacho);
		}
		
		

}