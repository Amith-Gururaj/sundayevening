package com.amith.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amith.springjpa.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> 
{

}
