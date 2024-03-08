public class WriterInfo {
    public static void main(String[] args) {

        Jacket j1 = new Jacket("LaParma","Awesome",200,"Summer","+");
        System.out.println("Куртка: "+j1.GetDeveloper()+", "+j1.GetStyle()+", "+ j1.GetPrice() + ", " +j1.GetSeason()+", "+j1.GetHood()+", price: "+j1.NewPrice()+".");

        Shirt s1 = new Shirt("Adidas","Not cool",5, 70);
        System.out.println("Майка: "+s1.GetDeveloper()+", "+s1.GetStyle()+", "+s1.GetPrice()+", "+s1.GetLength()+", "+s1.GetWool()+", price: "+s1.NewPrice()+".");

        Pants p1 = new Pants();
        System.out.println("Штаны: "+p1.GetDeveloper()+", "+p1.GetStyle()+", "+p1.GetPrice()+", "+p1.GetSize()+", price: "+p1.NewPrice()+".");
    }
}
