package com.cabt.model;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class OffsetLimitPageable implements Pageable{
	private int limit;	
	private int offset;
	private Sort sort;
	
	
	public OffsetLimitPageable(int limit,int offset) {
		this.limit=limit;
		this.offset=offset;
	}
	public OffsetLimitPageable(int limit,int offset,Sort sort) {
		this.limit=limit;
		this.offset=offset;
		this.sort=sort;
	}
	
	public int getLimit(){
		return limit;
	}	
	
	@Override
	public long getOffset() {
		// TODO Auto-generated method stub
		return offset;
	}
	

	@Override
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return limit;
	}

	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return sort;
	}

	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable withPage(int pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
