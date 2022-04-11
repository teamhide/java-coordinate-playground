package rentCar.domain;

public class Sonata extends RentCar {
    private final double FUEL_EFFICIENCY = 10;
    private String name;

    public Sonata(int distance) {
        this.distance = distance;
        this.name = "Sonata";
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
