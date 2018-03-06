package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.service.TourAppService;


	@RestController
	public class TourAppcontroller {

		@Autowired
		private TourAppService tourAppService;
		
	@RequestMapping(method=RequestMethod.GET,value="/places",produces="application/json")
	public ResponseEntity<TourAppBean> getPlaces()
	{	String message=null;
		TourAppBean bean=new TourAppBean();
		//Response response=null;
		System.out.println("Method called");

		List<PlaceBean> places=new ArrayList<>();
		
		try {
			
			places=tourAppService.getPlaces();
			bean.setPlaces(places);
			bean.setMessage("success");
		}

		catch (Exception e1) {
			// TODO: handle exception
			System.out.println(e1.getMessage());
		
			message=e1.getMessage();
			bean.setPlaces(places);
			bean.setMessage(message);
		}
		//model.addAttribute("message", message);
		
		//response=Response.status(Response.Status.OK).entity(jsonObject.toString()).build();
		//return response;
		
		//responseEntity=new ResponseEntity<String>(message, HttpStatus.OK);
	    HttpHeaders responseHeaders = new HttpHeaders();
	    
	    
	    
	    return ResponseEntity.ok().headers(responseHeaders).body(bean);
		//return responseEntity;

	}
	}
	
