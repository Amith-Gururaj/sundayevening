package com.amith.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amith.springjpa.model.Items;
import com.amith.springjpa.service.ItemService;
import com.amith.springjpa.serviceimpl.ServiceImpl;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController 
{
	@Autowired
	private ItemService obj;
	
	public MainController(ServiceImpl obj) {
		super();
		this.obj = obj;
	}
	
  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addItem (@RequestParam String id, @RequestParam String name) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request	  	  
	    String res = obj.add(id,name);
	    return res;
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Items> getAllItems() {
    // This returns a JSON or XML with the Items
	  return obj.getAll();
  }
  
  @GetMapping(path="/getbyid")
  public @ResponseBody Object getItemsById(@RequestParam String id) // This returns data in object format
  {
  	 	return obj.getById(id);
  }
  
  @DeleteMapping(path="/del")
  public @ResponseBody String deleteItems(@RequestParam String id)
  {
  	return obj.deleteItem(id);  
  } 
}
