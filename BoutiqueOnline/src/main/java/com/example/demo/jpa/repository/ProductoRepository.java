package com.example.demo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{
    
}
