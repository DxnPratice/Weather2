package weather.duanzhao.com.weather2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyFragment extends Fragment {

    private static final String EXTRA_DATA = "data";

    ArrayList<Daily> dailyArrayList;
    public DailyFragment() {
        // Required empty public constructor
    }

    public static DailyFragment getInstance(ArrayList<Daily> dailyArrayList) {
        DailyFragment dailyFragment = new DailyFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXTRA_DATA, dailyArrayList);
        dailyFragment.setArguments(bundle);
        return dailyFragment;
    }


   @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        dailyArrayList = (ArrayList) getArguments().getSerializable(EXTRA_DATA);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_daily, container, false);
        ListView listView = (ListView) v.findViewById(R.id.listView);
        DailyAdapter adapter = new DailyAdapter(dailyArrayList, getActivity());
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return v;

    }

}
