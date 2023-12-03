package Array;


//Total no. of pairs=n(n-1)/2
//Time complexity O(n^2)
public class PrintPairs {

    public static void Printpairs(int n[]){
        int total_pairs=0;
        for(int i=0;i<n.length;i++){//Outer loop for array
            int current=n[i];//Here current value is 2 in firsr iterartion then we can make pairs with 2
            for(int j=i+1;j<n.length;j++){//here i+1 because we have to make pairs with 4,6,8,10
                System.out.print("("+current+","+n[j]+")");
                total_pairs++;
            }
            System.out.println();

        }
        System.out.println("Total no. of pairs"+"="+total_pairs);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        System.out.println("Pairs......");
        Printpairs(numbers);

    }
}
