package futbol;

public class Jugador extends Futbolista{
	
	 //ATRIBUTOS
	 public short golesMarcados;
	 public byte dorsal;
	 
	 //CONSTRUCTOR SIN PARÁMETROS
	 public Jugador() {
		 this.golesMarcados = 289;
	     this.dorsal = 7;
	     
	 }

	 public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		 super(nombre, edad, posicion);
	     this.golesMarcados = golesMarcados;
	     this.dorsal = dorsal;
	     }
	 
	 //SOBRE ESCRIBIR EL MÉTODO ABSTRACTO
	 @Override
	 public boolean jugarConLasManos() {
		 return false;
		 }

	 @Override
	 public int compareTo(Object f) {
		 Jugador p=(Jugador) f;
	     return Math.abs(this.getEdad()-p.getEdad());
	     }

	 @Override
	 public String toString() {
		 return "El futbolista " +getNombre()+ " tiene " +getEdad()+ ", y juega de " +getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
	    }
	 
	 //MÉTODOS SET Y GET
	 public short getGolesMarcados() {
		 return golesMarcados;
		 }

	 public void setGolesMarcados(short golesMarcados) {
		 this.golesMarcados = golesMarcados;
		 }

	 public byte getDorsal() {
		 return dorsal;
		}

	 public void setDorsal(byte dorsal) {
		 this.dorsal = dorsal;
		 }

}
