import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de ingressos INTEIROS vendidos: ");
        int qtdInteira = Integer.parseInt(teclado.nextLine());

        System.out.print("Quantidade de ingressos MEIA-ENTRADA vendidos: ");
        int qtdMeia = Integer.parseInt(teclado.nextLine());

        System.out.print("Valor do ingresso inteiro (ex: 35,50): R$ ");
        String inputInteira = teclado.nextLine().replace(",", ".");
        double valorInteira = Double.parseDouble(inputInteira);

        System.out.print("Valor do ingresso meia-entrada (ex: 17,50): R$ ");
        String inputMeia = teclado.nextLine().replace(",", ".");
        double valorMeia = Double.parseDouble(inputMeia);

        double totalInteira = qtdInteira * valorInteira;
        double totalMeia = qtdMeia * valorMeia;
        double valorTotalSessao = totalInteira + totalMeia;

        int totalIngressos = qtdInteira + qtdMeia;
        double valorMedio = valorTotalSessao / totalIngressos;

        System.out.println("\n--- RESULTADO DA SESSÃO ---");
        System.out.printf("Total Inteira: R$ %.2f\n", totalInteira);
        System.out.printf("Total Meia: R$ %.2f\n", totalMeia);
        System.out.printf("Total Geral: R$ %.2f\n", valorTotalSessao);
        System.out.printf("Valor Médio por ingresso: R$ %.2f\n", valorMedio);

        teclado.close();
    }
}
