import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        patternPrinter(n);
    }

    static void patternPrinter(int n) {

        for(int i =n-1;i>=0;i--){
            int starter  = n;
            for(int j = 0;j<n;j++){

                for(int k =0;k<=i;k++){
                    System.out.print(starter);
                }
                starter--;
            }
            System.out.println();

        }
    }
}
