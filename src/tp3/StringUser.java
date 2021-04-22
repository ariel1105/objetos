package unq;

public class StringUser {
	
	
	public static void main(String[] args) {

		String a = "abc";
		String s = a;
		
		System.out.println(s.length()); // retorna 3
		// System.out.println(t.length()); error por variable no inicializada
		System.out.println(1+a); // 1 y abc concatenados
		System.out.println(a.toUpperCase()); // abc en mayusculas
		System.out.println("Libertad".indexOf('i')); // posicion de la i en este caso 1
		System.out.println("Universidad".lastIndexOf('i')); // posicion de la ultima i
		System.out.println("Quilmes".substring(2,4)); //corta desde posicion 2 hasta 4
		System.out.println((a.length() + a).startsWith("a")); // falso porq empieza con 1 (length)
		System.out.println(s==a); //true 
		System.out.println(a.substring(1,3).equals("bc")); //true 
}

}	
