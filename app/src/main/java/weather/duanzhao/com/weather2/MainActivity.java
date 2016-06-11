package weather.duanzhao.com.weather2;

import android.content.res.AssetManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 这个是在聚合上获得的api数据,之前一直出错
 * 1，我将获得的数据以文本文档的方式放在raw目录下，读出来一直乱码，解决办法：将获得的数据以utf-8的编码方式和.json的格式保存，并将android studio的编码方式也换成utf-8，然后解决了
 *
 *
 *
 *
 *
 *
 */

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    List<Fragment> fragmentList;
    ArrayList<Daily> dailylist;
    WeatherInfo info;
    Now  present;
    Today today1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            //解析数据
            //子线程或异步任务或子线程
            //使用第三方json.jar包进行数据解析,此时需要导入json.jar包
            try {
                InputStream in = getResources().openRawResource(R.raw.data3);
                Reader reader = new InputStreamReader(in, "utf-8");
                WeatherInfo info = new Gson().fromJson(reader, WeatherInfo.class);
                Log.d("jar",info.toString());
            }catch(Exception e){
                e.printStackTrace();
            }
            //系统自带Json解析方式.在raw目录或者assets目录下解析都可以，不需要jar包
            try {
              //在raw目录下进行数据解析
                //InputStream in = getResources().openRawResource(R.raw.data3);
                //在assets目录下的文件进行解析
                AssetManager asset = getAssets();
                InputStream in= asset.open("info.json");
                int size = in.available();
                byte[] data = new byte[size];
                 in.read(data);
                String jsonData = new String(data, "utf-8");
                JSONObject root = new JSONObject(jsonData);
                JSONArray hourlyArray = root.getJSONArray("future");
                dailylist= new ArrayList<>();
                for (int i = 0; i < hourlyArray.length(); i++) {
                    JSONObject o = (JSONObject) hourlyArray.get(i);
                    String temperature1 = o.getString("temperature");
                    String weather1 = o.getString("weather");
                    JSONObject weather_id=o.getJSONObject("weather_id");
                    String f1=weather_id.getString("fa");
                    String f2=weather_id.getString("fb");
                    Weather_idEntity weather_id1=new Weather_idEntity(f1,f2);

                    String wind1= o.getString("wind");
                    String week1 = o.getString("week");
                    String date =o.getString("date");
                    Daily daily1 = new Daily(date ,weather_id1,week1,weather1,temperature1,wind1);
                    dailylist.add(daily1);
                }
                JSONObject sk =  root.getJSONObject("sk");
                String temp= sk.getString("temp");
                String wind_direction = sk.getString("wind_direction");
                String wind_strength = sk.getString("wind_strength");
                String humidity = sk.getString("humidity");
                String time=sk.getString("time");
                present = new Now (temp,wind_direction,wind_strength,humidity,time);

                JSONObject today = root.getJSONObject("today");
                String week=today.getString("week");
                String city1=today.getString("city");
                String dressing_index=today.getString("dressing_index");
                String travel_index=today.getString("travel_index");
                String wash_index=today.getString("wash_index");
                String comfort_index=today.getString("comfort_index");
                String exercise_index=today.getString("exercise_index");
              String dressing_advice=today.getString("dressing_advice");
              String uv_index=today.getString("uv_index");
               String drying_index=today.getString("drying_index");
                String temperature=today.getString("temperature");
             String weather=today.getString("weather");
              String date_y=today.getString("date_y");
               String wind=today.getString("wind");
                JSONObject weather_id2=today.getJSONObject("weather_id");
                String f3=weather_id2.getString("fa");
                String f4=weather_id2.getString("fb");
                Weather_idEntity weather_id3=new Weather_idEntity(f3,f4);

                today1=new Today(week,city1,dressing_index,travel_index,wash_index,comfort_index,exercise_index,dressing_advice,uv_index,drying_index,temperature,weather,date_y,wind,weather_id3);



              Log.d(TAG, present.toString());

                   Log.d(TAG, today1.toString());

                for (Daily daily : dailylist) {
                    Log.d(TAG, daily.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //assets
//            try {
//                in = getAssets().open("info.json");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            fragmentList = new ArrayList<>();
            fragmentList.add(NowFragment.getInstance(present));
            fragmentList.add(TodayFragment.getInstance(today1));
            fragmentList.add(DailyFragment.getInstance(dailylist));
        }
        initView();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("黄冈天气预报");

        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager(), fragmentList));
        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.addTab(tabLayout.newTab().setText("当前"));
//        tabLayout.addTab(tabLayout.newTab().setText("小时"));
//        tabLayout.addTab(tabLayout.newTab().setText("一周"));
    }
}
