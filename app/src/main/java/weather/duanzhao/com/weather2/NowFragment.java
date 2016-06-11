package weather.duanzhao.com.weather2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NowFragment extends Fragment {


    TextView wind_strength;
    TextView wind_direction;
    TextView temp;
    TextView humidity;
    TextView time;

    private static final String EXTRA_DATA = "data";
    Now  now;
    public NowFragment() {
        // Required empty public constructor
    }

    /**
     * 获得实例
     * @param
     * @return
     */
    public static NowFragment getInstance(Now  now){
        NowFragment nowFragment = new NowFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_DATA,now);
        nowFragment.setArguments(bundle);
        return nowFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        now = (Now) getArguments().getSerializable(EXTRA_DATA);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_now, container, false);

        temp = (TextView) v.findViewById(R.id.textView_temp);
       time= (TextView) v.findViewById(R.id.textView_time);
        humidity= (TextView) v.findViewById(R.id.textView_humidity);
        wind_direction=(TextView)v.findViewById(R.id.textView_wind_direction);
        wind_strength=(TextView)v.findViewById(R.id.textView_strength);
        temp.setText(now.getTemp());
        time.setText(now.getTime());
        humidity.setText(now.getHumidity());
        wind_strength.setText(now.getWind_strength());
        wind_direction.setText(now.getWind_direction());
        return v;
    }

}
