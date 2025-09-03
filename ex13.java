import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[5];

        
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vet1[i] = t.nextInt();
        }

       
        System.out.println("Digite 5 números inteiros para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vet2[i] = t.nextInt();
        }

        
        int[] res1 = new int[10]; 
        for (int i = 0; i < 10; i++) {
            if (vet1[i] % 2 == 0) {  
                int somaVet2 = 0;
                for (int j = 0; j < 5; j++) {
                    somaVet2 += vet2[j];
                }
                res1[i] = vet1[i] + somaVet2;
            } else {
                res1[i] = 0;
            }
        }
 
       
        int[] res2 = new int[10]; 
        for (int i = 0; i < 10; i++) {
            if (vet1[i] % 2 != 0) { 
                int contDiv = 0;
                for (int j = 0; j < 5; j++) {
                    if (vet1[i] % vet2[j] == 0) {
                        contDiv++;
                    }
                }
                res2[i] = contDiv;
            } else {
                res2[i] = 0;
            }
        }

        System.out.println("\nPrimeiro vetor resultante (pares + soma do vet2):");
        for (int i = 0; i < 10; i++) {
            System.out.print(res1[i] + " ");
        }

        System.out.println("\n\nSegundo vetor resultante (quantidade de divisores dos ímpares):");
        for (int i = 0; i < 10; i++) {
            System.out.print(res2[i] + " ");
        }

        t.close();
    }
    
}
