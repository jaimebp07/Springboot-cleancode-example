package com.cleancode.parking.aplication.service;

import java.util.List;
import java.util.Optional;

import com.cleancode.parking.domain.ParkingLot;
import com.cleancode.parking.domain.port.in.DeleteParkingUseCase;
import com.cleancode.parking.domain.port.in.RegisterParkingUseCase;
import com.cleancode.parking.domain.port.in.RetrieveParkingUseCase;
import com.cleancode.parking.domain.port.in.UpdateParkingUseCase;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ParkingService implements RegisterParkingUseCase, RetrieveParkingUseCase, UpdateParkingUseCase, DeleteParkingUseCase {

    private final RegisterParkingUseCase registerParkingUseCase;
    private final RetrieveParkingUseCase retrieveParkingUseCase;
    private final UpdateParkingUseCase updateParkingUseCase;
    private final DeleteParkingUseCase deleteParkingUseCase;

    @Override
    public boolean deleteById(String id) {
        return deleteParkingUseCase.deleteById(id);
    }

    @Override
    public Optional<ParkingLot> update(String id, ParkingLot parkingLot) {
       return updateParkingUseCase.update(id, parkingLot);
    }

    @Override
    public Optional<ParkingLot> retrieve(String id) {
        return retrieveParkingUseCase.retrieve(id);
    }

    @Override
    public List<ParkingLot> retrieveAll() {
        return retrieveParkingUseCase.retrieveAll();
    }

    @Override
    public void register(ParkingLot parking) {
        registerParkingUseCase.register(parking);
    }


}
