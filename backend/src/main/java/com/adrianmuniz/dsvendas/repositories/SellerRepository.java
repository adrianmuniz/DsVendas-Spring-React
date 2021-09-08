package com.adrianmuniz.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianmuniz.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
