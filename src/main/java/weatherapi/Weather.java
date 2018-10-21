package weatherapi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "foreca")
public class Weather {
    @Id
    @Column(name = "weather_date")
    private String date;
    private float temperature;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public Weather(String date, float temperature, float humidity) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Weather() {

    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
