package com.sliit.smartlady.model;

public class Article {

	private int id;
	private String title;
	private String description;
	private String publishedDate;
	private String imagePath;
	private boolean isFeatured;
	private double overallRating;
	private int categoryID;
	private int writerID;
	private String status;


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Article() {
		this.id = 0;
	}
	
	public Article(int articleID, String title, String description, String published
			,String image, int categoryID, int writerID, boolean isFeatured, double overallRating){
		
		this.id = articleID;
		this.title = title;
		this.description = description;
		this.publishedDate = published;
		this.imagePath = image;
		this.categoryID = categoryID;
		this.writerID = writerID;
		this.isFeatured = isFeatured;
		this.overallRating = overallRating;
	}
	
	public Boolean findByID(int articleID)
	{
		return articleID == this.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isFeatured() {
		return isFeatured;
	}

	public void setFeatured(boolean featured) {
		isFeatured = featured;
	}

	public double getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(double overallRating) {
		this.overallRating = overallRating;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getWriterID() {
		return writerID;
	}

	public void setWriterID(int writerID) {
		this.writerID = writerID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Article article = (Article) o;

		if (id != article.id) return false;
		if (isFeatured != article.isFeatured) return false;
		if (Double.compare(article.overallRating, overallRating) != 0) return false;
		if (categoryID != article.categoryID) return false;
		if (writerID != article.writerID) return false;
		if (title != null ? !title.equals(article.title) : article.title != null) return false;
		if (description != null ? !description.equals(article.description) : article.description != null) return false;
		if (publishedDate != null ? !publishedDate.equals(article.publishedDate) : article.publishedDate != null)
			return false;
		if (imagePath != null ? !imagePath.equals(article.imagePath) : article.imagePath != null) return false;
		return status != null ? status.equals(article.status) : article.status == null;

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id;
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (publishedDate != null ? publishedDate.hashCode() : 0);
		result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
		result = 31 * result + (isFeatured ? 1 : 0);
		temp = Double.doubleToLongBits(overallRating);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + categoryID;
		result = 31 * result + writerID;
		result = 31 * result + (status != null ? status.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Article{" +
				"id=" + id +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", publishedDate='" + publishedDate + '\'' +
				", imagePath='" + imagePath + '\'' +
				", isFeatured=" + isFeatured +
				", overallRating=" + overallRating +
				", categoryID=" + categoryID +
				", writerID=" + writerID +
				", status='" + status + '\'' +
				'}';
	}

}
