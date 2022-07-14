package com.example.testerv1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiUtil {

    String BASE_URL = "https://localhost:7007/";

    @GET("/api/v1/Person/GetAllPerson")
    Call<List<Person>> getPerson();
}
