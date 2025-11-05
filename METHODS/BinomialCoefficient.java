public class BinomialCoefficient {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int BinCoeff(int n, int r) {
        int n_fact = factorial(n);
        System.out.println("Factorial of n:"+n_fact);
        int r_fact = factorial(r);
        System.out.println("Factorial of r:"+r_fact);
        int nmr = factorial(n-r);
        System.out.println("Factorial of nmr:"+nmr);
        int BinCoeff = n_fact/(r_fact * nmr);
        return BinCoeff;
    }
    public static void main(String[] args) {
       System.out.print("Binomial Coefficient is: "+BinCoeff(5,0));

    }
    
}
