package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Car1", "color1", 2021));
        carList.add(new Car("Car2", "color2", 2022));
        carList.add(new Car("Car3", "color3", 2023));
        carList.add(new Car("Car4", "color4", 2024));
        carList.add(new Car("Car5", "color5", 2025));

    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
