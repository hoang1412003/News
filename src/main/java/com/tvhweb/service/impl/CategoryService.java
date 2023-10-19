package com.tvhweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.tvhweb.dao.ICategoryDAO;
import com.tvhweb.model.CategoryModel;
import com.tvhweb.service.ICategoryService;

public class CategoryService implements ICategoryService{
	@Inject
	private ICategoryDAO categoryDAO;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}
	
	
}
