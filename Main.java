package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(2,"azul");
		Circulo cilindro1 = new Cilindro(28,0.5,"amarillo");
	
		System.out.println("CIRCULO: "+circulo1.toString());
		System.out.println("CILINDRO: "+cilindro1.toString());
	}

}
