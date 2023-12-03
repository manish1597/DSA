package Array;



import java.util.Arrays;

public class PrintSubarray {
    static void Printsub(int n[]){
        int total_pairs=0;
        for(int i=0;i<n.length;i++){
            int start=i;//2 comes in start
            for(int j=i;j<n.length;j++){
                int end=j;//here 2 comes in end
                for(int k=start;k<=end;k++){//we have to make pairs in between start and end
                    System.out.print(n[k]+" ");

                }
                total_pairs++;

                System.out.println();//for second iteration of j =4 and pairs with 2&4 then j=6 pairs with 2,4&6
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+total_pairs);
    }

    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        System.out.println("Pairs....");
        Printsub(n);

    }
}
