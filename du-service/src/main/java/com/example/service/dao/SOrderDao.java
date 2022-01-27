package com.example.service.dao;

import com.example.service.entity.SOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SOrderDao extends JpaRepository<SOrder,String> {
}
