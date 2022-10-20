package com.cabt.controller;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cabt.model.StatementDetails;
import com.cabt.model.StatementGroupNew;
import com.cabt.model.StatementGroupReq;
import com.cabt.model.StatementsList;
import com.cabt.service.StatementGroupService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")
@RestController
public class StatementGroupApiController implements StatementGroupApi {

    private static final Logger log = LoggerFactory.getLogger(StatementGroupApiController.class);   
    
    @Autowired
    StatementGroupService statementGroupService;

    
    public ResponseEntity<Void> deleteStatements(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("statementGroupId") String statementGroupId) {
    	if(Objects.nonNull(statementGroupId)) {
    		 try {
	    		statementGroupService.deleteStatementDetails(statementGroupId);
	    		return new ResponseEntity<Void>(HttpStatus.OK);
    		 }catch (Exception e) {
                 log.error("Couldn't serialize response for content type application/json", e);
                 return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
             }
    	}    	
        return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<StatementsList> getAllStatementGroup(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "displayableText", required = true) String displayableText,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "scopeId", required = false) String scopeId,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="minified")) @Valid @RequestParam(value = "retrievalType", required = false, defaultValue="minified") String retrievalType,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="0")) @Valid @RequestParam(value = "Offset", required = false, defaultValue="0") Integer offset,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="20")) @Valid @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit) {
    	StatementsList statementsList = new StatementsList();
        if (Objects.nonNull(displayableText)) {
            try {
            	statementsList = statementGroupService.getStatementList(scopeId, displayableText, retrievalType, offset, limit);
            	if(Objects.nonNull(statementsList)) {
            		return new ResponseEntity<StatementsList>(statementsList, HttpStatus.OK);
            	}else {
            		return new ResponseEntity<StatementsList>(HttpStatus.NOT_FOUND);
            	}
                
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StatementsList>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StatementsList>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<StatementDetails> getStatementDetails(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("statementGroupId") String statementGroupId) {
       StatementDetails StatementDetails= new StatementDetails();
        if (Objects.nonNull(statementGroupId)) {
            try {     
            	StatementDetails = statementGroupService.getStatementDetails(statementGroupId);
            	if(Objects.nonNull(StatementDetails)) {
            		  return new ResponseEntity<StatementDetails>(StatementDetails, HttpStatus.OK);
            	}              
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StatementDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
       return new ResponseEntity<StatementDetails>(HttpStatus.BAD_REQUEST);      
    }

    public ResponseEntity<StatementGroupNew> updateStatement(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("statementGroupId") String statementGroupId,@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent Statement", required=true, schema=@Schema()) @Valid @RequestBody StatementDetails statementDetails) {
       
    	StatementGroupNew statementGroupUpdate= new StatementGroupNew();    	
        if (Objects.nonNull(statementGroupId) && Objects.nonNull(statementDetails) && statementGroupId.equalsIgnoreCase(statementDetails.getStatementGroupId())) {
            try {            
            	statementGroupUpdate = statementGroupService.updateStatementDetails(statementGroupId, statementDetails);
                return new ResponseEntity<StatementGroupNew>(statementGroupUpdate, HttpStatus.OK);            	
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StatementGroupNew>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        return new ResponseEntity<StatementGroupNew>(HttpStatus.BAD_REQUEST);
    }
    
    public ResponseEntity<StatementGroupNew> saveStatementGroup(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new statement group", required=true, schema=@Schema()) @Valid @RequestBody StatementGroupReq statementGroupReq) {
        try {    	   
     	   if (Objects.nonNull(statementGroupReq)) {
            	StatementGroupNew statementGroupNew=null;
            	statementGroupNew = statementGroupService.saveStatementGroup(statementGroupReq);    	
            	return new ResponseEntity<StatementGroupNew>(statementGroupNew,HttpStatus.CREATED); 
            }else {
            	 return new ResponseEntity<StatementGroupNew>(HttpStatus.BAD_REQUEST);
            }
        }catch(Exception e){
     	   log.error("Exception Occure::"+e);
     	   return new ResponseEntity<StatementGroupNew>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
     }

}
