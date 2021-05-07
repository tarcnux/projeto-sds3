package com.tarcnux.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tarcnux.dsvendas.dto.SaleSuccessDTO;
import com.tarcnux.dsvendas.dto.SaleSumDTO;
import com.tarcnux.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long>{
	//JPQL
	@Query("SELECT new com.tarcnux.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller") 
	List<SaleSumDTO> amountGroupedBySeller();
	
	//JPQL
	@Query("SELECT new com.tarcnux.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller") 
	List<SaleSuccessDTO> successGroupedBySeller();
}
