package com.application.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.ums.domain.CourseTeachingAssistant;

@Repository("courseTeachingAssistantRepository")
public interface CourseTeachingAssistantRepository extends JpaRepository<CourseTeachingAssistant, Long>,  JpaSpecificationExecutor , CrudRepository<CourseTeachingAssistant, Long> {
	
}
