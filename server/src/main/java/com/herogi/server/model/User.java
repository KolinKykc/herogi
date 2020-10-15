package com.herogi.server.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "userid", "username", "age" })
public class User {

    public String userid;
    public String username;
    public String age;

}