import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vet1[i] = t.nextInt();
        }

        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vet2[i] = t.nextInt();
        }

        System.out.println("\nNúmeros não comuns aos vetores:");
        for (int i = 0; i < 10; i++) {
            int encontrado = 0;
            for (int j = 0; j < 10; j++) {
                if (vet1[i] == vet2[j]) {
                    encontrado = 1;
                    break;
                }
            }
            if (encontrado == 0) {
                System.out.print(vet1[i] + " ");
            }
        }
         for (int i = 0; i < 10; i++) {
            int encontrado = 0;
            for (int j = 0; j < 10; j++) {
                if (vet2[i] == vet1[j]) {
                    encontrado = 1;
                    break;
                }
            }
            if (encontrado == 0) {
                System.out.print(vet2[i] + " ");
            }
        }

        t.close();
    }
}
