package com.cabt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cabt.enums.StatementType;
import com.cabt.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "statementgroup")
public class StatementGroup {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String statementGroupId;

	@Column(name = "scopeId", nullable = false)
	private String scopeId;

	@Column(name = "scopeName", nullable = false)
	private String scopeName;

	@Column(name = "statementGroupAlias")
	private String statementGroupAlias;

	@Column(name = "statementGroupSummary", nullable = false)
	private String statementGroupSummary;

	@Column(name = "statementGroupDisplay", nullable = false)
	private String statementGroupDisplay;

	

	@Enumerated(EnumType.STRING)
	private StatementType statementType;

	@Enumerated(EnumType.STRING)
	private Status status;

	@Column(name = "version", nullable = false)
	private String version;
	
	@Column(name = "baseVersion", nullable = false)
	private String baseVersion;

	public String getBaseVersion() {
		return baseVersion;
	}

	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
	}

	@Column(name = "author", nullable = false)
	private String author;

	@Column(name = "createdAt", nullable = false)
	private Date createdAt;

	@Column(name = "createdBy", nullable = false)
	private String createdBy;

	@Column(name = "updatedAt")
	private Date updatedAt;

	@Column(name = "updatedBy")
	private String updatedBy;

	public String getStatementGroupId() {
		return statementGroupId;
	}

	public void setStatementGroupId(String statementGroupId) {
		this.statementGroupId = statementGroupId;
	}

	public String getScopeId() {
		return scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	public String getScopeName() {
		return scopeName;
	}

	public void setScopeName(String scopeName) {
		this.scopeName = scopeName;
	}

	public String getStatementGroupAlias() {
		return statementGroupAlias;
	}

	public void setStatementGroupAlias(String statementGroupAlias) {
		this.statementGroupAlias = statementGroupAlias;
	}

	public String getStatementGroupSummary() {
		return statementGroupSummary;
	}

	public void setStatementGroupSummary(String statementGroupSummary) {
		this.statementGroupSummary = statementGroupSummary;
	}

	public String getStatementGroupDisplay() {
		return statementGroupDisplay;
	}

	public void setStatementGroupDisplay(String statementGroupDisplay) {
		this.statementGroupDisplay = statementGroupDisplay;
	}

	
	public StatementType getStatementType() {
		return statementType;
	}

	public void setStatementType(StatementType statementType) {
		this.statementType = statementType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
