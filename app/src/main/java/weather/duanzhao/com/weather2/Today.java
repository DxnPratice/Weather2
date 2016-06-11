package weather.duanzhao.com.weather2;

import java.io.Serializable;

/**
 * Created by windows on 2016/6/9.
 */
public class Today  implements Serializable {

    private String week;
    private String city;
    private String dressing_index;
    private String travel_index;
    private String wash_index;
    private String comfort_index;
    private String exercise_index;
    private String dressing_advice;
    private String uv_index;
    private String drying_index;
    private String temperature;
    private String weather;
    private String date_y;
    private String wind;
    private Weather_idEntity weather_id;

    public Today() {
    }
    public void setWeather_id(Weather_idEntity weather_id) {
        this.weather_id = weather_id;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDressing_index(String dressing_index) {
        this.dressing_index = dressing_index;
    }

    public void setTravel_index(String travel_index) {
        this.travel_index = travel_index;
    }

    public void setWash_index(String wash_index) {
        this.wash_index = wash_index;
    }

    public void setComfort_index(String comfort_index) {
        this.comfort_index = comfort_index;
    }

    public void setExercise_index(String exercise_index) {
        this.exercise_index = exercise_index;
    }

    public void setDressing_advice(String dressing_advice) {
        this.dressing_advice = dressing_advice;
    }

    public void setUv_index(String uv_index) {
        this.uv_index = uv_index;
    }

    public void setDrying_index(String drying_index) {
        this.drying_index = drying_index;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setDate_y(String date_y) {
        this.date_y = date_y;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public Weather_idEntity getWeather_id() {
        return weather_id;
    }

    public String getWeek() {
        return week;
    }

    public String getCity() {
        return city;
    }

    public String getDressing_index() {
        return dressing_index;
    }

    public String getTravel_index() {
        return travel_index;
    }

    public String getWash_index() {
        return wash_index;
    }

    public String getComfort_index() {
        return comfort_index;
    }

    public String getExercise_index() {
        return exercise_index;
    }

    public String getDressing_advice() {
        return dressing_advice;
    }

    public String getUv_index() {
        return uv_index;
    }

    public String getDrying_index() {
        return drying_index;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getWeather() {
        return weather;
    }

    public String getDate_y() {
        return date_y;
    }

    public String getWind() {
        return wind;
    }

    public Today(String week, String city, String dressing_index, String travel_index, String wash_index, String comfort_index, String exercise_index, String dressing_advice, String uv_index, String drying_index, String weather, String temperature, String date_y, String wind, Weather_idEntity weather_id) {
        this.week = week;
        this.city = city;
        this.dressing_index = dressing_index;
        this.travel_index = travel_index;
        this.wash_index = wash_index;
        this.comfort_index = comfort_index;
        this.exercise_index = exercise_index;
        this.dressing_advice = dressing_advice;
        this.uv_index = uv_index;
        this.drying_index = drying_index;
        this.weather = weather;
        this.temperature = temperature;
        this.date_y = date_y;
        this.wind = wind;
        this.weather_id = weather_id;
    }

    @Override
    public String toString() {
        return "Today{" +
                "week='" + week + '\'' +
                ", city='" + city + '\'' +
                ", dressing_index='" + dressing_index + '\'' +
                ", travel_index='" + travel_index + '\'' +
                ", wash_index='" + wash_index + '\'' +
                ", comfort_index='" + comfort_index + '\'' +
                ", exercise_index='" + exercise_index + '\'' +
                ", dressing_advice='" + dressing_advice + '\'' +
                ", uv_index='" + uv_index + '\'' +
                ", drying_index='" + drying_index + '\'' +
                ", temperature='" + temperature + '\'' +
                ", weather='" + weather + '\'' +
                ", date_y='" + date_y + '\'' +
                ", wind='" + wind + '\'' +
                ", weather_id=" + weather_id +
                '}';
    }
}