package com.tarcnux.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarcnux.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long>{

}
