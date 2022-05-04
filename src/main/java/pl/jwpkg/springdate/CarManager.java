package pl.jwpkg.springdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarManager {
    private CarRepo carRepo;

    @Autowired
    public CarManager(CarRepo carRepo) { this.carRepo = carRepo; }

    public Optional<Car> findAllById(Long id) {
        return carRepo.findById(id);
    }

    public Iterable<Car> findAll() {
        return carRepo.findAll();
    }

    public Car save(Car car) {
        return carRepo.save(car);
    }

    public void delete(Long id) {
        carRepo.deleteById(id);
    }

    public List<Car> findAllByColor(Color color) {
        return carRepo.findAllByKolor(color);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDb() {
        save(new Car("Opel", "Zafira", Color.BLUE));
        save(new Car("Audi", "M1", Color.RED));
        save(new Car("Porsche", "M2", Color.BLACK));
    }
}
