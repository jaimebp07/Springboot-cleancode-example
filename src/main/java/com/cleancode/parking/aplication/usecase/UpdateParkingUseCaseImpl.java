package com.cleancode.parking.aplication.usecase;

import com.cleancode.parking.domain.ParkingLot;
import com.cleancode.parking.domain.port.in.UpdateParkingUseCase;

public class UpdateParkingUseCaseImpl implements UpdateParkingUseCase {

    private final UpdateParkingUseCase updateParkingUseCase;

    public UpdateParkingUseCaseImpl(UpdateParkingUseCase updateParkingUseCase){
        this.updateParkingUseCase = updateParkingUseCase;;
    }

    @Override
    public boolean update(String id, ParkingLot parkingLot) {
        return updateParkingUseCase.update(id, parkingLot);
    }

}
