package io.github.guisofiati.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.guisofiati.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}