package Backtracking;

public class String_subsetss {

    public static void findSubsets(String str,String ans,int i){
        //Base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null");
            }
            System.out.print(ans+" ");
            return;
        }

        //Recursion
        //for Yes choice
        findSubsets(str,ans+str.charAt(i),i+1);
        //for NO choice
        findSubsets(str,ans,i+1);
    }


    public static void main(String[] args) {
        String str="abc";
        System.out.println("the subset of "+str+" is with TC(n*2^n)");
        findSubsets(str,"",0);

    }
}
