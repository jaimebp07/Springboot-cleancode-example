package com.cleancode.parking.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleancode.parking.infrastructure.entities.ParkingLotEntity;

@Repository
public interface JpaParkingLotRepository extends JpaRepository<ParkingLotEntity, String> {

}
