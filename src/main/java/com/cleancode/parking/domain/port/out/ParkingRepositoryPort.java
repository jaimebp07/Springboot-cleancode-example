package com.cleancode.parking.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.cleancode.parking.domain.ParkingLot;

public interface ParkingRepositoryPort {

    ParkingLot save(ParkingLot parkingLot);
    Optional<ParkingLot> findById(String id);
    List<ParkingLot> findAll();
    Optional<ParkingLot> update(String id, ParkingLot parkingLot);
    boolean deleteById(String id);
}
