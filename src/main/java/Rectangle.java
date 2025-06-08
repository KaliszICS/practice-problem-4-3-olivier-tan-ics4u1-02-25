class Rectangle {
    
    private double length;
    private double width;
   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        
    }

    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = 8.0;
    }


    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }
}