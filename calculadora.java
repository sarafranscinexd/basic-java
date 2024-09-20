import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione a operação: 1(+), 2(-), 3(*), 4(/)");
        int opcao = input.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1: resultado = num1 + num2; break;
            case 2: resultado = num1 - num2; break;
            case 3: resultado = num1 * num2; break;
            case 4: 
                if (num2 != 0) resultado = num1 / num2; 
                else System.out.println("Erro: Divisão por zero."); 
                return;
            default: 
                System.out.println("Operação inválida!"); 
                return;
        }

        System.out.println("Resultado: " + resultado);
        input.close();
    }
}
