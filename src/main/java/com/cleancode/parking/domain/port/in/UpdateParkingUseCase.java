package com.cleancode.parking.domain.port.in;

import java.util.Optional;

import com.cleancode.parking.domain.ParkingLot;

public interface UpdateParkingUseCase {
    Optional<ParkingLot> update(String id, ParkingLot parkingLot);
}
