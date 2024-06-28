package com.company.services_reservas_app.repositories;

import com.company.services_reservas_app.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface HotelRepository extends JpaRepository<Hotel, Long> {
    @Override
    Optional<Hotel> findById(Long id);
}