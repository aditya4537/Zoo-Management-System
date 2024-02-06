package com.example.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zoomanagement.model.FeedingSchedule;

@Repository
public interface FeedingScheduleRepo extends JpaRepository<FeedingSchedule, Long> {

}
