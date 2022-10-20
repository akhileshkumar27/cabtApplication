package com.cabt.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.cabt.entity.StatementGroup;
import com.cabt.enums.StatementType;
import com.cabt.enums.Status;
import com.cabt.model.Scope;
import com.cabt.model.StatementDetails;
import com.cabt.model.StatementGroupNew;
import com.cabt.model.StatementGroupReq;
import com.cabt.model.Statements;
import com.cabt.model.StatementsList;
import com.cabt.repository.StatementGroupRepository;
import com.cabt.service.StatementGroupService;

@Service
public class StatementGroupServiceImpl implements StatementGroupService {

	@Autowired
	StatementGroupRepository statementGroupRepository;

	

	public StatementGroupNew saveStatementGroup(StatementGroupReq statementGroupReq) {
		// TODO Auto-generated method stub
		StatementGroup statementGroup = null;
		statementGroup = getStatementGroup(statementGroupReq);
		statementGroup = statementGroupRepository.save(statementGroup);
		return getStatementGroupNew(statementGroup, true);
	}

	public StatementDetails getStatementDetails(String statementGroupId) {
		StatementGroup statementGroup = null;
		statementGroup = statementGroupRepository.findById(statementGroupId).get();
		return getStatementDetails(statementGroup);
	}

	public StatementGroupNew updateStatementDetails(String statementGroupId, StatementDetails statementDetails) {
		StatementGroup updateStatementGroup = null;
		updateStatementGroup = getUpdatedStatementGroup(statementGroupId, statementDetails);
		updateStatementGroup = statementGroupRepository.save(updateStatementGroup);
		return getStatementGroupNew(updateStatementGroup, false);
	}

	public void deleteStatementDetails(String statementGroupId) {
		statementGroupRepository.deleteById(statementGroupId);
	}

	public StatementsList getStatementList(String scopeId, String displayableText, String retrievalType, Integer Offset,
			Integer limit) {		
		Page<StatementGroup> statementGroupList = null;				
		if(Objects.nonNull(scopeId)) {			
			statementGroupList = statementGroupRepository.findAllPageWithScopeIdByDisplay(displayableText,scopeId,PageRequest.of(Offset, limit));
		}else {
			statementGroupList = statementGroupRepository.findAllPageByDisplay(displayableText,PageRequest.of(Offset, limit));
		}
		return getStatementsList(statementGroupList,limit);
	}

	public StatementGroup getStatementGroup(StatementGroupReq statementGroupReq) {
		String uuid = UUID.randomUUID().toString();
		StatementGroup statementGroup = new StatementGroup();	
		//statementGroup.setStatementGroupId(statementGroupReq.getStatementGroupId());
		statementGroup.setScopeId(statementGroupReq.getScope().getId());
		statementGroup.setScopeName(statementGroupReq.getScope().getName());
		statementGroup.setStatementGroupAlias(statementGroupReq.getStatementGroupAlias());
		statementGroup.setStatementGroupDisplay(statementGroupReq.getStatementGroupDisplay());
		statementGroup.setStatementGroupSummary(statementGroupReq.getStatementGroupSummary());		
		statementGroup.setStatementType(StatementType.statementGroup);		
		statementGroup.setStatus(Status.Draft);
		statementGroup.setVersion("1");	
		statementGroup.setBaseVersion("1");
		statementGroup.setAuthor(uuid);
		statementGroup.setCreatedAt(getDateTime());
		statementGroup.setUpdatedAt(getDateTime());		
		statementGroup.setCreatedBy(uuid);
		statementGroup.setUpdatedBy(uuid);
		
		return statementGroup;
	}

	public StatementGroupNew getStatementGroupNew(StatementGroup statementGroup, boolean newCreated) {
		StatementGroupNew statementGroupNew = new StatementGroupNew();
		Scope scope = new Scope();
		if (Objects.nonNull(statementGroup)) {
			statementGroupNew.setStatementGroupId(statementGroup.getStatementGroupId());
			statementGroupNew.setStatementGroupDisplay(statementGroup.getStatementGroupDisplay());
			statementGroupNew.setStatementGroupSummary(statementGroup.getStatementGroupSummary());
			statementGroupNew.setVersion(statementGroup.getVersion());
			statementGroupNew.setScope(getScope(statementGroup.getScopeId(), statementGroup.getScopeName()));
			statementGroupNew.setAuthor(statementGroup.getAuthor());
			if (newCreated) {
				statementGroupNew.setCreatedAt(statementGroup.getCreatedAt());
				statementGroupNew.setCreatedBy(statementGroup.getCreatedBy());
			} else {
				statementGroupNew.setCreatedAt(statementGroup.getUpdatedAt());
				statementGroupNew.setCreatedBy(statementGroup.getUpdatedBy());
			}

		}

		return statementGroupNew;
	}

