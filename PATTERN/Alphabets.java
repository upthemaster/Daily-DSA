import java.util.Scanner;
// HALF-PYRAMID
public class Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Lines: ");
        int n = sc.nextInt();
        int ch = 1;
        for(int i = 1;i<=n;i++){
            for(int chars = 1; chars<=i;chars++){
                System.out.print(" "+ch);
                ch++;
            }
            System.out.println("");
        }

    }

}
    
