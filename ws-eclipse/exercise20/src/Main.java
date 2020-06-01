
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); // Transforma tudo em minúsculo.
		String s02 = original.toUpperCase(); // Transforma tudo em maiúscula.
		String s03 = original.trim(); // Elimina os espaços.
		String s04 = original.substring(2); // Gera uma nova String apartir do caractere 2.
		String s05 = original.substring(2, 9); // Recorta nesses intervalos de caractere.
		String s06 = original.replace('a', 'x'); // Troca um caractere por outro.
		String s07 = original.replace("abc", "xy"); // Troca uma String por outra.
		int i = original.indexOf("bc"); 
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9) -" + s05 + "-");
		System.out.println("replace('a', 'x') -" + s06 + "-");
		System.out.println("replace('abc', 'xy') -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last Index of 'bc': " + j);
	}

}
