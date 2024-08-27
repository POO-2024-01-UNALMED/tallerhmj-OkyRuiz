package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private final String posicion;
	
	//CONSTRUCTOR CON PARÁMETROS
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad=edad;
		this.posicion=posicion;
		
	}
	
	//CONSTRUCTOR POR DEFECTO
	 public Futbolista() {
		 this("Maradona", 30, "delantero");
	 }
	 
	 //EL MÉTODO TOSTRING
	 public String toString() {
		 return "El futbolista " + nombre + " tiene " + edad 
				 + ", y juega de " + posicion;
	 }
	 
	 //MÉTODO PARA COMPARAR SI DOS FUTBOLISTAS SON IGUALES
	 public boolean equals(Futbolista f) {	 
		 
		 return this == f;
	 }
	 
	 //MÉTODO ABSTRACTO 
	 public abstract boolean jugarConLasManos();
	 
	// MÉTODOS GET Y SET
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public String getPosicion() {
	        return posicion;
	    } 
}
