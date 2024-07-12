package com.agenciavuelosglobales.avion.application;

import com.agenciavuelosglobales.avion.domain.entity.Avion;
import com.agenciavuelosglobales.avion.domain.service.AvionService;

public class CreateAvionUseCase {

    private final AvionService avionService;

    public CreateAvionUseCase(AvionService avionService) {
        this.avionService = avionService;
    }

    public void execute (Avion avion){
        avionService.createAvion(avion);
    }

}
