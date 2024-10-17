public class Main{
	public static void main (String[] args){
	
	try{
		for(int i=0; i < args.legth(); i++){
			System.out.println("Argumento " + args[i]);
		}
	}catch(IndexOutOfBoundsException e){
		System.out.println("Error :" + e);
	}
		
}
