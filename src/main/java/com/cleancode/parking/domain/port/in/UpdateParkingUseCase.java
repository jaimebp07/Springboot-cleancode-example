package com.cleancode.parking.domain.port.in;

import com.cleancode.parking.domain.ParkingLot;

public interface UpdateParkingUseCase {
    void update(String id, ParkingLot parkingLot);
}
