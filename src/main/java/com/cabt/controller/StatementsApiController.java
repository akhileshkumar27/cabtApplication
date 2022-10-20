package com.cabt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cabt.model.StatementDetails;
import com.cabt.model.StatementMinified;
import com.cabt.model.StatementNew;
import com.cabt.model.StatementNewResponse;
import com.cabt.model.Statements;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-10-08T12:16:03.593Z[GMT]")
@RestController
public class StatementsApiController implements StatementsApi {

    private static final Logger log = LoggerFactory.getLogger(StatementsApiController.class);
    
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StatementsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

  
   
    /*public ResponseEntity<StatementNewResponse> addStatement(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new statement group", required=true, schema=@Schema()) @Valid @RequestBody StatementNew statementNew) {
    	try {    	   
      	   if (Objects.nonNull(statementNew)) {
      		 StatementNewResponse statementNewResponse=null;
             	//statementGroupNew = statementGroupService.saveStatementGroup(statementNew);    	
             	//return new ResponseEntity<StatementGroupNew>(statementGroupNew,HttpStatus.CREATED); 
                return new ResponseEntity<StatementNewResponse>(objectMapper.readValue("{\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : \"10\",\n  \"statementId\" : \"10\",\n  \"statementAlias\" : \"statementAlias\",\n  \"statementDisplay\" : \"statementDisplay\"\n}", StatementNewResponse.class), HttpStatus.NOT_IMPLEMENTED);
              }else {
             	 return new ResponseEntity<StatementNewResponse>(HttpStatus.BAD_REQUEST);
             }
         }catch(Exception e){
      	   log.error("Exception Occure::"+e);
      	   return new ResponseEntity<StatementNewResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
    	
       
    }*/

    public ResponseEntity<Void> deleteStatement(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("statementId") String statementId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<StatementMinified>> getAllStatement(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "scopeId", required = false) String scopeId,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema(allowableValues={ "Full", "Minified" }
)) @Valid @RequestParam(value = "retrievalType", required = false) String retrievalType,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="0")) @Valid @RequestParam(value = "Offset", required = false, defaultValue="0") Integer offset,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="20")) @Valid @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<StatementMinified>>(objectMapper.readValue("[ {\n  \"firstLink\" : \"https://localhost:3000/statement?offset=0&limit=20\",\n  \"totalResults\" : 200,\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"statementAlias\" : \"TestAlias\",\n    \"id\" : 1\n  },\n  \"statementId\" : \"10\",\n  \"prevLink\" : \"https://localhost:3000/statement?offset=0&limit=20\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"lastLink\" : \"https://localhost:3000/statement?offset=41&limit=20\",\n  \"nextLink\" : \"https://localhost:3000/statement?offset=181&limit=20\"\n}, {\n  \"firstLink\" : \"https://localhost:3000/statement?offset=0&limit=20\",\n  \"totalResults\" : 200,\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"statementAlias\" : \"TestAlias\",\n    \"id\" : 1\n  },\n  \"statementId\" : \"10\",\n  \"prevLink\" : \"https://localhost:3000/statement?offset=0&limit=20\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"lastLink\" : \"https://localhost:3000/statement?offset=41&limit=20\",\n  \"nextLink\" : \"https://localhost:3000/statement?offset=181&limit=20\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<StatementMinified>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<StatementMinified>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<StatementDetails>> getAllStatementBySettingId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("settingId") String settingId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<StatementDetails>>(objectMapper.readValue("[ {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<StatementDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<StatementDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Statements>> getStatementDetails(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("statementId") String statementId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Statements>>(objectMapper.readValue("[ {\n  \"recordOperations\" : {\n    \"dependentStatements\" : \"dependentStatements\"\n  },\n  \"statementText\" : \"statementText\",\n  \"statementDisplay\" : \"statementDisplay\",\n  \"frequency\" : {\n    \"frequencyType\" : \"fnName\",\n    \"frequencyValue\" : \"1\"\n  },\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"selector\" : \"selector\",\n  \"negateStatement\" : true,\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"models\" : {\n    \"primaryDiagnosisConcepts\" : true,\n    \"negateModifier\" : true,\n    \"model\" : \"1\",\n    \"primaryConcepts\" : {\n      \"conceptAlias\" : \"1\",\n      \"conceptId\" : \"uuid\",\n      \"contextId\" : \"uuid\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"baseVersion\" : \"v1\",\n  \"author\" : \"auther\",\n  \"withDistinct\" : \"withDistinct\",\n  \"statementAlias\" : \"Alias\",\n  \"version\" : \"v1\",\n  \"cardinality\" : 0,\n  \"statementDependencyAlias\" : \"statementDependencyAlias\",\n  \"createdBy\" : \"uuid\",\n  \"recordName\" : \"recordName\",\n  \"statementId\" : \"10\",\n  \"status\" : \"Draft\"\n}, {\n  \"recordOperations\" : {\n    \"dependentStatements\" : \"dependentStatements\"\n  },\n  \"statementText\" : \"statementText\",\n  \"statementDisplay\" : \"statementDisplay\",\n  \"frequency\" : {\n    \"frequencyType\" : \"fnName\",\n    \"frequencyValue\" : \"1\"\n  },\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"selector\" : \"selector\",\n  \"negateStatement\" : true,\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"models\" : {\n    \"primaryDiagnosisConcepts\" : true,\n    \"negateModifier\" : true,\n    \"model\" : \"1\",\n    \"primaryConcepts\" : {\n      \"conceptAlias\" : \"1\",\n      \"conceptId\" : \"uuid\",\n      \"contextId\" : \"uuid\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"baseVersion\" : \"v1\",\n  \"author\" : \"auther\",\n  \"withDistinct\" : \"withDistinct\",\n  \"statementAlias\" : \"Alias\",\n  \"version\" : \"v1\",\n  \"cardinality\" : 0,\n  \"statementDependencyAlias\" : \"statementDependencyAlias\",\n  \"createdBy\" : \"uuid\",\n  \"recordName\" : \"recordName\",\n  \"statementId\" : \"10\",\n  \"status\" : \"Draft\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Statements>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Statements>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<StatementDetails>> getStatementsByContextId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("contextId") String contextId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("conceptAlias") String conceptAlias) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<StatementDetails>>(objectMapper.readValue("[ {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<StatementDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<StatementDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<StatementDetails>> getStatementsByFunctionId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("functionId") String functionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<StatementDetails>>(objectMapper.readValue("[ {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<StatementDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<StatementDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<StatementDetails>> getStatementsByStatementId(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("statementId") String statementId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<StatementDetails>>(objectMapper.readValue("[ {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"statementGroupOperation\" : {\n    \"arguments\" : {\n      \"statementUId\" : \"1\",\n      \"operator\" : \"AND\"\n    }\n  },\n  \"updatedBy\" : \"uuid\",\n  \"author\" : \"auther\",\n  \"version\" : \"v1\",\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"createdBy\" : \"uuid\",\n  \"scope\" : {\n    \"name\" : \"Test\",\n    \"id\" : 1\n  },\n  \"statementGroupSummary\" : \"groupSummary\",\n  \"statementGroupId\" : \"10\",\n  \"statementGroupAlias\" : \"GroupAlias\",\n  \"statementGroupDisplay\" : \"groupDisplay\",\n  \"status\" : \"Draft\",\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<StatementDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<StatementDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStatements(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("statementId") String statementId,@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent Statement", required=true, schema=@Schema()) @Valid @RequestBody Statements body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
