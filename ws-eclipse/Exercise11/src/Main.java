
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco = 34.45;
		double desconto;
		if(preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
	}
	
		// Express�o condicional tern�ria (Funciona da mesma maneira que o c�digo de cima.)
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
}
