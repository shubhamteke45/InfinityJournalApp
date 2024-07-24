package net.infinity.infinityJournalApp.api.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {

    private Current current;

//    @Getter
//    @Setter
//    public class Condition{
//        public String text;
//    }

    @Getter
    @Setter
    public class Current{
        public String last_updated;
        public double temp_c;
        public int is_day;
//        public Condition condition;
    }

//    @Getter
//    @Setter
//    public class Location{
//        public String name;
//        public String region;
//    }


}
