package String;

public class Substring {
    public static void substring(String s,int  startindex,int endidex){
        for (int i=startindex;i<endidex;i++){
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s1="Manish Wankhade";
        System.out.println("by user define funtion");
        substring(s1,0,3);
        System.out.println("\nBy substring in built method\n"+s1.substring(0,3));

    }
}
