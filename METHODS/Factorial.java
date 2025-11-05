public class Factorial {
    
    public static int fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        // int n = 0;
        // int factor = fact(n);
        // System.out.println("The factorial of n is: "+factor);
         System.out.println(fact(3));
    }
    
}
