import java.util.Scanner;
public class ex5{
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);

        int j18 = 0;
        double midade = 0;
        double maltura = 0;
        double p80 = 0;
        int totalJogadores = 0;

        for(int i = 0; i < 5; i++){
            int somai = 0;

            System.out.println("\nTime " + (i + 1));

            for(int j = 0; j < 11; j++){
                System.out.println("Informe a idade do jogador " + (j+1));
                int idade = t.nextInt();

                System.out.println("Informe o peso do jogador " + (j+1));
                double peso = t.nextDouble();

                System.out.println("Informe a altura do jogador " + (j+1));
                double altura = t.nextDouble();

                if(idade < 18){
                    j18++;
                }

                somai += idade;

                if (peso > 80) {
                    p80++;
                }

                totalJogadores++;
                maltura += altura;
            }

            midade = somai / 11.0;
            System.out.println("Média das idades do time " + (i + 1) + ": " + midade);
        }

        double mediaAltura = maltura / totalJogadores;
        double perc80 = (p80 * 100.0) / totalJogadores;

        System.out.println("\n=== Resultados Gerais ===");
        System.out.println("Quantidade de jogadores com idade < 18: " + j18);
        System.out.println("Média das alturas de todos os jogadores: " + mediaAltura);
        System.out.println("Percentual de jogadores com mais de 80kg: " + perc80 + "%");

        t.close();
    }
}