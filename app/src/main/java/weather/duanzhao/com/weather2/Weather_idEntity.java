package weather.duanzhao.com.weather2;

/**
 * Created by windows on 2016/6/9.
 */

    public class Weather_idEntity {
        /**
         * fa : 02
         * fb : 01
         */
        private String fa;
        private String fb;

    public Weather_idEntity(String fa, String fb) {
        this.fa = fa;
        this.fb = fb;
    }

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

    @Override
    public String toString() {
        return "Weather_idEntity{" +
                "fa='" + fa + '\'' +
                ", fb='" + fb + '\'' +
                '}';
    }
}

