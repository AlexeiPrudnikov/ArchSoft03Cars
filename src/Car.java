import java.awt.*;

public abstract class Car {
    private String brand;
    private String model;
    private Color color;
    private TypeCar typeCar;
    private TypeFuel typeFuel;
    private TypeGearBox gearBox;
    private int numberWheels;
    private double engineCapacity;

    public void movement() {

    }

    public void maintenance() {

    }

    public boolean gearShifting() {
        return true;
    }

    public boolean switchHeadLights() {
        return true;
    }

    public boolean switshWipers() {
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }

    public TypeGearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(TypeGearBox gearBox) {
        this.gearBox = gearBox;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
