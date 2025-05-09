package com.cleancode.parking.infrastructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cleancode.parking.domain.ParkingLot;
import com.cleancode.parking.domain.port.out.ParkingRepositoryPort;
import com.cleancode.parking.infrastructure.entities.ParkingLotEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JpaParkingLotRepositoryAdapter implements ParkingRepositoryPort {

    private final JpaParkingLotRepository jpaParkingLotRepository; 

    @Override
    public ParkingLot save(ParkingLot parkingLot) {
        ParkingLotEntity parkingLotEntity = ParkingLotEntity.fromDomainModel(parkingLot);
        ParkingLotEntity saveParkingLotEntity = jpaParkingLotRepository.save(parkingLotEntity);
        return saveParkingLotEntity.toDomainModel();
    }

    @Override
    public Optional<ParkingLot> findById(String id) {
        return jpaParkingLotRepository.findById(id).map(ParkingLotEntity::toDomainModel);
    }

    @Override
    public List<ParkingLot> findAll() {
        return jpaParkingLotRepository.findAll().stream()
        .map(ParkingLotEntity::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public Optional<ParkingLot> update(String id, ParkingLot parkingLot) {
        if (jpaParkingLotRepository.existsById(parkingLot.getId())) {
            ParkingLotEntity taskEntity = ParkingLotEntity.fromDomainModel(parkingLot);
            ParkingLotEntity updatedParkingLotEntity = jpaParkingLotRepository.save(taskEntity);
            return Optional.of(updatedParkingLotEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(String id) {
        if (jpaParkingLotRepository.existsById(id)) {
            jpaParkingLotRepository.deleteById(id);
            return true;
        }
        return false;
    }

    
}
