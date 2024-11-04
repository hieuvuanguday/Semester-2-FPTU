public class Car {
    //fields
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;
    //methods
    public Car() {
        Colour = "";
        EnginePower = 0;
        Convertible = false;
        ParkingBrake = false;
    }
    
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour=Colour;
        this.EnginePower=EnginePower;
        this.Convertible=Convertible;
        this.ParkingBrake=ParkingBrake;
    }
    
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    
    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("Colour: "+Colour);
        System.out.println("Engine power: "+EnginePower);
        System.out.println("Convertible: "+Convertible);
        System.out.println("Parking brake: "+ParkingBrake);
    }
    
    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }
}