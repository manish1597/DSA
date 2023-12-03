package String;

public class Panagram {
    static boolean ispanagram(String str){

        int n =str.length();
        if(n<26){
            return false;
        }
        String s=str.toLowerCase();
        for (char c='a';c<='z';c++){
            if(s.indexOf(c)<0){//Here we use  index function because if character not present in string it return negative value
                return false;
            }
        }
        return true;
    }
    static boolean panagram(String str){
        int n =str.length();
        if(n<26){
            return false;
        }
        boolean visited[]= new boolean[26];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                visited[ch-'a']=true;
            }
            if(ch>='A'&&ch<='Z'){
                visited[ch-'A']=true;
            }
        }
        for (int i=0;i<26;i++){
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }



    public static void main(String args[])
    {
        String s = "The quick brown fox jumps oerv the lazy dog";
     //   System.out.println(panagram(s));
        System.out.println(ispanagram(s));


    }
}
