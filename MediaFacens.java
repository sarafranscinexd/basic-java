import java.util.Scanner;

public class MediaFacens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("AC1: ");
        double ac1 = scanner.nextDouble();
        System.out.print("AC2: ");
        double ac2 = scanner.nextDouble();
        System.out.print("AF: ");
        double af = scanner.nextDouble();
        System.out.print("AG: ");
        double ag = scanner.nextDouble();
        System.out.print("nota mínima para ser aprovado: ");
        double notaMinima = scanner.nextDouble();

        double mediaFinal = (ac1 * 0.15) + (ac2 * 0.30) + (af * 0.45) + (ag * 0.10);

        System.out.printf("Sua nota final é:", mediaFinal);

        if (mediaFinal >= notaMinima) {
            System.out.println("aprovado!");
        } else {
            System.out.println("reprovado.");
        }
        
        scanner.close(); 
    }
}

