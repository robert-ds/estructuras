
public class Switch {
	public static void main(String[] arg){
		int n = 10;
		
		String name = "Robert";
		
		switch(name){
			case "Robert":
				System.out.println("Caso 1 " + name);
				break;
			
			case "Andres":
				System.out.println("Caso 2");
				break;
			
			case "Lopez":
				System.out.println("Caso 3");
				break;
			
			default:
				System.out.println("Ningun Caso");
				break;
			
		}
	}
}
