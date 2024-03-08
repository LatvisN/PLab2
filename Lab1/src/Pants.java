public class Pants extends Clothes{
    public int size;

    public Pants(String d, String s, int p, int sz){
        super (d,s,p);
        size = sz;
    }

    public Pants(String d, String s, int p){
        super (d,s,p);
        size = 140;
    }

    public Pants(){
        super ();
        size = 120;
    }

    public int GetSize (){
        return size;
    }

    public int NewPrice (){
        x = price * 10;
        return x;
    }
}
