public class find_ith_bit {
    public static void main(String[] args) {
        int n=1;
        System.out.println(check(n));

    }
    public static int check(int n){

        return n&(1<<(n-1));
    }
}


