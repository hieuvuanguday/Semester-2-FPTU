public class Square extends Rectangle{
    String unit;

    public Square(int side) {
        this.unit = "cm";
        this.setLength(side);
        this.setWidth(side);
    }

    public void setSquare(int side) {
        if(side > 0){
            this.setLength(side);
            this.setWidth(side);
        }
    }
    
    public int getPerimeter(){
        return this.getLength()*4;
    }
    
    public void output(){
        System.out.println("the side of the square="+this.getLength()+"("+this.unit+")");
        System.out.println("the perimeter of the square="+this.getPerimeter()+"("+this.unit+")");
    }
    
    
    
}
