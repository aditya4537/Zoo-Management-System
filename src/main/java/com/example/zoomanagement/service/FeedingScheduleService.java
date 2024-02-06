package com.example.zoomanagement.service;

import java.util.List;
import java.util.Optional;

import com.example.zoomanagement.model.FeedingSchedule;

public interface FeedingScheduleService {

	public List<FeedingSchedule> getAllFeedingSchedules();

	public Optional<FeedingSchedule> getFeedingScheduleById(long id);

	public FeedingSchedule addFeedingSchedule(FeedingSchedule feedingSchedule);

	public Optional<FeedingSchedule> deleteFeedingScheduleeById(long id);
}
