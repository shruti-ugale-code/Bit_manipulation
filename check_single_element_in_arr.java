public class check_single_element_in_arr {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5};
        System.out.println(check(arr));

    }
    public static int check(int arr[]){
        int unique=0;
        for (int i :arr) {
            unique^=i;

        }
        return unique;
    }
}
