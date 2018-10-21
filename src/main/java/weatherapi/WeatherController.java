package weatherapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class WeatherController {
    @Autowired
    WeatherRepository weatherRepository;

    @GetMapping("/weather")
    public @ResponseBody  Iterable<Weather> getWeatherForMonth(@RequestParam String monthString) {
        return weatherRepository.findByDateContainingOrderByDate(monthString);
    }
}
