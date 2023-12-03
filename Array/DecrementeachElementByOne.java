package Array;



public class DecrementeachElementByOne {
    public static int[] decrementArrayElements(int[] numbers){

        for(int i=0;i<numbers.length;i++){
            numbers[i]-=1;

        }
        return numbers;
//        int decre[]=new int[numbers.length];
//        for(int i=0;i<numbers.length;i++){
//            decre[i]= numbers[i]-1;
//        }
//        return decre;


    }

    public static void main(String[] args) {
        int numbers[]={21,54,76,12,66};


        int latest[]= decrementArrayElements(numbers);
        for (int i=0;i<latest.length;i++){

            System.out.print(numbers[i]+"="+latest[i]+" ");
        }

    }
}
