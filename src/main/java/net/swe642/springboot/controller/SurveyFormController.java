package net.swe642.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.swe642.springboot.exception.ResourceNotFoundException;
import net.swe642.springboot.model.SurveyForm;
import net.swe642.springboot.repository.SurveyRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class SurveyFormController {

	@Autowired
	private SurveyRepository surveyRepository;
	

	// get all surveys
	@GetMapping("/surveys")
	public List<SurveyForm> getAllSurveys(){
		return surveyRepository.findAll();
	}	
	
	
	// insert survey details rest API
	@PostMapping("/surveys")
	public SurveyForm createSurveyForm(@RequestBody SurveyForm survey) {
		return surveyRepository.save(survey);
	}
	
	// get survey details by id rest API
	@GetMapping("/surveys/{id}")
	public ResponseEntity<SurveyForm> getSurveyDetailsById(@PathVariable Long id) {
		SurveyForm survey = surveyRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Survey not exist with id :" + id));
		return ResponseEntity.ok(survey);
	}
	
}
