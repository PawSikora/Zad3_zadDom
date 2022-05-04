package pl.jwpkg.springdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/cars")
public class CarApi {
    private CarManager cars;

    @Autowired
    public CarApi(CarManager cars) { this.cars = cars; }

    @GetMapping("/all")
    public Iterable<Car> getAll() {
       return cars.findAll();
    }

    @GetMapping("/id")
    public Optional<Car> getById(@RequestParam long index) {
        return cars.findAllById(index);
    }

    @GetMapping
    public List<Car> getByColor(@RequestParam Color color) {
        return cars.findAllByColor(color);
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return cars.save(car);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car) {
        return cars.save(car);
    }

    @DeleteMapping
    public void deleteCar(@RequestParam long index) {
        cars.delete(index);
    }

}
