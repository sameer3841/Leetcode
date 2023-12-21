import java.util.Arrays;

public class Statues {
    public static void main(String[] args) {
        int[] n = {6,2,3,8};
        System.out.println(solution(n));
    }

    public static int solution(int[] statues){
        Arrays.sort(statues);
        int ans = 0;
        for(var i = statues[0]; i < statues[statues.length-1]; i++){
            if(!Arrays.asList(statues).contains(i)) ans++;
        }
        return ans;
    }
}
