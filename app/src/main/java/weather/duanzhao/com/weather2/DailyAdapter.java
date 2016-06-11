package weather.duanzhao.com.weather2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by windows on 2016/6/9.
 */
public class DailyAdapter extends BaseAdapter {
    //上下文
    private Context context;
    /**
     * 依赖数据
     */
    private List<Daily> data;
    private LayoutInflater inflater;

    public DailyAdapter(List<Daily> data, Context context) {
        this.data = data;
        this.context = context;
        //获得布局实例化服务
        inflater = LayoutInflater.from(context);
    }

    /**
     * @return 数据的数量
     */
    @Override
    public int getCount() {
        return data.size();
    }

    /**
     * @param position 位置，索引
     * @return
     */
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * @param position    位置
     * @param convertView 可以复用的视图
     * @param parent      父元素（）
     * @return View 特定位置的视图项
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_daily, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //绑定数据
        viewHolder.bindData(data.get(position));
        return convertView;
    }

    class ViewHolder {

       TextView date;
        TextView weather_id;
        TextView week;
        TextView temperature;
        TextView weather;
        TextView wind;
        //获得视图的空间
        public ViewHolder(View view) {
            date = (TextView) view.findViewById(R.id.textView_date);
            weather_id= (TextView) view.findViewById(R.id.textView_weather_id);
            week = (TextView) view.findViewById(R.id.textView_week);
            temperature= (TextView) view.findViewById(R.id.textView_temp);
            weather=(TextView)view.findViewById(R.id.textView_weather);
            wind=(TextView)view.findViewById(R.id.textView_wind);
        }

        //绑定数据，显示在控件中
        public void bindData(Daily daily) {
            date.setText(daily.getDate());
            weather_id.setText( daily.getWeather_id().getFa());
            week.setText(daily.getWeek());
            temperature.setText(daily.getTemperature());
            weather.setText(daily.getWeather());
            wind.setText(daily.getWind());
        }
    }
}

