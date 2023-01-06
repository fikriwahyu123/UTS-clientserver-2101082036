/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.bookinghotelservice.Controller;
import com.fikri.bookinghotelservice.Entity.Hotel;
import com.fikri.bookinghotelservice.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author FIKRI
 */
@RestController
@RequestMapping("/anggota")
public class bookinghotelController {
    @Autowired
    private BookingService BookingService;
    
    @PostMapping("/")
    public Hotel saveNasabah(@RequestBody Nasabah nasabah){
        return bookinghotelService.saveNasabah(nasabah);
    }
    
    @GetMapping("/{id}")
    public Hotel findHotelById(@PathVariable("id") Long hotelId){
        return HotelService.findHotelById(HotelId);
    } 
