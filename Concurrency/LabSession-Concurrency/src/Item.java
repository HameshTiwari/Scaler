
public class Item implements  Comparable<Item>{
    private String ID;
    private String name;
    private double price;
    private int quantity;

    public Item(String Id,String name,double price , int quantity)
    {
        this.ID=Id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item other) {
        //return this.name.compareTo(other.name);
        //return this.price.compareTo(other.price);
        if(this.price < other.price){
            return -1;
        } else if(this.price > other.price){
            return 1;
        }
        return 0;
    }


}
