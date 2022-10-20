package com.cabt.service;

import com.cabt.model.StatementDetails;
import com.cabt.model.StatementGroupNew;
import com.cabt.model.StatementGroupReq;
import com.cabt.model.StatementsList;

public interface StatementGroupService {
	
	StatementGroupNew saveStatementGroup(StatementGroupReq statementGroupReq);
	
	StatementDetails getStatementDetails(String statementGroupId);
	
	StatementGroupNew updateStatementDetails(String statementGroupId,StatementDetails statementDetails);
	
	void deleteStatementDetails(String statementGroupId);
	
	StatementsList getStatementList(String scopeId, String displayableText, String retrievalType, Integer Offset, Integer limit);

}
