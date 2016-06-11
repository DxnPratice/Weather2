package weather.duanzhao.com.weather2;

import java.util.List;

/**
 * Created by windows on 2016/6/9.
 */
public class Data {


    /**
     * result : {"future":[{"date":"20160609","weather_id":{"fa":"02","fb":"01"},"week":"星期四","temperature":"22℃~30℃","weather":"阴转多云","wind":"微风"},{"date":"20160610","weather_id":{"fa":"01","fb":"07"},"week":"星期五","temperature":"24℃~30℃","weather":"多云转小雨","wind":"微风"},{"date":"20160611","weather_id":{"fa":"07","fb":"07"},"week":"星期六","temperature":"23℃~30℃","weather":"小雨","wind":"微风"},{"date":"20160612","weather_id":{"fa":"07","fb":"01"},"week":"星期日","temperature":"21℃~29℃","weather":"小雨转多云","wind":"微风"},{"date":"20160613","weather_id":{"fa":"01","fb":"01"},"week":"星期一","temperature":"23℃~32℃","weather":"多云","wind":"微风"},{"date":"20160614","weather_id":{"fa":"07","fb":"01"},"week":"星期二","temperature":"21℃~29℃","weather":"小雨转多云","wind":"微风"},{"date":"20160615","weather_id":{"fa":"07","fb":"01"},"week":"星期三","temperature":"21℃~29℃","weather":"小雨转多云","wind":"微风"}],"today":{"weather_id":{"fa":"02","fb":"01"},"week":"星期四","city":"黄冈","dressing_index":"热","travel_index":"较适宜","wash_index":"较适宜","comfort_index":"","exercise_index":"较适宜","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"弱","drying_index":"","temperature":"22℃~30℃","weather":"阴转多云","date_y":"2016年06月09日","wind":"微风"},"sk":{"temp":"29","humidity":"58%","wind_direction":"东北风","time":"16:49","wind_strength":"1级"}}
     * reason : successed!
     * error_code : 0
     * resultcode : 200
     */
    private ResultEntity result;
    private String reason;
    private int error_code;
    private String resultcode;

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public ResultEntity getResult() {
        return result;
    }

    public String getReason() {
        return reason;
    }

    public int getError_code() {
        return error_code;
    }

    public String getResultcode() {
        return resultcode;
    }

    public class ResultEntity {
        /**
         * future : [{"date":"20160609","weather_id":{"fa":"02","fb":"01"},"week":"星期四","temperature":"22℃~30℃","weather":"阴转多云","wind":"微风"},{"date":"20160610","weather_id":{"fa":"01","fb":"07"},"week":"星期五","temperature":"24℃~30℃","weather":"多云转小雨","wind":"微风"},{"date":"20160611","weather_id":{"fa":"07","fb":"07"},"week":"星期六","temperature":"23℃~30℃","weather":"小雨","wind":"微风"},{"date":"20160612","weather_id":{"fa":"07","fb":"01"},"week":"星期日","temperature":"21℃~29℃","weather":"小雨转多云","wind":"微风"},{"date":"20160613","weather_id":{"fa":"01","fb":"01"},"week":"星期一","temperature":"23℃~32℃","weather":"多云","wind":"微风"},{"date":"20160614","weather_id":{"fa":"07","fb":"01"},"week":"星期二","temperature":"21℃~29℃","weather":"小雨转多云","wind":"微风"},{"date":"20160615","weather_id":{"fa":"07","fb":"01"},"week":"星期三","temperature":"21℃~29℃","weather":"小雨转多云","wind":"微风"}]
         * today : {"weather_id":{"fa":"02","fb":"01"},"week":"星期四","city":"黄冈","dressing_index":"热","travel_index":"较适宜","wash_index":"较适宜","comfort_index":"","exercise_index":"较适宜","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"弱","drying_index":"","temperature":"22℃~30℃","weather":"阴转多云","date_y":"2016年06月09日","wind":"微风"}
         * sk : {"temp":"29","humidity":"58%","wind_direction":"东北风","time":"16:49","wind_strength":"1级"}
         */
        private List<FutureEntity> future;
        private TodayEntity today;
        private SkEntity sk;

        public void setFuture(List<FutureEntity> future) {
            this.future = future;
        }

        public void setToday(TodayEntity today) {
            this.today = today;
        }

        public void setSk(SkEntity sk) {
            this.sk = sk;
        }

        public List<FutureEntity> getFuture() {
            return future;
        }

        public TodayEntity getToday() {
            return today;
        }

        public SkEntity getSk() {
            return sk;
        }

        public class FutureEntity {
            /**
             * date : 20160609
             * weather_id : {"fa":"02","fb":"01"}
             * week : 星期四
             * temperature : 22℃~30℃
             * weather : 阴转多云
             * wind : 微风
             */
            private String date;
            private Weather_idEntity weather_id;
            private String week;
            private String temperature;
            private String weather;
            private String wind;

            public void setDate(String date) {
                this.date = date;
            }

            public void setWeather_id(Weather_idEntity weather_id) {
                this.weather_id = weather_id;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getDate() {
                return date;
            }

            public Weather_idEntity getWeather_id() {
                return weather_id;
            }

            public String getWeek() {
                return week;
            }

            public String getTemperature() {
                return temperature;
            }

            public String getWeather() {
                return weather;
            }

            public String getWind() {
                return wind;
            }

            public class Weather_idEntity {
                /**
                 * fa : 02
                 * fb : 01
                 */
                private String fa;
                private String fb;

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }

                public String getFa() {
                    return fa;
                }

                public String getFb() {
                    return fb;
                }
            }
        }

        public class TodayEntity {
            /**
             * weather_id : {"fa":"02","fb":"01"}
             * week : 星期四
             * city : 黄冈
             * dressing_index : 热
             * travel_index : 较适宜
             * wash_index : 较适宜
             * comfort_index :
             * exercise_index : 较适宜
             * dressing_advice : 天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。
             * uv_index : 弱
             * drying_index :
             * temperature : 22℃~30℃
             * weather : 阴转多云
             * date_y : 2016年06月09日
             * wind : 微风
             */
            private Weather_idEntity weather_id;
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

            public class Weather_idEntity {
                /**
                 * fa : 02
                 * fb : 01
                 */
                private String fa;
                private String fb;

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }

                public String getFa() {
                    return fa;
                }

                public String getFb() {
                    return fb;
                }
            }
        }

        public class SkEntity {
            /**
             * temp : 29
             * humidity : 58%
             * wind_direction : 东北风
             * time : 16:49
             * wind_strength : 1级
             */
            private String temp;
            private String humidity;
            private String wind_direction;
            private String time;
            private String wind_strength;

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getTemp() {
                return temp;
            }

            public String getHumidity() {
                return humidity;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public String getTime() {
                return time;
            }

            public String getWind_strength() {
                return wind_strength;
            }
        }
    }
}
