package com.company.services_reservas_app.mapper;

import com.company.services_reservas_app.repositories.HotelRepository;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HotelMapper {

    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);


}
