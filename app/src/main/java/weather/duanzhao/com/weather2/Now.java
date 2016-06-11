package weather.duanzhao.com.weather2;

import java.io.Serializable;

/**
 * Created by windows on 2016/6/9.
 */
public class Now  implements Serializable{
    private String temp;
    private String humidity;
    private String wind_direction;
    private String time;
    private String wind_strength;

    public Now() {
    }

    public Now(String temp, String humidity, String wind_direction, String time, String wind_strength) {
        this.temp = temp;
        this.humidity = humidity;
        this.wind_direction = wind_direction;
        this.time = time;
        this.wind_strength = wind_strength;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_strength() {
        return wind_strength;
    }

    public void setWind_strength(String wind_strength) {
        this.wind_strength = wind_strength;
    }

    @Override
    public String toString() {
        return "Now{" +
                "temp='" + temp + '\'' +
                ", humidity='" + humidity + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", time='" + time + '\'' +
                ", wind_strength='" + wind_strength + '\'' +
                '}';
    }
}
