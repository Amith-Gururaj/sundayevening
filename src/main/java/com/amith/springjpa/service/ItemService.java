package com.amith.springjpa.service;

import com.amith.springjpa.model.Items;

public interface ItemService 
{
	public String add(String id,String name);
	public Iterable<Items> getAll();
	public Object getById(String id);
	public String deleteItem(String id);
}