package com.cabt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cabt.entity.StatementGroup;

@Repository
public interface StatementGroupRepository extends CrudRepository<StatementGroup, String> {
	
	
	 @Query("select s from StatementGroup s where s.statementGroupDisplay=:statementGroupDisplay")
	 Page<StatementGroup> findAllPageByDisplay(String statementGroupDisplay,Pageable pageable);
	 
	 @Query("select s from StatementGroup s where s.statementGroupDisplay=:statementGroupDisplay and s.scopeId=:scopeId")
	 Page<StatementGroup> findAllPageWithScopeIdByDisplay(String statementGroupDisplay,String scopeId,Pageable pageable);

}
