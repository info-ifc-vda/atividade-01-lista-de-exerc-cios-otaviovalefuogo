import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int p =0;
        int cont=0;
        for(int i=0;i<10;i++){
            System.out.println("Informe o " + (i+1) + " numero: ");
            int n = t.nextInt();
            if(n>=2){
                for(int j=2;j<n;j++){
                    if(n%j==0){
                        p=1;
                        break;
                    }
                }
                if(p==0){
                    cont++;
                }
                p=0;
            }
        }
        System.out.println("Quantidade de numeros primos: " + cont);
        
        
         t.close();
        
        
    }
}
