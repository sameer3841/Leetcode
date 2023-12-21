public class rotateImg {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(solution(matrix));
    }
    
    static int[][] solution(int[][] a) {
        int[][] ans = new int[a.length][a.length];
        int track = 0;
        for(int c = a.length - 1; c >= 0; c--){
            for(int r = 0; r < a.length; r++)
                ans[r][track] = a[c][r];
            track++;
        }
        return ans;
    }
}
