package com.cleancode.parking.aplication.usecase;

import java.util.Optional;

import com.cleancode.parking.domain.ParkingLot;
import com.cleancode.parking.domain.port.in.UpdateParkingUseCase;
import com.cleancode.parking.domain.port.out.ParkingRepositoryPort;

public class UpdateParkingUseCaseImpl implements UpdateParkingUseCase {

    private final ParkingRepositoryPort parkingRepositoryPort;

    public UpdateParkingUseCaseImpl(ParkingRepositoryPort parkingRepositoryPort){
        this.parkingRepositoryPort = parkingRepositoryPort;;
    }

    @Override
    public Optional<ParkingLot> update(String id, ParkingLot parkingLot) {
        return this.parkingRepositoryPort.update(id, parkingLot);
    }

}
