
public class Quadrado extends Figuras2D {

	private double lado;
	
	public Quadrado (String nome, double lado) {
		super.setNome(nome);
		this.lado = lado;
	}
	
	//@Override
	public double area2() { // NÓS PRECISAMOS QUE ELE RETORNE ALGO PARA O USUARIO QUE FAZ O USO DO PROGRAMA QUE DESENVOLVEMOS. POR ISSO USAMOS RETURN.
		return Math.pow(this.lado, 2);
	}
	
	
}
