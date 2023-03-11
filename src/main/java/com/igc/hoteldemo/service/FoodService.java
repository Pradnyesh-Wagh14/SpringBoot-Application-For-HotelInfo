package com.igc.hoteldemo.service;

import java.util.ArrayList;
import java.util.List;

import com.igc.hoteldemo.entity.FoodEntity;
import com.igc.hoteldemo.model.FoodModel;

public class FoodService {

	List<FoodEntity> foodEntityList = new ArrayList<FoodEntity>();
	
	public List<FoodEntity> getAllFood() {
		return foodEntityList;
	}
	
	public void addNewFood(FoodModel foodModel) {
		
		FoodEntity foodEntity = new FoodEntity();
		
		foodEntity.setFid(foodModel.getFid());
		foodEntity.setFname(foodModel.getFname());
		foodEntity.setPrice(foodModel.getPrice());
		foodEntity.setQty(foodModel.getQty());
		
		foodEntityList.add(foodEntity);
	}
	
}
