package com.cleancode.parking.aplication.usecase;

import java.util.List;
import java.util.Optional;

import com.cleancode.parking.domain.ParkingLot;
import com.cleancode.parking.domain.port.in.RetrieveParkingUseCase;
import com.cleancode.parking.domain.port.out.ParkingRepositoryPort;

public class RetrieveParkingUseCaseImpl implements RetrieveParkingUseCase {

    private final ParkingRepositoryPort parkingRepositoryPort;


    public RetrieveParkingUseCaseImpl(ParkingRepositoryPort retrieveParkingUseCase) {
        this.parkingRepositoryPort = retrieveParkingUseCase;
    }

    @Override
    public Optional<ParkingLot> retrieve(String id) {
        return parkingRepositoryPort.findById(id);
    }

    @Override
    public List<ParkingLot> retrieveAll() {
        return parkingRepositoryPort.findAll();
    }

}
