import javax.swing.event.DocumentEvent;

public class Clothes {
    protected String developer;
    protected String style;
    protected int price;

    int x;

    public Clothes(String d, String s, int p){
        developer = d;
        style = s;
        price = p;
    }
    public Clothes(){
        developer = "Nike";
        style = "Cool";
        price = 25;
    }

    public String GetDeveloper (){
        return developer;
    }

    public String GetStyle (){
        return style;
    }

    public int GetPrice (){
        return price;
    }

    public int NewPrice(){
        x = price * 2;
        return x;
    }
}
