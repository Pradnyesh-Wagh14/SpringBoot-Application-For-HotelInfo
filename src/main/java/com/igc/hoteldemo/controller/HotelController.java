package com.igc.hoteldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igc.hoteldemo.entity.FoodEntity;

@RestController
@RequestMapping("/hotelapi")
public class HotelController {

	@GetMapping("/getall")
	public FoodEntity getAll() {
		FoodEntity foodEntity = new FoodEntity();
		foodEntity.setFid(1);
		foodEntity.setFname("Cold Coffee");
		foodEntity.setPrice(60);
		foodEntity.setQty(5);
		return foodEntity;
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
