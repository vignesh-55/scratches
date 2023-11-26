package com.problemsolving.scratches.core;//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

class HourlyNews {
    private WeatherUpdate weatherUpdate;

    public HourlyNews(WeatherUpdate update) {
        weatherUpdate = update;
    }
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

//@Configuration
//class AppConfig {
//    @Bean
//    public HourlyNews hourlyNews() {
//        HourlyNews hourlyNews = new HourlyNews(weatherUpdate());
//        return hourlyNews;
//    }
//
//    @Bean
//    public WeatherUpdate weatherUpdate() {
//        return new LocalWeatherUpdate();
//    }
//}

class StringTest {
    public static void main(String[] args) {
        String s = "ascdcv";
        char[] chars = s.toCharArray();
        System.out.println(String.valueOf(chars));
    }
}