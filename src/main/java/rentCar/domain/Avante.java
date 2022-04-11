package rentCar.domain;

public class Avante extends RentCar {
    private final double FUEL_EFFICIENCY = 15;
    private String name = "Avante";

    public Avante(int distance) {
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
