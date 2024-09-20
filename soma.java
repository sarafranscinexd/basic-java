import java.util.Scanner; 
    
        public class soma {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma é: " + soma);
        }
    }