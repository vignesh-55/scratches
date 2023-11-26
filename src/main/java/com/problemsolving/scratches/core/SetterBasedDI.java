import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class HourlyNews {
    private WeatherUpdate weatherUpdate;

    public HourlyNews() {}

    public void setWeatherUpdate(WeatherUpdate weatherUpdate) {
        this.weatherUpdate = weatherUpdate;
    }
    // other methods for news
}

interface WeatherUpdate {
    public String getUpdate();
}

class LocalWeatherUpdate implements WeatherUpdate {
    @Override
    public String getUpdate() {
        return "Cool and cloudy with 22 degree Celsius";
    }
}

@Configuration
class AppConfig {
    @Bean
    public HourlyNews hourlyNews() {
        HourlyNews hourlyNews = new HourlyNews();
        hourlyNews.setWeatherUpdate(weatherUpdate());
        return hourlyNews;
    }

    @Bean
    public WeatherUpdate weatherUpdate() {
        return new LocalWeatherUpdate();
        // or RestWeatherUpdate(). Just changing the class here,
        // allows to change the injected type
    }
}