package clase5;

public class EjemploModularidad {
	
	String notebook = "GAMER", marca, color, pantalla;
	
	public EjemploModularidad() {
		
		
	}
	
	public void marcaNote(String _marca) {
		this.marca = _marca;
		System.out.println("La marca del notebook " + notebook + " es: " + marca );
	}
	
	public void colorNote(String _color) {
		this.color = _color;
		System.out.println("El color del notebook " + notebook + " es: " + color);
	}
	
	public void pantallaNote(String _pantalla) {
		this.pantalla = _pantalla;
		System.out.println("El tamaño de la pantalla del notebook " + notebook + " es: " + pantalla);
	}
	

	public static void main(String[] args) {
		EjemploModularidad note = new EjemploModularidad();
		note.marcaNote("Asus");
		note.colorNote("Rojo");
		note.pantallaNote("15 pulgadas");
	}
}



