public class House extends Person {

    private String address;
    private String type;
    private float price;


public House(){

    }
    public House(String address, String type, float price, String owner) {
        super(owner);
        setAddress(address);
        setType(type);
        setPrice(price);
    }
    public String getAddress(){
    return this.address;


}
  public String getType(){
    return this.type;
  }
  public double getPrice(){
    return this.price;
  }
  public void setAddress(String address){
    this.address = address;
  }
  public void setType(String type){
    this.type = type;
  }
  public void setPrice(float price){
    this.price=price;
  }
    public String toString(){
        return String.format("Address: %s\nType: %s\nPrice: €%.2f\nOwner: %s", getAddress(),getType() ,getPrice(),super.toString());
  }
}