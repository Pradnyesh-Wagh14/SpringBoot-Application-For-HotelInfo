package com.igc.hoteldemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igc.hoteldemo.entity.FoodEntity;
import com.igc.hoteldemo.model.FoodModel;
import com.igc.hoteldemo.service.FoodService;

@RestController
@RequestMapping("/hotelapi")
public class HotelController {

	FoodService foodService = new FoodService();
	
	@GetMapping("/getall")
	public List<FoodEntity> getAll() {
		return foodService.getAllFood();
	}
		
	@PostMapping("/addfood")
	public void addFood(@RequestBody FoodModel foodModel) {
		foodService.addNewFood(foodModel);
	}
	
	@GetMapping("/fid")
	public String getFoodNo() {
		return "Food Info basis on FID";
	}
	
	@GetMapping("/name")
	public String getName() {
		return "Food Info basis on Name";
	}

}













