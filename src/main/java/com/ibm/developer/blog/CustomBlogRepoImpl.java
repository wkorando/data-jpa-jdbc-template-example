package com.ibm.developer.blog;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomBlogRepoImpl implements CustomBlogRepo {

	private JdbcTemplate jdbcTemplate;

	protected CustomBlogRepoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Iterable<Blog> findBlogsByContent(String content) {
		return jdbcTemplate.query("SELECT * FROM Blogs WHERE body LIKE ?", new Object[] { "%" + content + "%" },
				new BlogRowMapper());
	}

	class BlogRowMapper implements RowMapper<Blog> {
		@Override
		public Blog mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Blog(rs.getLong("id"), rs.getString("title"), rs.getString("body"));
		}
	}
}
