package com.cleancode.parking.domain.port.in;

import com.cleancode.parking.domain.ParkingLot;

public interface RegisterParkingUseCase {

    void register(ParkingLot parking);
}
