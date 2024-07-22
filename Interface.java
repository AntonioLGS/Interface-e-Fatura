package ExerciciosEmCasa;

public class Interface {
	interface Atleta {
	    String getNome();
	    double getPeso();
	}
	interface Ciclista extends Atleta {
	    void pedalar();
	}

	interface Corredor extends Atleta {
	    void correr();
	}

}
