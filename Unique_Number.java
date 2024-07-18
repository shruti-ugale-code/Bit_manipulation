public class Unique_Number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,2,3,1};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for (int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
