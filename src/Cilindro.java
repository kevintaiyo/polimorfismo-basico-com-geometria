
public class Cilindro extends Figuras3D {

	private double raio;
	private double altura;
	
	//CRIANDO A FORMULA PARA CALCULAR AREA E VOLUME DO CILINDRO.
	
	public Cilindro (String nome, double raio, double altura) {
		super.setNome(nome);
		this.raio = raio;
		this.altura = altura;
	}
	
	//@Override
	public double area () {
		return 2*Math.PI * this.raio *(raio+ altura);
	}
	
	//@Override
	public double volume() {
		return Math.PI * Math.pow(raio, 2) * altura;
	}
	
}
