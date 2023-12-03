package String;

public class SttringCompress {
    public static String compress(String str){
        String latest="";
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while ( i<str.length()-1 &&  str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            latest +=str.charAt(i);
            if(count>1){
                latest+=count.toString();
            }
        }
        return latest;
    }

    public static void main(String[] args) {
        String str="aaabbccccdddeeee";
        System.out.println("The commpress string of "+str+" is\n"+compress(str));

    }
}
