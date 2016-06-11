package weather.duanzhao.com.weather2;

import java.util.List;

/**
 * Created by windows on 2016/6/9.
 */
public class WeatherInfo {
    private List<Daily> future;
    private Today today;
    private Now sk;

    public void setFuture(List<Daily> future) {
        this.future = future;
    }

    public void setToday(Today today) {
        this.today = today;
    }

    public void setSk(Now sk) {
        this.sk = sk;
    }

    public List<Daily> getFuture() {
        return future;
    }

    public Today getToday() {
        return today;
    }

    public  Now getSk() {
        return sk;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "future=" + future +
                ", today=" + today +
                ", sk=" + sk +
                '}';
    }
}
