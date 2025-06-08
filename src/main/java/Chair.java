public class Chair {
    private int legs;
    private String material;

    public Chair(int legs, String material){
        this.legs = legs;
        this.material = material;
    }

    public Chair(){
        this.legs = 4;
        this.material = "wood";
    }

    public Chair(int legs){
        this.legs = legs;
        this.material = "wood";
    }

    public int getLegs(){
        return this.legs;
    }

    public String getMaterial(){
        return this.material;
    }
}