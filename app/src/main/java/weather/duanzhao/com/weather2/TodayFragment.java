package weather.duanzhao.com.weather2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TodayFragment extends Fragment {
    TextView temperature;
    TextView weather;
    TextView weather_id;
    TextView wind;
    TextView week;
    TextView city;
    TextView date_y;
    TextView dressing_index;
    TextView dressing_advice;
    TextView uv_index;
    TextView comfort_index;
    TextView wash_index;
    TextView travel_index;
    TextView exercise_index;
    TextView drying_index;
    private static final String EXTRA_DATA = "data";


    Today  today;

    public TodayFragment() {
        // Required empty public constructor
    }

    /**
     * 获得实例
     *
     * @paramt todayList
     * @return
     */
    public static TodayFragment getInstance(Today today2) {
        TodayFragment  todayFragment = new TodayFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_DATA, today2);
        todayFragment.setArguments(bundle);
        return todayFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        today = (Today) getArguments().getSerializable(EXTRA_DATA);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today, container, false);
        temperature= (TextView) view.findViewById(R.id.textView_temperture);
        weather= (TextView) view.findViewById(R.id.textView_weather);
        weather_id= (TextView) view.findViewById(R.id.textView_weather_id);
        wind= (TextView) view.findViewById(R.id.textView_wind);
        week= (TextView) view.findViewById(R.id.textView_week);
        city= (TextView) view.findViewById(R.id.textView_city);
        date_y= (TextView) view.findViewById(R.id.textView_date_y);
        dressing_index= (TextView) view.findViewById(R.id.textView_dressing_index);
        dressing_advice= (TextView) view.findViewById(R.id.textView_dressing_advice);
        uv_index= (TextView) view.findViewById(R.id.textView_uv_index);
        comfort_index= (TextView) view.findViewById(R.id.textView_comfort_index);
        wash_index= (TextView) view.findViewById(R.id.textView_wash_index);
        travel_index= (TextView) view.findViewById(R.id.textView_travel_index);
        exercise_index= (TextView) view.findViewById(R.id.textView_excisize_index);
        drying_index= (TextView) view.findViewById(R.id.textView_drying_index);
        temperature.setText(today.getTemperature());
        weather.setText(today.getWeather());
       // weather_id.setText((CharSequence) today.getWeather_id());
        weather_id.setText(today.getWeather_id().getFa());
        wind.setText(today.getWind());
        week.setText(today.getWeek());
        city.setText(today.getCity());
        date_y.setText(today.getDate_y());
        dressing_index.setText(today.getDressing_index());
        dressing_advice.setText(today.getDressing_advice());
        uv_index.setText(today.getUv_index());
        comfort_index.setText(today.getComfort_index());
        wash_index.setText(today.getWash_index());
        travel_index.setText(today.getTravel_index());
        exercise_index.setText(today.getExercise_index());
        drying_index.setText(today.getDrying_index());
        return view;
    }

}


