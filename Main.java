import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		System.out.println("Hola haber si muestra algo esto");
		caras();
		for(int i=0; i < args.length; i++){
			System.out.println("Argumento " + args[i]);
		}

		if(args.length == 0){
			System.out.println("No hay argumentos");
		} else {
			System.out.println("Hay " +args.length + " argumentos");
		}
	}
	
	public static void caras(){
		System.out.println("elige cuantas caras debe tener el dado");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		System.out.println("Has elegido: " +opcion);
	}
	
	
}
