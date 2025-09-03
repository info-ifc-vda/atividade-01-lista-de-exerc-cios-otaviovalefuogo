import java.util.Scanner;
public class ex8 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        double compra = t.nextDouble();
        System.out.println("Informe o valor da nota do pagamento: ");
        double pagamento = t.nextDouble();
        double troco = pagamento - compra;

         if (troco < 0) {
            System.out.println("Pagamento insuficiente! Faltam R$ " + (troco));
        } 
        else if (troco == 0) {
            System.out.println("Pagamento exato, não há troco.");
        }
        else {
            System.out.printf("\nTroco: R$ %.2f\n", troco);

            
            int centavos = (int)(troco * 100);

           
            int qtd200 = centavos / 20000;
            centavos = centavos % 20000;

            int qtd100 = centavos / 10000;
            centavos = centavos % 10000;

            int qtd50 = centavos / 5000;
            centavos = centavos % 5000;

            int qtd20 = centavos / 2000;
            centavos = centavos % 2000;

            int qtd10 = centavos / 1000;
            centavos = centavos % 1000;

            int qtd5 = centavos / 500;
            centavos = centavos % 500;

            int qtd2 = centavos / 200;
            centavos = centavos % 200;

            
            int qtd1 = centavos / 100;
            centavos = centavos % 100;

            int qtd050 = centavos / 50;
            centavos = centavos % 50;

            int qtd025 = centavos / 25;
            centavos = centavos % 25;

            int qtd010 = centavos / 10;
            centavos = centavos % 10;

            int qtd005 = centavos / 5;
            centavos = centavos % 5;

            int qtd001 = centavos;

            
            System.out.println("\n--- Troco em cédulas e moedas ---");
            if (qtd200 > 0) System.out.println(qtd200 + " x R$200");
            if (qtd100 > 0) System.out.println(qtd100 + " x R$100");
            if (qtd50 > 0) System.out.println(qtd50 + " x R$50");
            if (qtd20 > 0) System.out.println(qtd20 + " x R$20");
            if (qtd10 > 0) System.out.println(qtd10 + " x R$10");
            if (qtd5 > 0) System.out.println(qtd5 + " x R$5");
            if (qtd2 > 0) System.out.println(qtd2 + " x R$2");

            if (qtd1 > 0) System.out.println(qtd1 + " x R$1");
            if (qtd050 > 0) System.out.println(qtd050 + " x 50c");
            if (qtd025 > 0) System.out.println(qtd025 + " x 25c");
            if (qtd010 > 0) System.out.println(qtd010 + " x 10c");
            if (qtd005 > 0) System.out.println(qtd005 + " x 5c");
            if (qtd001 > 0) System.out.println(qtd001 + " x 1c");
        }

        t.close();

    }
}
