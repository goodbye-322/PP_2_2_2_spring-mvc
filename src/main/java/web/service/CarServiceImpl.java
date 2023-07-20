package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("blue", "Nissan", 2002));
        cars.add(new Car("red", "Mazda", 1999));
        cars.add(new Car("black", "Mercedes", 1989));
        cars.add(new Car("white", "Opel", 1986));
        cars.add(new Car("yellow", "VAZ", 1982));
    }

    @Override
    public List<Car> getListCar(int count) {
        return cars.stream().limit(count).toList();
    }

}
