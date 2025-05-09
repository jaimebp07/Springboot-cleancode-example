package com.cleancode.parking.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ParkingLot {

    private String id;
    private String name;
    private String address;
    private String phone;

}
