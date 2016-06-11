package weather.duanzhao.com.weather2;

import java.io.Serializable;

/**
 * Created by windows on 2016/6/9.
 */
public class Daily  implements Serializable {
    private String date;
    private Weather_idEntity weather_id;
    private String week;
    private String temperature;
    private String weather;
    private String wind;

    public Daily() {
    }

    public Daily(String date, Weather_idEntity weather_id, String week, String weather, String temperature, String wind) {
        this.date = date;
        this.weather_id = weather_id;
        this.week = week;
        this.weather = weather;
        this.temperature = temperature;
        this.wind = wind;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Weather_idEntity getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(Weather_idEntity weather_id) {
        this.weather_id = weather_id;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return "Daily{" +
                "date='" + date + '\'' +
                ", weather_id=" + weather_id +
                ", week='" + week + '\'' +
                ", temperature='" + temperature + '\'' +
                ", weather='" + weather + '\'' +
                ", wind='" + wind + '\'' +
                '}';
    }
}
