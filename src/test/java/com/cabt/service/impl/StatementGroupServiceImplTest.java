package com.cabt.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.cabt.entity.StatementGroup;
import com.cabt.model.Arguments;
import com.cabt.model.ArgumentsDetails;
import com.cabt.model.ArgumentsDetails.OperatorEnum;
import com.cabt.model.Scope;
import com.cabt.model.StatementDetails;
import com.cabt.model.StatementGroupNew;
import com.cabt.model.StatementGroupReq;
import com.cabt.repository.StatementGroupRepository;
import com.cabt.service.StatementGroupService;

public class StatementGroupServiceImplTest {

	@InjectMocks
	StatementGroupService statementGroupService;
	
	@Mock
	StatementGroupRepository statementGroupRepository;
	
	@Test
	public void saveStatementGroupTest() {
		StatementGroup statementGroup = new StatementGroup();
		StatementGroupNew statementGroupNew = new StatementGroupNew();
		StatementGroupReq statementGroupReq = new StatementGroupReq();
		Scope scope = new Scope();
    	scope.setId("1");
    	scope.setName("test");
		statementGroupNew.setStatementGroupId("1");
    	statementGroupNew.setScope(scope);
    	statementGroupNew.setStatementGroupDisplay("groupDisaplay");
    	statementGroupNew.setAuthor("uuid");
    	statementGroupNew.setCreatedBy("uuid");
    	statementGroupNew.setStatementGroupSummary("groupSummary");
    	statementGroupNew.setVersion("1");
    	
    	statementGroup.setAuthor("uuid");
    	statementGroup.setBaseVersion("1");
    	statementGroup.setScopeId("1");
    	statementGroup.setScopeName("test");
    	statementGroup.setStatementGroupAlias("alias");
    	statementGroup.setStatementGroupDisplay("display");
    	statementGroup.setStatementGroupSummary("summary");
    	
    	//statementGroupReq.setStatementGroupId("1");
    	statementGroupReq.setScope(scope);
    	statementGroupReq.setStatementGroupAlias("groupAlias");
    	statementGroupReq.setStatementGroupDisplay("groupDisaplay");
    	statementGroupReq.setStatementGroupSummary("groupSummary");
    	statementGroupReq.setCreatedBy("uuid");
    	ArgumentsDetails arguDetails = new ArgumentsDetails();
    	arguDetails.setOperator(OperatorEnum.AND);
    	arguDetails.setStatementUId("statementUid");
    	Arguments argu= new Arguments();
    	argu.setArguments(arguDetails);
    	statementGroupReq.setStatementGroupOperation(argu);
    	
    	when(this.statementGroupRepository.save(statementGroup)).thenReturn(statementGroup);
    	assertNotNull(statementGroupService.saveStatementGroup(statementGroupReq));
		
	}
	
	@Test
	public void getStatementDetails() {
		String statementId="1";
		StatementGroup statementGroup= new StatementGroup();
		StatementGroup updateStatementGroupNew = new StatementGroup();
		statementGroup.setAuthor("uuid");
    	statementGroup.setBaseVersion("1");
    	statementGroup.setScopeId("1");
    	statementGroup.setScopeName("test");
    	statementGroup.setStatementGroupAlias("alias");
    	statementGroup.setStatementGroupDisplay("display");
    	statementGroup.setStatementGroupSummary("summary");
    	
    	updateStatementGroupNew.setAuthor("uuid");
		updateStatementGroupNew.setBaseVersion("1");
		updateStatementGroupNew.setScopeId("1");
		updateStatementGroupNew.setScopeName("test");
		updateStatementGroupNew.setStatementGroupAlias("alias");
		updateStatementGroupNew.setStatementGroupDisplay("display");
		updateStatementGroupNew.setStatementGroupSummary("summary");
		//when(this.statementGroupRepository.findById(statementId)).thenReturn(updateStatementGroupNew);
    	assertNotNull(statementGroupService.getStatementDetails(statementId));
		
	}
	@Test
	public void updateStatementDetailsTest() {
		String statementId="1";
		StatementGroup updateStatementGroup = new StatementGroup();
		StatementGroup updateStatementGroupNew = new StatementGroup();
		StatementDetails statementDetails = new StatementDetails();
		updateStatementGroup.setAuthor("uuid");
		updateStatementGroup.setBaseVersion("1");
		updateStatementGroup.setScopeId("1");
		updateStatementGroup.setScopeName("test");
		updateStatementGroup.setStatementGroupAlias("alias");
		updateStatementGroup.setStatementGroupDisplay("display");
		updateStatementGroup.setStatementGroupSummary("summary");
		updateStatementGroup.setStatementGroupId(statementId);
		//updateStatementGroupNew
		updateStatementGroupNew.setAuthor("uuid");
		updateStatementGroupNew.setBaseVersion("1");
		updateStatementGroupNew.setScopeId("1");
		updateStatementGroupNew.setScopeName("test");
		updateStatementGroupNew.setStatementGroupAlias("alias");
		updateStatementGroupNew.setStatementGroupDisplay("display");
		updateStatementGroupNew.setStatementGroupSummary("summary");
		when(this.statementGroupRepository.save(updateStatementGroup)).thenReturn(updateStatementGroupNew);
		assertNotNull(statementGroupService.updateStatementDetails(statementId,statementDetails));
	}
	@Test
	public void deleteStatementDetailsTest() {
		String statementId="1";
		//when(this.statementGroupRepository.deleteById(statementId)).thenReturn(void);
		//assertNotNull(statementGroupService.updateStatementDetails(statementId,statementDetails));
	}
	
	
}
