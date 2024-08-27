package futbol;

public class Jugador extends Futbolista{
	
	//ATRIBUTOS
	public short golesMarcados;
	public byte dorsal;
	
    // CONSTRUCTOR CON PARÁMETROS
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    // CONSTRUCTOR POR DEFECTO
    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
	
	
    // MÉTODO compareTo
    @Override
    public int compareTo(Futbolista f) {
        return Math.abs(this.getEdad() - f.getEdad());
    }
    
    // MÉTODO toString
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
	
    
    //SOBRE ESCRIBIR EL MÉTODO ABSTRACTO
    @Override
	public boolean jugarConLasManos() {
		return false;
	}

}
