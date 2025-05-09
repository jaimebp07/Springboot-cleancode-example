package com.cleancode.parking.aplication.usecase;

import com.cleancode.parking.domain.port.in.DeleteParkingUseCase;
import com.cleancode.parking.domain.port.out.ParkingRepositoryPort;

public class DeleteParkingUseCaseImpl implements DeleteParkingUseCase {

    private final ParkingRepositoryPort parkingRepositoryPort;

    public DeleteParkingUseCaseImpl(ParkingRepositoryPort parkingRepositoryPort) {
        this.parkingRepositoryPort = parkingRepositoryPort;
    }

    @Override
    public boolean deleteById(String id) {
        return parkingRepositoryPort.deleteById(id);
    }
}
