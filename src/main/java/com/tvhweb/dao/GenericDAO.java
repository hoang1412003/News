package com.tvhweb.dao;

import java.util.List;

import com.tvhweb.mapper.RowMapper;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper , Object... parameters);
	Long insert(String sql, Object... parameters);
	void update(String sql, Object... parameters);
}
