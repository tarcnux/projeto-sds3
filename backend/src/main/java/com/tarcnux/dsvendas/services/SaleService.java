package com.tarcnux.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tarcnux.dsvendas.dto.SaleDTO;
import com.tarcnux.dsvendas.entities.Sale;
import com.tarcnux.dsvendas.repositories.SaleRepository;
import com.tarcnux.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = saleRepository.findAll(pageable);		
		return result.map(x -> new SaleDTO(x));
	}

}