	public StatementDetails getStatementDetails(StatementGroup statementGroup) {
		StatementDetails statementDetails = new StatementDetails();

		if (Objects.nonNull(statementGroup)) {
			statementDetails.setStatementGroupId(statementGroup.getStatementGroupId());
			statementDetails.setScope(getScope(statementGroup.getScopeId(), statementGroup.getScopeName()));
			statementDetails.setStatementGroupAlias(statementGroup.getStatementGroupAlias());
			statementDetails.setStatementGroupSummary(statementGroup.getStatementGroupSummary());
			statementDetails.setStatementGroupDisplay(statementGroup.getStatementGroupDisplay());
			// statementDetails.setStatus(Status.Draft);
			statementDetails.setVersion(statementGroup.getVersion());
			statementDetails.setAuthor(statementGroup.getAuthor());
			statementDetails.setCreatedAt(statementGroup.getCreatedAt());
			statementDetails.setCreatedBy(statementGroup.getCreatedBy());
			statementDetails.setUpdatedAt(statementGroup.getUpdatedAt());
			statementDetails.setUpdatedBy(statementGroup.getUpdatedBy());
		}

		return statementDetails;
	}

	public StatementGroup getUpdatedStatementGroup(String statementGroupId, StatementDetails statementDetails) {
		StatementGroup statementGroup = null;
		statementGroup = statementGroupRepository.findById(statementGroupId).get();
		if (Objects.nonNull(statementGroup)) {
			statementGroup.setStatementGroupAlias(statementDetails.getStatementGroupAlias());
			statementGroup.setStatementGroupDisplay(statementDetails.getStatementGroupDisplay());
			if (Objects.nonNull(statementDetails.getScope())) {
				statementGroup.setScopeId(statementDetails.getScope().getId());
				statementGroup.setScopeName(statementDetails.getScope().getName());
			}
			statementGroup.setStatementGroupSummary(statementDetails.getStatementGroupSummary());
			if (statementDetails.getStatus().equals(Status.Draft)) {
				statementGroup.setStatus(Status.Draft);
			}
			statementGroup.setVersion(statementDetails.getVersion());
			statementGroup.setAuthor(statementDetails.getAuthor());
			statementGroup.setCreatedAt(statementDetails.getCreatedAt());
			statementGroup.setCreatedBy(statementDetails.getCreatedBy());
			statementGroup.setUpdatedAt(statementDetails.getUpdatedAt());
			statementGroup.setUpdatedBy(statementDetails.getUpdatedBy());
		}
		return statementGroup;
	}

	public Statements getStatements(StatementGroup statementGroup) {
		Statements statements = new Statements();
		statements.setStatementGroupId(statementGroup.getStatementGroupId());
		statements.setScope(getScope(statementGroup.getScopeId(), statementGroup.getScopeName()));
		statements.setStatementGroupSummary(statementGroup.getStatementGroupSummary());
		statements.setStatementGroupDisplay(statementGroup.getStatementGroupDisplay());
		return statements;
	}

	public Scope getScope(String scopeId, String scopeName) {
		Scope scope = new Scope();
		scope.setId(scopeId);
		scope.setName(scopeName);
		return scope;
	}

	public Date getDateTime() {
		long timeStamp = System.currentTimeMillis();
		Date date = new Date(timeStamp);
		return date;
	}
	
	private StatementsList getStatementsList(Page<StatementGroup> statementGroupList,Integer limit) {
		StatementsList statementsList = new StatementsList();
		List<Statements> listStatements = new ArrayList<>();
		int lastOffset,previousOffset,nextOffset =0;	
		statementGroupList.forEach(statementGroup -> listStatements.add(getStatements(statementGroup)));
		statementsList.setStatementList(listStatements);
		if(listStatements.size()>0) {
		statementsList.setTotalResults(BigDecimal.valueOf(statementGroupList.getTotalElements()));		
		lastOffset = (((statementGroupList.getTotalPages()-1)*limit)+1);
		previousOffset = (((statementGroupList.getNumber()-1)*limit)+1);
		nextOffset= (((statementGroupList.getNumber()+1)*limit)+1);
		if(nextOffset>lastOffset) {
			nextOffset = lastOffset;
		}
		if(previousOffset<0) {
			previousOffset=0;
		}
		statementsList.setFirstLink("/statement_groups?offset="+statementGroupList.getPageable().first().getOffset()+"&limit="+statementGroupList.getSize());
		statementsList.setLastLink("/statement_groups?offset="+lastOffset+"&limit="+statementGroupList.getSize());
		statementsList.setPrevLink("/statement_groups?offset="+previousOffset+"&limit="+statementGroupList.getPageable().previousOrFirst().getPageSize());
		statementsList.setNextLink("/statement_groups?offset="+nextOffset+"&limit="+statementGroupList.getPageable().next().getPageSize());
		}
		return statementsList;
	}
   
}
