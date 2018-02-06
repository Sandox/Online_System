package com.sandole.backendshopping.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.sandole.backendshopping.dao.CategoryDAO;
import com.sandole.backendshopping.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static
	{
		Category category = new Category();
		// adding category section
		
		category.setId(1);
		category.setName("Specials");
		category.setDescription("All the specials in the store are found here");
		category.setImageURL("SPEC_01.png");
		
		categories.add(category);
		
		// Adding 2nd Category 
		
		category = new Category();
		category.setId(2);
		category.setName("Recipes");
		category.setDescription("All the best recipes to assist you make the perfect meal");
		category.setImageURL("SPEC_02.png");
		
		categories.add(category);
		
		// Adding 3rd Category 
		
		category = new Category();
		category.setId(3);
		category.setName("Liquor and Wine");
		category.setDescription("All the range of our liquor and wine in store");
		category.setImageURL("SPEC_03.png");
				
		categories.add(category);
				
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
		
		
	}

}
