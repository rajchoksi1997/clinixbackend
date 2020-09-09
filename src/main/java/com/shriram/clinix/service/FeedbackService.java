package com.shriram.clinix.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.Feedback;
import com.shriram.clinix.repository.FeedbackRepository;

@Component
public class FeedbackService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private FeedbackRepository feedbackRepository;

	//submit feedback about medical test
	public void submitFeedback(Feedback feedback){
		feedbackRepository.save(feedback);
	}
	
}
