import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        System.out.println("Informe o numero que deseja verificar se e primo: ");
        int n = t.nextInt();
        int p=0;
        if(n <= 1) {
            p=1;
        }
        else if(n==2){
            p=0;
        }
        else{
            for(int i=2; i<n; i++){
                if(n%i==0){
                    p=1;
                    break;
                }
            }
            
        }
        if(p==1){
            System.out.println(n + ": nao e primo.");
        }
        else{
            System.out.println(n + ": e primo.");
        }
        t.close();
    }
}
