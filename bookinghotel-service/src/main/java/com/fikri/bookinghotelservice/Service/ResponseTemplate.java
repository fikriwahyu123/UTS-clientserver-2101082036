/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.bookinghotelservice.Service;

import com.fikri.bookinghotelservice.Entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author fikri
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
    private Hotel hotel;
    private Anggota anggota;
    private Buku buku;

}