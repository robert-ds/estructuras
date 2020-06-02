import java.util.Scanner;

public class manejoIndices {
	public static void main(String[] arg){
		String[] name = new String[4];
		Scanner leer;
		leer = new Scanner(System.in);
		
		int i;
		
		for(i = 0; i < name.length; i++ ){
			System.out.println("Escriba los Nombres: ");
			name[i] = leer.next();
		}
		
		for(i = 0; i < name.length; i++){
			System.out.println("Nombres: " + name[i]);
		}
		
		
	}
}
