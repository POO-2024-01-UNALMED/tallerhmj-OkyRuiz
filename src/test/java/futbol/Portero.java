package futbol;

public class Portero extends Futbolista{
	
	//ATRIBUTOS 
	public short golesRecibidos;
	public byte dorsal;
	
    // CONSTRUCTOR CON PARÁMETROS
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
    // MÉTODO compareTo
    @Override
    public int compareTo(Futbolista f) {
        if (f instanceof Portero) {
            return Math.abs(this.golesRecibidos - ((Portero) f).golesRecibidos);
        } else {
            throw new ClassCastException("No se puede comparar un Portero con un Jugador");
        }
    }
    
    // MÉTODO toString
    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }
    
	
	//SOBRE ESCRIBIR EL MÉTODO ABSTRACTO
	public boolean jugarConLasManos() {
		return true;
	}
}
