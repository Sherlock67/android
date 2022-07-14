package com.example.testerv1;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Person implements Serializable {
    @SerializedName("id")
    public  int id;
    @SerializedName("personName")
    public String personName;

    public Person(String name,int id){
        this.personName = name;
        this.id = id;
    }

    public String GetPersonName(){
        return personName;
    }

}
