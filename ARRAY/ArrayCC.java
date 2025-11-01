import java.util.Scanner;
public class ArrayCC{
    public static void main(String[] args) {
        //Declaration of Array
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        //Input
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        //Output
        System.out.println("P: "+ marks[0]);
        System.out.println("C: "+ marks[1]);
        System.out.println("M: "+ marks[2]);
        //Update
        marks[2] = marks[2]+1;
        System.out.println("M: "+ marks[2]);
        //Percentage
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage is: "+percentage);

    }
}