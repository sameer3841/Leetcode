package Interview_questions;
import java.util.HashSet;
import java.util.Set;

public class firstDup {

    public static void main(String[] args) {
        int arr1[] = new int[]{2,3,4,3,2};
        System.out.println("First duplicate element is : " + solution(arr1));
    }

    static int solution(int[] a) {
        Set<Integer> track = new HashSet<>();
        for(int i : a)
            if(track.contains(i)) return i;
            else track.add(i);
        return - 1;
}

}
