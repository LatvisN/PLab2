public class Shirt extends Clothes{
    private int length;
    private int wool;

    public Shirt(String d, String s, int p, int len, int w){
        super (d,s,p);
        length = len;
        wool = w;
    }

    public Shirt(String d, String s, int p, int len){
        super (d,s,p);
        length = len;
        wool = 70;
    }

    public Shirt(){
        super ();
        length = 60;
        wool = 50;
    }

    public int GetLength (){
        return length;
    }

    public int GetWool (){
        return wool;
    }

    public int NewPrice (){
        x = price * 3;
        return x;
    }
}
