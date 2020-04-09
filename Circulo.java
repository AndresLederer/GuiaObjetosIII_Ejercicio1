package ejercicio1;

public class Circulo {
	//atributos por defecto
	private double radio;
	private String color;
	
	//setters
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//getters
	public double getRadio() {
		return radio;
	}
	public String getColor() {
		return color;
	}
	
	//constructores 
	public Circulo() {
		setRadio(1);
		setColor("Rojo");
	}
	public Circulo(double radio, String color) {
		setRadio(radio);
		setColor(color);
	}
	
	//calcula y devuelve el area de Circulo
	public double getArea() {
		double area;
		area = (Math.PI)*(Math.pow(radio, 2));
		return area;
	}
	
	//devuelve un String con todo los datos de Circulo
	public String toString() {
		String texto = String.format("{Radio: %.2f; Color: %s}",getRadio(),getColor());
		return texto;
	}

}
















