package futbol;

public abstract class Futbolista  implements Comparable  {
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private final String posicion;

	//CONSTRUCTOR SIN PARÁMETROS
	public Futbolista() {
	        this.nombre="Maradona";
	        this.posicion="delantero";
	        this.edad=30;
	    }
	
    //CONSTRUCTOR CON PARÁMETROS
	public Futbolista(String nombre,int edad, String posicion) {
	        this.nombre=nombre;
	        this.edad=edad;
	        this.posicion=posicion;
	    }
	
    //PARA COMPARAR SI DOS FUTBOLISTAS SON IGUALES
	public boolean equals(Futbolista f) {
		
		return this == f;
	  }
	
    //MÉTODO ABSTRACTO
	abstract public boolean jugarConLasManos();

	@Override
	public String toString() {
		return "El futbolista " +nombre+ " tiene " +edad+ ", y juega de " +posicion;
		}
	
	
    //MÉTODOS SET Y GET
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
