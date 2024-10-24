import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Dados {
    private int caras;
    private int resultado;
	
    public Dados(int caras) {
        this.caras = caras;
        lanzar();
    }

    public void lanzar() {
        resultado = new Random().nextInt(caras) + 1;
    }
    public String toString() {
        return "Dado de " + caras + " caras tiene un valor de: " + resultado;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("cuantos dados quieres tirar");
	int cantidad = sc.nextInt();
	for(int i=0; i< cantidad;i++){
		System.out.println("Cuantas caras deseas que tenga el dado "+(i+1)+": ");
		int cara = sc.nextInt();
		Dados dado = new Dados(cara);
        	dado.lanzar();
	        System.out.println("Dado "+(i+1)+": "+dado);
        }
    }
}
