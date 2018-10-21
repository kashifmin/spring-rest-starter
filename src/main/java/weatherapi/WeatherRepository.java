package weatherapi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WeatherRepository extends CrudRepository<Weather, String> {
    List<Weather> findByDateContainingOrderByDate(String date);
}
