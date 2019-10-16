public class Memory extends Computer {

    private String typeofMem;
    private int sizeofMem;

    public Memory(){

    }
    public Memory(String typeofMem, int sizeofMem){
        setTypeofMem(typeofMem);
        setSizeofMem(sizeofMem);
    }
    public String getTypeofMem(){
        return this.typeofMem;
    }
    public int getSizeofMem(){
        return this.sizeofMem;
    }

    public void setSizeofMem(int sizeofMem) {
        this.sizeofMem = sizeofMem;
    }

    public void setTypeofMem(String type) {
        this.typeofMem = type;
    }

    public String toString() {
        return "Type: " + getTypeofMem() +
                "Size: " + getSizeofMem();
    }
}
