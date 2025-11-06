import java.util.Scanner;
// HALF-PYRAMID
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Lines: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            for(int num=1;num<=i;num++){
                System.out.print(num);
            }
            System.out.println("");
        }
    }
    
}
