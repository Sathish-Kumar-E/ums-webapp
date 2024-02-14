package com.application.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.ums.domain.EmploymentGrade;

@Repository("employmentGradeRepository")
public interface EmploymentGradeRepository extends JpaRepository<EmploymentGrade, Long>, JpaSpecificationExecutor , CrudRepository<EmploymentGrade, Long> {
	
}
