package com.cabt.model;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

public class StatementsList {

	private List<Statements> statementList;

	@JsonProperty("totalResults")
	private BigDecimal totalResults = null;

	@JsonProperty("firstLink")
	private String firstLink = null;

	@JsonProperty("lastLink")
	private String lastLink = null;

	@JsonProperty("prevLink")
	private String prevLink = null;

	@JsonProperty("nextLink")
	private String nextLink = null;

	/**
	 * Get totalResults
	 * 
	 * @return totalResults
	 **/
	@Schema(example = "200", description = "")

	@Valid
	public BigDecimal getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(BigDecimal totalResults) {
		this.totalResults = totalResults;
	}

	public StatementsList firstLink(String firstLink) {
		this.firstLink = firstLink;
		return this;
	}

	/**
	 * Get firstLink
	 * 
	 * @return firstLink
	 **/
	@Schema(example = "https://localhost:3000/statement_groups?offset=0&limit=20", description = "")

	public String getFirstLink() {
		return firstLink;
	}

	public void setFirstLink(String firstLink) {
		this.firstLink = firstLink;
	}

	public StatementsList lastLink(String lastLink) {
		this.lastLink = lastLink;
		return this;
	}

	/**
	 * Get lastLink
	 * 
	 * @return lastLink
	 **/
	@Schema(example = "https://localhost:3000/statement_groups?offset=41&limit=20", description = "")

	public String getLastLink() {
		return lastLink;
	}

	public void setLastLink(String lastLink) {
		this.lastLink = lastLink;
	}

	public StatementsList prevLink(String prevLink) {
		this.prevLink = prevLink;
		return this;
	}

	/**
	 * Get prevLink
	 * 
	 * @return prevLink
	 **/
	@Schema(example = "https://localhost:3000/statement_groups?offset=0&limit=20", description = "")

	public String getPrevLink() {
		return prevLink;
	}

	public void setPrevLink(String prevLink) {
		this.prevLink = prevLink;
	}

	public StatementsList nextLink(String nextLink) {
		this.nextLink = nextLink;
		return this;
	}

	/**
	 * Get nextLink
	 * 
	 * @return nextLink
	 **/
	@Schema(example = "https://localhost:3000/statement_groups?offset=181&limit=20", description = "")

	public String getNextLink() {
		return nextLink;
	}

	public void setNextLink(String nextLink) {
		this.nextLink = nextLink;
	}

	public List<Statements> getStatementList() {
		return statementList;
	}

	public void setStatementList(List<Statements> statementList) {
		this.statementList = statementList;
	}

}
