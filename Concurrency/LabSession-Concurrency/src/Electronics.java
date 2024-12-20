public class Electronics extends Item {
    int warranty;

    public Electronics(String Id,String name,double price,int quantity,int warranty){
        super( Id, name, price, quantity);
        this.warranty=warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
