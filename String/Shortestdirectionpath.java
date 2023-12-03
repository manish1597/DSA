package String;

public class Shortestdirectionpath {
    public static float shortesrDirectionPath(String path){
        int x=0;
        int y=0;
        for (int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //North
            if(dir=='N'){
                y++;

            } else if (dir =='S') {
                y--;

            } else if (dir=='E') {
                x++;


            }
            else {
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }



    public static void main(String[] args) {
        String path="WNEENESENNN";
        String p="NS";

        System.out.print("The shortest path of "+path+" is \n"+shortesrDirectionPath(path));

    }
}
