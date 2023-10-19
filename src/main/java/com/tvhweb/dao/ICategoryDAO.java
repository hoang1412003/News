package com.tvhweb.dao;

import java.util.List;

import com.tvhweb.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
}
