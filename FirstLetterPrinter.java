import java.util.Scanner;

public class FirstLetterPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in .nextLine();
        System.out.println(firstLetterPrinter(input));
    }
    static String firstLetterPrinter(String str) {
        String[] words = str.split(" ");

        String ans= "";
        for(String word : words){
            if(word!=null){
                ans+=word.charAt(0);
            }
        }

        return ans;
    }
}
