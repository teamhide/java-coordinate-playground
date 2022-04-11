package rentCar.domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    List<RentCar> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(RentCar car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder builder = new StringBuilder();

        for (RentCar car : cars) {
            builder.append(car.getName())
                .append(" : ")
                .append((int) car.getChargeQuantity())
                .append("리터\n");
        }
        return builder.toString();
    }
}
