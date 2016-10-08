package com.sliit.smartlady.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminDashController {

	  @RequestMapping(value = "/adboard", method = RequestMethod.GET)
	    public String getIndexPage() {
	        return "Admin/AdminIndex";
	    }


      @RequestMapping(value = "/catview", method = RequestMethod.GET)
        public String getCatView() { 
    	  return "Admin/AdminCategoryView"; 
        }

      @RequestMapping(value = "/subcatview", method = RequestMethod.GET)
      	public String getSubCatView() { 
    	  return "Admin/AdminSubCategoryView"; 
      	}
      
      @RequestMapping(value = "/artview", method = RequestMethod.GET)
      public String getArtView() { 
  	  return "Admin/AdminArticleView"; 
      }
      
      @RequestMapping(value = "/advview", method = RequestMethod.GET)
      public String getAdvView() { 
  	  return "Admin/AdminAdvertisementView"; 
      }
}