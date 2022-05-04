package pl.jwpkg.springdate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepo extends CrudRepository<Car,Long> {
    List<Car> findAllByKolor(Color color);

}
