package String;

public class FirstLettertoUppercase {

    public static String uppercase(String str){
       StringBuilder sb= new StringBuilder("");
       char ch=Character.toUpperCase(str.charAt(0));
       sb.append(ch);
       for (int i=1;i<str.length();i++){//start from 1 because 0th index is already convert to upper case and append to string builder
           if(str.charAt(i)==' '&&i<str.length()-1){//-1 for avoiding last space
               sb.append(str.charAt(i));//appending space
               i++;//for space next character
               sb.append(Character.toUpperCase(str.charAt(i)));
           }else {
               sb.append(str.charAt(i));
           }

       }
       return sb.toString();
    }

    public static void main(String[] args) {
        String str="hi i am manish";
        System.out.println("The Representation of first letter into upper case of each word is");
        System.out.println(uppercase(str));
    }
}
