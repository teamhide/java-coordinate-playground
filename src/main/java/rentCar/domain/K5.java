package rentCar.domain;

public class K5 extends RentCar {
    private final double FUEL_EFFICIENCY = 13;
    private String name = "K5";

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return FUEL_EFFICIENCY;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return name;
    }
}
