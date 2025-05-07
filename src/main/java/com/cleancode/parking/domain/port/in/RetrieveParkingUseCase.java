package com.cleancode.parking.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.cleancode.parking.domain.ParkingLot;

public interface RetrieveParkingUseCase {
    Optional<ParkingLot>  retrieve(String id);
    List<ParkingLot> retrieveAll();
}
