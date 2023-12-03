package OOPS;

//to impliment multiple inheritance
//All methods are public and abstract
//Idea of total abstraction
// variables in inrterfaces are public static and final
//implements keyword used
//multiple interfaces happen
public class Inteerfaces {
    public static void main(String[] args) {
        Queen q =new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }

}

interface Chess{
    void moves();//by default it is abstract and public
}
class Queen implements Chess{
    public void moves(){// public because in class by default it is Default access modifier but interfaces has public method
        System.out.println("Left, right ,up,down (diagonally)");
    }


}
class Rook implements Chess{

    public void moves() {
        System.out.println("Left, right ,up, down (by 1)");
    }
}

