
//Operadores Matem�ticos
public class operadoresMatematicos {
	public static void main(String[] arg){
		//Suma y Resta
		int n1,n2,resultado;
		n1 = 5;
		n2 = 6;
		resultado = n1 + n2;
		System.out.println("El resultado de la Suma Es: " + resultado);
		
		resultado = n1 - n2;
		System.out.println("El Resultado de la Resta Es: " + resultado);
		
		//Multiplicai�n y Divisi�n
		resultado = n1 * n2;
		System.out.println("El Resultado de la Multiplicaci�n Es: "+ resultado);
		
		resultado = n2 % n1;
		System.out.println("El Resultado de la Divisi�n Es "+ resultado);
		
		//Incrementar y Decrementar
		
		n1 = 10;
		n2 = 10;
		n1 += 20;
		
		System.out.println("Sumatoria: " + n1);
		
		n1++;
		System.out.println("Incremento: " + n1);
		
		n2--;
		System.out.println("Decremento :"+ n2);
		
		
	}
}
