
public class Cubo extends Figuras3D {

	private double aresta;
	
	public Cubo (String nome, double aresta) {
		super.setNome(nome);
		this.aresta = aresta;
	}
	
	//@Override
	public double area() {
		return Math.pow(aresta, 2) *6; //Math.pow É PARA POTENCIAÇÃO
	}
	
	//@Override
	public double volume () { //PARA CALCULAR
		return Math.pow(aresta, 3); //Math.pow É PARA POTENCIAÇÃO
	}
	
}
