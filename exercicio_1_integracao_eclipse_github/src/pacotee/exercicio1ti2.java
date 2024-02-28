package pacotee;
import java.util.Scanner;
public class exercicio1ti2 {
	public static void main(String[] args) {
        int a, b, c = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduza dois números:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = a + b;

        System.out.println("A soma de a e b é: " + c);
        entrada.close();
    }
}
