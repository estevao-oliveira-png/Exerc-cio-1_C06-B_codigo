import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // Habilita a leitura de dados que o usuário vai digitar no teclado
        Scanner teclado = new Scanner(System.in);

        // 1. RECEBER AS QUANTIDADES (Lendo como texto e convertendo para número inteiro)
        System.out.print("Quantidade de ingressos INTEIROS vendidos: ");
        int qtdInteira = Integer.parseInt(teclado.nextLine());

        System.out.print("Quantidade de ingressos MEIA-ENTRADA vendidos: ");
        int qtdMeia = Integer.parseInt(teclado.nextLine());

        // 2. RECEBER OS VALORES E TRATAR A VÍRGULA
        System.out.print("Valor do ingresso inteiro (ex: 35,50): R$ ");
        // O replace(",", ".") troca a vírgula brasileira pelo ponto exigido pelo Java
        String inputInteira = teclado.nextLine().replace(",", ".");
        double valorInteira = Double.parseDouble(inputInteira); // Converte o texto tratado para número decimal

        System.out.print("Valor do ingresso meia-entrada (ex: 17,50): R$ ");
        String inputMeia = teclado.nextLine().replace(",", ".");
        double valorMeia = Double.parseDouble(inputMeia);

        // 3. FAZER OS CÁLCULOS MATEMÁTICOS
        double totalInteira = qtdInteira * valorInteira;
        double totalMeia = qtdMeia * valorMeia;
        double valorTotalSessao = totalInteira + totalMeia;

        int totalIngressos = qtdInteira + qtdMeia;
        double valorMedio = valorTotalSessao / totalIngressos;

        // 4. IMPRIMIR OS RESULTADOS NA TELA
        System.out.println("\n--- RESULTADO DA SESSÃO ---");
        // O "%.2f" serve para formatar o número para ter apenas duas casas decimais (padrão de moeda)
        System.out.printf("Total Inteira: R$ %.2f\n", totalInteira);
        System.out.printf("Total Meia: R$ %.2f\n", totalMeia);
        System.out.printf("Total Geral: R$ %.2f\n", valorTotalSessao);
        System.out.printf("Valor Médio por ingresso: R$ %.2f\n", valorMedio);

        // Fecha o leitor do teclado para não gastar memória do computador
        teclado.close();
    }
}