package com.example.zoomanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zoomanagement.model.FeedingSchedule;
import com.example.zoomanagement.service.FeedingScheduleService;

@RestController
@RequestMapping("/feedingSchedule")
public class feedingScheduleController {
	
	@Autowired
	private FeedingScheduleService feedingScheduleService;

	@GetMapping("/getAllFeedingSchedule")
	public List<FeedingSchedule> getAllFeedingSchedules() {
		return feedingScheduleService.getAllFeedingSchedules();
	}

	@GetMapping("/getAllFeedingSchedule/{id}")
	public Optional<FeedingSchedule> getFeedingSchedule(@PathVariable long id) {
		return feedingScheduleService.getFeedingScheduleById(id);
	}
	
	@PostMapping("/addFeedingSchedule")
	public FeedingSchedule addFeedingSchedule(@RequestBody FeedingSchedule feedingSchedule) {
		return feedingScheduleService.addFeedingSchedule(feedingSchedule);
	}
	
	@DeleteMapping("/deleteFeedingSchedule/{id}")
	public Optional<FeedingSchedule> deleteFeedingSchedule(@PathVariable long id) {
		return feedingScheduleService.deleteFeedingScheduleeById(id);
//		return "Deleted";
	}
}
