public class PickUp extends Car implements IRefueling, IWipe{
    public int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadLights() {

    }

    @Override
    public void wipMirrors() {

    }
}
