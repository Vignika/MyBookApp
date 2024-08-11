package com.example.apicallingrecyclerview

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("Comments")
    fun getData():Call<ArrayList<DataModelItem>>

}