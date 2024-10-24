import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Dado {
    private int caras;
    private int resultado;

    public Dado(int caras) {
        this.caras = caras;
        lanzar();
    }

    public void lanzar() {
        resultado = new Random().nextInt(caras) + 1;
    }
    public String toString() {
        return "Dado de " + caras + " caras: " + resultado;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Cuantas caras deseas que tenga el dado 1: ");
	int cara = sc.nextInt();
	Dado dado1 = new Dado(cara);
        dado1.lanzar();
        
        System.out.println("Dado 1: "+dado1);
    }
}
