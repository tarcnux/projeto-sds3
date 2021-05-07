package com.tarcnux.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarcnux.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository <Seller, Long>{

}
