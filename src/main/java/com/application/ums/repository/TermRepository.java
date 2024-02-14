package com.application.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.ums.domain.Term;

@Repository("termRepository")
public interface TermRepository extends JpaRepository<Term, Long>, JpaSpecificationExecutor , CrudRepository<Term, Long> {
	
}
