package com.krs.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krs.domain.AdminDTO;
import com.krs.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public List<AdminDTO> getAdminList() {
		List<AdminDTO> adminList = Collections.emptyList();
		
		int adminTotalCount = adminMapper.selectAdminTotalCount();
		
		if (adminTotalCount > 0) {
			adminList = adminMapper.selectAdminList();
		}
		
		return adminList;
	}

	
	
}
