 package com.cleancode.parking.aplication.usecase;

import com.cleancode.parking.domain.ParkingLot;
import com.cleancode.parking.domain.port.in.RegisterParkingUseCase;
import com.cleancode.parking.domain.port.out.ParkingRepositoryPort;

public class RegisterParkingUseCaseImpl implements RegisterParkingUseCase {

    private final ParkingRepositoryPort parkingRepositoryPort;

    public RegisterParkingUseCaseImpl(ParkingRepositoryPort parkingRepositoryPort){
        this.parkingRepositoryPort = parkingRepositoryPort;
    }

    @Override
    public void register(ParkingLot parking) {
        parkingRepositoryPort.save(parking);
    }

}
