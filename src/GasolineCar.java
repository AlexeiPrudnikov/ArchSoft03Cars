public class GasolineCar extends Car implements IRefueling{
    public GasolineCar() {
        setTypeFuel(TypeFuel.GASOLINE);
    }
    @Override
    public void fuel() {

    }
}
