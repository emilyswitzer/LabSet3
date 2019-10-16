public class Computer {

    private String id;
    private String make;
    protected Memory size;
    protected  Memory type;

   //Constructor Methods
    public Computer(){


    }
    public Computer(String id, String make, Memory type, Memory size){
     setID(id);
     setMake(make);
     setSize(size);
     setType(type);

    }
    //Accessor
    public String getID() {
        return this.id;
    }
    //Mutator
    public void setID(String id){
    this.id = id;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public Memory getSize(){
        return this.size;
    }
    public void setSize(Memory size) {
         this.size = size;
    }
    public Memory getType(){
        return this.type;
    }
    public void setType(Memory type) {
        this.type = type;
    }

    public String toString(){
        return "ID: "+ id + "Make:" + make + "Memory: " + getType() + getSize();
    }
}