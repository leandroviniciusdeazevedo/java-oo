package br.com.imposto;

/*Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuario) os quais podem ser
pessoa fisica ou pessoa juridica, e depois mostrar o valor do imposto pago por cada um, bem como o total
de imposto arrecadado

Os dados de pessoa fisica sao: nome, renda anual e gastos com saude. Os dados de pessoa juridica sao
nome, renda anual e numero de fucnionarios. As regras para calculo de imposto sao as seguintes:

Pessoa fisica: pessoas cuja renda foi abaixo de 20000 pagam 15% de imposto. Pessoas com renda de 20000 em diante
pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
Exemplo: um pessoa cuja renda foi 50000 e teve 2000 em gastos com saude, o imposto fica:
(50000 * 25%) - (2000 * 50%) = 11500

Pessoa juridica: pessoas juridicas pagam 16% de imposto. Porem, se a empresa possuir mais de 10 funcionarios,
ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000 e possui 25 funcionarios, o imposto fica: 400000 * 14% = 56000
 */

import br.com.imposto.model.entity.Company;
import br.com.imposto.model.entity.Individual;
import br.com.imposto.model.entity.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<TaxPayer> payerList = new ArrayList<>();
        System.out.print("Digite a quantidade de contribuintes: ");
        int n = scanner.nextInt();
        for (int i= 0; i < n; i++){
            scanner.nextLine();
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o rendimento anual: ");
            double renda = scanner.nextDouble();
            System.out.println("Digite 1 para PF ou 2 para PJ: ");
            int p = scanner.nextInt();
            if (p == 1){
                System.out.println("Digite os gastos com saude: ");
                double gastos = scanner.nextDouble();
                payerList.add(new Individual(nome, renda, gastos));
            } else if (p == 2){
                System.out.println("Digite o numero de fucionarios: ");
                int f = scanner.nextInt();
                payerList.add(new Company(nome, renda, f));
            }
        }
        double totalTax = 0.0;
        for (TaxPayer taxPayer : payerList){
            System.out.print("Nome: " + taxPayer.getName());
            System.out.printf(" - Imposto pago: R$ %.2f%n", taxPayer.tax());
            totalTax += taxPayer.tax();
        }
        System.out.printf("Total arrecadado: R$ %.2f", totalTax);
        scanner.close();
    }
}
