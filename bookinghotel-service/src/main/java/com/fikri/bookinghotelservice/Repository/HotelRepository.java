/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fikri.bookinghotelservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fikri
 */
public interface HotelRepository {
    @Repository

public interface HotelRepository extends JpaRepository<Hotel, Long>{

    public HotelRepository findByHotelId(Long HotelId);
    
}

}
