import java.util.Arrays;

public class Main {

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int last = arr[0], x = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == last) {
                arr[i] = x;
            } else {
                last = arr[i];
                x++;
                arr[i] = x;
            }
        }
        arr[0] = 1;
        return Arrays.stream(arr).max().getAsInt();
    }
    public static void main(String[] args) {
        int[] arr = {73,98,9};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }
}