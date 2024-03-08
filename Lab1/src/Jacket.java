public class Jacket extends Clothes{
    private String season;
    private String hood;

    public Jacket(String d, String s, int p, String season, String hood){
        super (d,s,p);
        this.season = season;
        this.hood = hood;
    }

    public Jacket(String d, String s, int p){
        super (d,s,p);
        season = "Осенний";
        hood = "Капюшон в наличии";
    }

    public Jacket(){
        super ();
        season = "Летний";
        hood = "Капюшон отсутствует";
    }

    public String GetSeason (){
        return season;
    }

    public String GetHood (){
        return hood;
    }

    public int NewPrice (){
        x = price * 5;
        return x;
    }
}
