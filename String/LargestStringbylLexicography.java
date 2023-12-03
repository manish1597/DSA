package String;

public class LargestStringbylLexicography {
    public static void main(String[] args) {
        String  fruits[]={"Apple","Mango","Bannana"};
        String largest=fruits[0];//String is immutable in java but largest is not string object it is reference variable

        for (int i=0;i< fruits.length;i++){
            if (largest.compareTo(fruits[i])<0){
                largest=fruits[i];

            }
        }
        System.out.println("Largest element by lexography is\n"+largest);


    }
}
