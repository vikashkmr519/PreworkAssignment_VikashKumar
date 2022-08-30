import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumberFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(missingNumberFinder(arr, size));
    }
    static int missingNumberFinder(int array[], int n) {

        Set<Integer> set = new HashSet<>();
        for(int arr : array){
            set.add(arr);
        }
        int ans =0;
        for(int i =1 ;i<=n;i++){
            if(!set.contains(i)){
                ans = i;
                break;
            }
        }

        return ans;

    }
}
