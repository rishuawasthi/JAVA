public class enum_demo_2 {
    public static void main(String[] args) {
        laptop l1=laptop.acer;
        System.out.println("THE PRICE OF LAPTOP IS "+l1.getprice());
    }
}

enum laptop {
    hp(2000),asus(2500),acer,dell(1500);
    private int price;
    private laptop(int price )
    {
        this.price =price;
    } 
    private laptop()
    {
        this.price=1000;
    }
    public int getprice()
    {
        return this.price;
    }
    public void setprice(int price )
    {
        this.price=price;
    }
}