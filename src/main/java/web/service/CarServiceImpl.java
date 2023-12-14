package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList = Arrays.asList(new Car(11, "model1", "Owner1"),
            new Car(22, "model2", "Owner2"),
            new Car(33, "model3", "Owner3"),
            new Car(44, "model4", "Owner4"),
            new Car(55, "model5", "Owner5"));

    @Override
    public List<Car> getCars(Integer count) {
        count = (count == null || count > 5) ? 5 : count < 0 ? 0 : count;
        return carList.stream().limit(count).toList();
    }
}