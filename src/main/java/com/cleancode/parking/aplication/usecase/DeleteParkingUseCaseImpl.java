package com.cleancode.parking.aplication.usecase;

import com.cleancode.parking.domain.port.in.DeleteParkingUseCase;

public class DeleteParkingUseCaseImpl implements DeleteParkingUseCase {

    private final DeleteParkingUseCase deleteParkingUseCase;

    public DeleteParkingUseCaseImpl(DeleteParkingUseCase deleteParkingUseCase) {
        this.deleteParkingUseCase = deleteParkingUseCase;
    }

    @Override
    public boolean detelete(String id) {
        return deleteParkingUseCase.detelete(id);
    }
}
