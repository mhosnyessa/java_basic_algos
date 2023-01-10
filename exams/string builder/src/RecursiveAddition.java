public class RecursiveAddition {
    public static int getSum(int[] arr, int n) {
        if (n == 1) {
            return  arr[0] ;
        }

        return (getSum(arr, n - 1) + arr[n - 1]);
    }

}
