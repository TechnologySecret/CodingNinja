
import java.util.Scanner;

public class Demo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int number = s.nextInt();
        printCombination(number);
    }
    public static void printCombination(int num){
        //Write your code here
        printAllUniqueParts(num);

    }
    static void printArray(int p[], int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }
    static void printAllUniqueParts(int n) {
        int[] p = new int[n];
        int k = n-1;
        p[k] = 0;



        while (true) {

            while (k>=0 && p[k]==0){
                p[k]=1;
                k--;
            }
            printArray(p, n-k );
        }
    }
}
