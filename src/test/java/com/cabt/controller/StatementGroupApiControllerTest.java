package com.cabt.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cabt.model.Arguments;
import com.cabt.model.ArgumentsDetails;
import com.cabt.model.ArgumentsDetails.OperatorEnum;
import com.cabt.model.Scope;
import com.cabt.model.StatementDetails;
import com.cabt.model.StatementGroupNew;
import com.cabt.model.StatementGroupReq;
import com.cabt.model.Statements;
import com.cabt.model.StatementsList;
import com.cabt.service.StatementGroupService;


public class StatementGroupApiControllerTest {
	   
	  
	   
	   @InjectMocks
	   StatementGroupApiController statementGroupApiController;	   
	  
	   
	   @Mock
	   StatementGroupService statementGroupService;
	   
	   @BeforeEach
	   void setup() throws Exception {
		   MockitoAnnotations.openMocks(this);
		   
	   }
	
	    @Test
	    public void deleteStatements() {
	    	String statementId = "1";
        	//when(this.statementGroupService.deleteStatementDetails("1")).thenReturn("okay");
        	assertNotNull(statementGroupApiController.deleteStatements(statementId));
	    }
        @Test
	    public void getAllStatementGroup() {
        	String scopeId = "1";
        	String displayableText= "test";
        	String retrievalType="minfied";
        	Integer offset = 0;
        	Integer limit = 20;
        	StatementsList statementsList = new StatementsList();
        	List<Statements> statementList = new ArrayList<>();
        	Scope scope = new Scope();
	    	scope.setId("1");
	    	scope.setName("test");
        	Statements statements = new Statements();
        	statements.setStatementGroupDisplay("display");
        	statements.setStatementGroupSummary("summary");
        	statements.setStatementGroupId("1");
        	statements.setScope(scope);
        	statementList.add(statements);
        	statementsList.setStatementList(statementList);
        	statementsList.setTotalResults(BigDecimal.valueOf(200));
        	when(this.statementGroupService.getStatementList(scopeId, displayableText, retrievalType, offset, limit)).thenReturn(statementsList);
        	assertNotNull(statementGroupApiController.getAllStatementGroup(scopeId, displayableText, retrievalType, offset, limit));
        	
	    }
        @Test
	    public void getStatementDetails() {
        	String statementId = "1";
        	StatementDetails statementDetails= new StatementDetails();
        	statementDetails.setStatementGroupAlias("alias");
        	statementDetails.setAuthor("uuid");
        	statementDetails.setCreatedBy("uuid");
        	statementDetails.setStatementGroupDisplay("display");
        	statementDetails.setStatementGroupSummary("summary");
        	statementDetails.setVersion("1");
        	statementDetails.setUpdatedBy("uuid");
        	
        	when(this.statementGroupService.getStatementDetails(statementId)).thenReturn(statementDetails);
        	assertNotNull(statementGroupApiController.getStatementDetails(statementId));
	    }
        @Test
	    public void updateStatement() {
        	String statementId = "1";
        	StatementDetails statementDetails= new StatementDetails();
        	StatementGroupNew statementGroupNew = new StatementGroupNew();
        	statementDetails.setStatementGroupAlias("alias");
        	statementDetails.setAuthor("uuid");
        	statementDetails.setCreatedBy("uuid");
        	statementDetails.setStatementGroupDisplay("display");
        	statementDetails.setStatementGroupSummary("summary");
        	statementDetails.setVersion("1");
        	statementDetails.setUpdatedBy("uuid");
        	
        	statementGroupNew.setStatementGroupId("1");
        	Scope scope = new Scope();
	    	scope.setId("1");
	    	scope.setName("test");
	    	statementGroupNew.setScope(scope);
	    	statementGroupNew.setStatementGroupDisplay("groupDisaplay");
	    	statementGroupNew.setAuthor("uuid");
	    	statementGroupNew.setCreatedBy("uuid");
	    	statementGroupNew.setStatementGroupSummary("groupSummary");
	    	statementGroupNew.setVersion("1");
        	when(this.statementGroupService.updateStatementDetails("1",statementDetails)).thenReturn(statementGroupNew);
        	assertNotNull(statementGroupApiController.updateStatement("1", statementDetails));
	    	
	    }
        
       
	    @Test
	    public void saveStatementGroup() {
	    	StatementGroupReq statementGroupReq = new StatementGroupReq();
	    	StatementGroupNew statementGroupNew = new StatementGroupNew();
	    	Scope scope = new Scope();
	    	scope.setId("1");
	    	scope.setName("test");
	    	statementGroupReq.setStatementGroupId("1");
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
	    	
	    	//statementGroupNew	    	
	    	statementGroupNew.setStatementGroupId("1");
	    	statementGroupNew.setScope(scope);
	    	statementGroupNew.setStatementGroupDisplay("groupDisaplay");
	    	statementGroupNew.setAuthor("uuid");
	    	statementGroupNew.setCreatedBy("uuid");
	    	statementGroupNew.setStatementGroupSummary("groupSummary");
	    	statementGroupNew.setVersion("1");
	    	when(this.statementGroupService.saveStatementGroup(statementGroupReq)).thenReturn(statementGroupNew);
	    	assertNotNull(statementGroupApiController.saveStatementGroup(statementGroupReq));
	    }
	
	

}
