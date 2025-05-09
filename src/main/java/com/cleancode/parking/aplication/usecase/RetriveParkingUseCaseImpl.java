package com.cleancode.parking.aplication.usecase;

import java.util.List;
import java.util.Optional;

import com.cleancode.parking.domain.ParkingLot;
import com.cleancode.parking.domain.port.in.RetrieveParkingUseCase;

public class RetriveParkingUseCaseImpl implements RetrieveParkingUseCase {

    private final RetrieveParkingUseCase retrieveParkingUseCase;

    public RetriveParkingUseCaseImpl(RetrieveParkingUseCase retrieveParkingUseCase) {
        this.retrieveParkingUseCase = retrieveParkingUseCase;
    }

    @Override
    public Optional<ParkingLot> retrieve(String id) {
        return retrieveParkingUseCase.retrieve(id);
    }

    @Override
    public List<ParkingLot> retrieveAll() {
        return retrieveAll();
    }

}
