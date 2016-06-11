package weather.duanzhao.com.weather2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by windows on 2016/6/9.
 */
public class TabAdapter  extends FragmentPagerAdapter {

    String []titles={"当前","今天","未来一周"};
    List<Fragment> fragmentList;
    public TabAdapter(FragmentManager fm, List<Fragment>  fragmentList) {
        super(fm);
        this.fragmentList=fragmentList;
    }

    /**
     *
     * 返回Tab中的视图项
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    /**
     *
     * tab标签上的标题
     */
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}