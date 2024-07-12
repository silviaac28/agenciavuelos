package com.agenciavuelosglobales.avion.domain.service;

import com.agenciavuelosglobales.avion.domain.entity.Avion;

public interface AvionService {
    void createAvion(Avion avion);
    void updateAvion(Avion avion);
    Avion findAvion(int id);
    void deleteAvion(Avion avion);
}
