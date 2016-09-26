package com.sliit.smartlady.controller.reader;

import com.sliit.smartlady.model.Article;
import com.sliit.smartlady.service.ArticleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReaderArticleController {

	@Autowired
	ArticleDAO articleDAO;
	
	//----------------------------Get All Articles----------------------------------
	@RequestMapping(value = "/readarticles/", method = RequestMethod.GET)
	public ResponseEntity<List<Article>> listAllArticles(){
		List<Article> articles = articleDAO.getAllArticles();
		 if(articles.isEmpty()){
	            return new ResponseEntity<List<Article>>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<List<Article>>(articles, HttpStatus.OK);
	}
		
		
	//--------------------Update a status of an article------------------------------
	@RequestMapping(value = "/readarticles/{id}", method = RequestMethod.GET)
    public ResponseEntity<Article> getArticleById(@PathVariable("id") int id) {
        System.out.println("Fetch article with id : " + id);
         
        Article currentArticle = articleDAO.findByID(id);
         
        if (currentArticle==null) {
            System.out.println("Article with id " + id + " not found");
            return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Article>(currentArticle, HttpStatus.OK);
    }	
}
