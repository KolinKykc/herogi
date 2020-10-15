package com.herogi.server.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.opencsv.bean.CsvBindByName;


@JsonPropertyOrder({ "userid", "total_time", "distance" })
public class Pace {


    @CsvBindByName
    public String userid;

    @CsvBindByName
    public String total_time;

    @CsvBindByName
    public String distance;




    public Pace() {}


    public Pace(
            String userid, String total_time, String distance) {
        this.userid = userid;
        this.total_time = total_time;
        this.distance = distance;
    }

}
/*@Column(name = "avgPace")
    public String calcAvgPace() {
        return  String.valueOf(Float.parseFloat(distance)/(1000* Float.parseFloat(total_time)));

    }

    @CsvBindByName
    public String avgPace;
            calcAvgPace();
*/