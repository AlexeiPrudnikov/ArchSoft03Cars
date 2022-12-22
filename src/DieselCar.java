public class DieselCar extends Car implements IRefueling{
    public DieselCar() {
        setTypeFuel(TypeFuel.DIESEL);
    }
    @Override
    public void fuel() {

    }
}
