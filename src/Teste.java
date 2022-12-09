
public class Teste { //CLASSE DRIVER

	public static void main(String[] args) {
		
		Cilindro f1 = new Cilindro ("Cilindro",2,3); //AQUI NOS OBJETOS CRIAMOS NOSSOS NUMEROS PARA REALIZAR OS CALCULOS
		
		Circulo f2 = new Circulo ("Circulo",3); //AQUI NOS OBJETOS CRIAMOS NOSSOS NUMEROS PARA REALIZAR OS CALCULOS
		
		Cubo f3 = new Cubo ("Cubo",3); //AQUI NOS OBJETOS CRIAMOS NOSSOS NUMEROS PARA REALIZAR OS CALCULOS
		
		Quadrado f4 = new Quadrado ("Quadrado",5); //AQUI NOS OBJETOS CRIAMOS NOSSOS NUMEROS PARA REALIZAR OS CALCULOS
		
		Triangulo f5 = new Triangulo ("Triangulo",3,5); //AQUI NOS OBJETOS CRIAMOS NOSSOS NUMEROS PARA REALIZAR OS CALCULOS
		
		FigurasGeometricas [] fg = new FigurasGeometricas[5]; //AQUI ESTAMOS CRIANDO UMA ARRAY PARA CARREGAR TODOS OS OBJETOS QUE CRIAMOS ACIMA, A PARTIR DOS CONSTRUTORES QUE TINHAMOS CRIADO
		fg[0] = f1;
		fg[1] = f2;
		fg[2] = f3;
		fg[3] = f4;
		fg[4] = f5;
		
		for (FigurasGeometricas f : fg) {
			System.out.println("-------------");
			
			if(f instanceof Figuras2D) {
				//downcast
				
				Figuras2D f2D = (Figuras2D) f;
				System.out.println("Nome: " + f2D.getNome());
				System.out.println("Area: " + f2D.area());
			}
			
			if(f instanceof Figuras3D) {
				//downcast
				
				Figuras3D f3D = (Figuras3D) f ;
				System.out.println("Nome: " + f3D.getNome());
				System.out.println("Area: " + f3D.area());
				System.out.println("Volume: " + f3D.volume());
			}
		}
	}

}
