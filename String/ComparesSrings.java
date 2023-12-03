package String;

public class ComparesSrings {
    public static void main(String[] args) {


        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("S1 & S2 are equal");

        }
        else {
            System.out.println("Strings S1 & S2 are not equal");
        }
        if (s1==s3){
            System.out.println("S1 & S3 are equal");

        }
        else {
            System.out.println("Strings S1 & S3 are not equal");
        }

        if (s1.equals(s3)){
            System.out.println("Values of Strings s1 &s3 are equal");
        }
        else {
            System.out.println("Values are not equal");
        }


    }
}