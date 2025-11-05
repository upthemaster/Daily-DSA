import java.util.*;
public class Funpara {

    public static void withparameter(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: "+sum);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        withparameter(c,d);
        
    }
    
    
}
