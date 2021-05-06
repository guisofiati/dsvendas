package io.github.guisofiati.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.guisofiati.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}