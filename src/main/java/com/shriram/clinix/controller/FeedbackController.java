package com.shriram.clinix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriram.clinix.model.Feedback;
import com.shriram.clinix.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping()
	public void submitFeedback(@RequestBody Feedback feedback){
		feedbackService.submitFeedback(feedback);
	}
	
	
	
	
}
