
public class Triangulo extends Figuras2D {

	private double base;
	private double altura;
	
	public Triangulo (String nome, double base, double altura) {
		super.setNome(nome);
		this.altura = altura;
		this.base = base;
	}
	
	//@Override
	public double area() {
		return (this.base*this.altura)/2;
	}
	
	
}
