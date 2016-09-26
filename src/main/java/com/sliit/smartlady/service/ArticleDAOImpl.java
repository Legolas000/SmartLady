package com.sliit.smartlady.service;

import com.sliit.smartlady.model.Article;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ArticleDAOImpl implements ArticleDAO {

	private JdbcTemplate jdbcTemplate;
	
	public ArticleDAOImpl(DataSource datasource)
	{
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public List<Article> getAllArticles() {
		String sql = "SELECT * FROM articles WHERE status = 'Pending' ";
		List<Article> listArticle = jdbcTemplate.query(sql,  new RowMapper<Article>() {
			
			@Override
			public Article mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Article lArticle = new Article();

				lArticle.setId(rs.getInt("id"));
				lArticle.setTitle(rs.getString("title"));
				lArticle.setDescription(rs.getString("description"));
				lArticle.setPublishedDate(rs.getString ("publishedDate"));
				lArticle.setFeatured(rs.getBoolean("isFeatured"));
				lArticle.setOverallRating(rs.getDouble("overallRating"));
				lArticle.setImagePath(rs.getString ("imagePath"));
				lArticle.setStatus(rs.getString("status"));
				lArticle.setWriterID(rs.getInt ("writerId"));
				lArticle.setCategoryID(rs.getInt("categoryId"));
				
				return lArticle;
			}
		});
		
		return listArticle;
	}

	@Override
	public Article findByID(int articleID) {
		
		String sql = "SELECT * FROM articles WHERE id = " + articleID;

		 return jdbcTemplate.query(sql, new ResultSetExtractor<Article>() {
			 
		        @Override
		        public Article extractData(ResultSet rs) throws SQLException,
		                DataAccessException {
		            if (rs.next()) {
		            	Article article = new Article();
		            	article.setId(rs.getInt("id"));
		            	article.setTitle(rs.getString("title"));
		            	article.setDescription(rs.getString("description"));
		            	article.setPublishedDate(rs.getString ("publishedDate"));
						article.setFeatured(rs.getBoolean("isFeatured"));
						article.setOverallRating(rs.getDouble("overallRating"));
						article.setImagePath(rs.getString ("imagePath"));
						article.setWriterID(rs.getInt ("writerId"));
						article.setCategoryID(rs.getInt("categoryId"));
						article.setStatus(rs.getString("status"));
						return article;
		            }
		            return null;
		        }
		    });
	}
	
	@Override
	public void updateStatus(Article article) {
		String sql = "UPDATE articles SET status = 'Approved' "+
				" WHERE id = ?";
		jdbcTemplate.update(sql, article.getId());
	}

	@Override
	public void updateStatuses(Article[] article) {
		// TODO Auto-generated method stub
		
	}

}
