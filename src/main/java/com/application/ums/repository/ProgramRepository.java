package com.application.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.ums.domain.Program;

@Repository("programRepository")
public interface ProgramRepository extends JpaRepository<Program, Long> , JpaSpecificationExecutor , CrudRepository<Program, Long> {
	
}
