import java.util.Scanner;  
public class ex11 {
    public static void main(String[] args) {
        Scanner t =new Scanner(System.in);
       
        int cont=0;

        System.out.println("Valor  |  Cubo  |  Raiz Quadrada");
        System.out.println("-------------------------------");

        for (;;) { // laço infinito
            System.out.print("Digite um número (0 ou negativo para sair): ");
            double num = t.nextDouble();

            if (num <= 0) {
                break;
            }

            double cubo = num * num * num;
            double raiz = Math.sqrt(num);
            System.out.println(num + "  |  " + cubo + "  |  " + raiz);

            cont++;

            if (cont % 20 == 0) {
                System.out.println("\nValor  |  Cubo  |  Raiz Quadrada");
                System.out.println("-------------------------------");
            }
        }

        System.out.println("Programa finalizado.");
        t.close();
    }
}
