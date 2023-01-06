/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.bookinghotelservice.Service;

import com.google.gson.Gson;
import com.fikri.bookinghotelservice.Service.Hotel;
import com.fikri.bookinghotelservice.Service.HotelController;
import java.util.List;
import kong.unirest.GenericType;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 *
 * @author hp
 */
public class HotelService {
   private final String URL = "http://localhost:8080";
    
    public Hotel getooking(Long HotelId){
        Hotel hotel = Unirest.get(URL+"/hotel/"+hotelId).asObject(Hotel.class).getBody();
        if (hotel!=null){
            return hotel;
        }
        return null;
    }
    
    public List<Hotel> getAllHotel(){
        List<Hotel> hotelList = Unirest.get(URL + "/hotel/")
                .asObject(new GenericType<List<Hotel>>(){})
                .getBody();
        return hotelList;
    }
    
    public Hotel saveHotel(Hotel hotel){
        HttpResponse<JsonNode> response = Unirest.post(URL + "/hotel/")
                .header("content-type","application/json")
                .body(hotel)
                .asJson();
        Gson gson = new Gson();
        Hotel a = gson.fromJson(response.getBody().toString(),Hotel.class);
        return a;
    }
    
    public Hotel updateHotel(Hotel hotel){
        HttpResponse<JsonNode> response = Unirest.put(URL+"/hotel/")
                   .header("content-type", "application/json")
                   .body(hotel)
                   .asJson();
        Gson gson = new Gson();
        Hotel a = gson.fromJson(response.getBody().toString(), Hotel.class);
        return a;
    }
    
    public void deleteHotel(Long hotelId){
        Unirest.delete(URL+"/hotel/"+hotelId).asEmpty();
    } 
}
