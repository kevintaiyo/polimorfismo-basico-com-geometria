
public class Circulo extends Figuras2D {
	
	private double raio;
	
	public Circulo (String nome, double raio) { // CRIANDO CONSTRUTOR
		super.setNome(nome);
		this.raio = raio;
		
	}
	
	//@Override
	public double area() {
		return Math.PI * Math.pow(this.raio, 2); //AQUI EL VAI RETIRNAR O RAIO AO QUADRADO
	}
}
