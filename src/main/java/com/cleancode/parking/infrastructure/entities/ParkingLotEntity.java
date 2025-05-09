package com.cleancode.parking.infrastructure.entities;

import org.springframework.scheduling.config.Task;

import com.cleancode.parking.domain.ParkingLot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParkingLotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String address;
    private String phone;

    public static ParkingLotEntity fromDomainModel(ParkingLot parkingLot) {
        return new ParkingLotEntity(parkingLot.getId(), parkingLot.getName(), parkingLot.getAddress(), parkingLot.getPhone());
    }

    public ParkingLot toDomainModel(){
        return new ParkingLot(id, name, address, phone);
    }
}
