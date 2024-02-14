package com.application.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.ums.domain.CourseSchedule;

@Repository("courseScheduleRepository")
public interface CourseScheduleRepository extends JpaRepository<CourseSchedule, Long>, JpaSpecificationExecutor, CrudRepository<CourseSchedule, Long> {
	
}
