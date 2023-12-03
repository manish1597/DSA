package Array;


public class ArrayelementsSum {
    public static int arraySum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        int a[]={3,6,12,18};
        System.out.println("The sum of array elements is \n"+arraySum(a));

    }
}
