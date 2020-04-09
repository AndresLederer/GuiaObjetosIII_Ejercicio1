package ejercicio1;

public class Cilindro extends Circulo {
	//parametro por defecto
	private double altura = 1;
	
	//setter
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//getter
	public double getAltura() {
		return altura;
	}
	
	//constructores
	public Cilindro() {
		super();
		setAltura(1);
	}
	
	public Cilindro(double altura) {
		super();
		setAltura(altura);
	}
	
	public Cilindro(double altura,double radio,String color) {
		super(radio,color);
		setAltura(altura);
	}
	
	//constructoes con problemas de parametros
	/*public Cilindro(double radio) {
		super(radio);
		setAltura(1);
	}
	
	public Cilindro(String color) {
		super(color);
		setAltura(1);
	}
	
	public Cilindro(double radio, String color) {
		super(radio,color);
		setAltura(1);
	}
	
	/*public Cilindro(double altura) {
		super();
		setAltura(altura);
	}
	
	public Cilindro(double altura,double radio) {
		super(radio);
		setAltura(altura);
	
	/*public Cilindro(double altura,String color) {
		super(color);
		setAltura(altura);
	
	public Cilindro(double radio, String color, double altura) {
		super(radio,color);
		setAltura(altura);
	}
	*/
	
	//calcula y devuelve el volumen de Cilindro
	public double getVolumen() {
		double volumen;
		volumen = (Math.PI)*(Math.pow(super.getRadio(),2))*altura;
		return volumen;
	}
	
	//override de toString -- devuelve un String con todos los datos de Cilindro
	@Override 
	public String toString() {
		String texto = String.format("{Radio: %.2f; Color: %s; Altura: %.2f; Volumen: %.4f}",super.getRadio(),super.getColor(),getAltura(),getVolumen());
		return texto;
	}
	
	
}
