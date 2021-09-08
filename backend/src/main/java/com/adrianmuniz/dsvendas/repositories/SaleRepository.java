package com.adrianmuniz.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianmuniz.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
