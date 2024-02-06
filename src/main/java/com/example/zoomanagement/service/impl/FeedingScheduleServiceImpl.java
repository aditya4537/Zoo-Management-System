package com.example.zoomanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zoomanagement.model.FeedingSchedule;
import com.example.zoomanagement.repository.FeedingScheduleRepo;
import com.example.zoomanagement.service.FeedingScheduleService;

@Service
public class FeedingScheduleServiceImpl implements FeedingScheduleService {
	
	@Autowired
	private FeedingScheduleRepo feedingScheduleRepo;

	@Override
	public List<FeedingSchedule> getAllFeedingSchedules() {
		return feedingScheduleRepo.findAll();
	}

	@Override
	public Optional<FeedingSchedule> getFeedingScheduleById(long id) {
		return feedingScheduleRepo.findById(id);
	}

	@Override
	public FeedingSchedule addFeedingSchedule(FeedingSchedule feedingSchedule) {
		return feedingScheduleRepo.save(feedingSchedule);
	}

	@Override
	public Optional<FeedingSchedule> deleteFeedingScheduleeById(long id) {
		Optional<FeedingSchedule> feedingSchedule = feedingScheduleRepo.findById(id);
		feedingScheduleRepo.deleteById(id);
		return feedingSchedule;
	}

}
