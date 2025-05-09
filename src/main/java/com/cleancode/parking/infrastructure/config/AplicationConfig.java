package com.cleancode.parking.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cleancode.parking.aplication.service.ParkingService;
import com.cleancode.parking.aplication.usecase.DeleteParkingUseCaseImpl;
import com.cleancode.parking.aplication.usecase.RegisterParkingUseCaseImpl;
import com.cleancode.parking.aplication.usecase.RetrieveParkingUseCaseImpl;
import com.cleancode.parking.aplication.usecase.UpdateParkingUseCaseImpl;
import com.cleancode.parking.domain.port.out.ParkingRepositoryPort;
import com.cleancode.parking.infrastructure.repositories.JpaParkingLotRepositoryAdapter;

@Configuration
public class AplicationConfig {

    @Bean
    public ParkingService taskService(ParkingRepositoryPort parkingRepositoryPort) {
        return new ParkingService(
                new RegisterParkingUseCaseImpl(parkingRepositoryPort),
                new RetrieveParkingUseCaseImpl(parkingRepositoryPort),
                new UpdateParkingUseCaseImpl(parkingRepositoryPort),
                new DeleteParkingUseCaseImpl(parkingRepositoryPort)
        );
    }

    @Bean
    public ParkingRepositoryPort taskRepositoryPort(JpaParkingLotRepositoryAdapter jpaParkingLotRepositoryAdapter) {
        return jpaParkingLotRepositoryAdapter;
    }

}
