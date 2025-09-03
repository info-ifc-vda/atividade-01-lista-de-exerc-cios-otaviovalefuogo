import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int[] codigos = new int[10];
        double[] saldos = new double[10];

        for (int i = 0; i < 10; i++) {
            int codigo;
            int repetido;

            do {
                System.out.print("Digite o código da conta " + (i + 1) + ": ");
                codigo = t.nextInt();

                repetido = 0;
                for (int j = 0; j < i; j++) {
                    if (codigos[j] == codigo) {
                        System.out.println("Código já cadastrado. Digite outro.");
                        repetido = 1;
                    }
                }
            } while (repetido == 1);

            codigos[i] = codigo;

            System.out.print("Digite o saldo da conta " + codigo + ": R$ ");
            saldos[i] = t.nextDouble();
        }

        for (;;) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Efetuar depósito");
            System.out.println("2 - Efetuar saque");
            System.out.println("3 - Consultar ativo bancário");
            System.out.println("4 - Finalizar programa");
            System.out.print("Escolha uma opção: ");
            int opcao = t.nextInt();

            if (opcao == 4) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (opcao == 1) {
                System.out.print("Digite o código da conta para depósito: ");
                int codDep = t.nextInt();
                int posDep = -1;
                for (int i = 0; i < 10; i++) {
                    if (codigos[i] == codDep) {
                        posDep = i;
                    }
                }
                if (posDep == -1) {
                    System.out.println("Conta não encontrada.");
                } else {
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valor = t.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Valor inválido.");
                    } else {
                        saldos[posDep] += valor;
                        System.out.println("Depósito efetuado. Novo saldo: R$ " + saldos[posDep]);
                    }
                }
            }

            if (opcao == 2) {
                System.out.print("Digite o código da conta para saque: ");
                int codSaq = t.nextInt();
                int posSaq = -1;
                for (int i = 0; i < 10; i++) {
                    if (codigos[i] == codSaq) {
                        posSaq = i;
                    }
                }
                if (posSaq == -1) {
                    System.out.println("Conta não encontrada.");
                } else {
                    System.out.print("Digite o valor do saque: R$ ");
                    double valor = t.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Valor inválido.");
                    } else if (valor > saldos[posSaq]) {
                        System.out.println("Saldo insuficiente. Saldo atual: R$ " + saldos[posSaq]);
                    } else {
                        saldos[posSaq] -= valor;
                        System.out.println("Saque efetuado. Novo saldo: R$ " + saldos[posSaq]);
                    }
                }
            }

            if (opcao == 3) {
                double ativo = 0;
                for (int i = 0; i < 10; i++) {
                    ativo += saldos[i];
                }
                System.out.println("Ativo bancário total: R$ " + ativo);
            }

            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }

        t.close();
    }
}
