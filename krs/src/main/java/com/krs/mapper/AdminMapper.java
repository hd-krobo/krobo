package com.krs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.krs.domain.AdminDTO;

@Mapper
public interface AdminMapper {

	public int selectAdminTotalCount();
	
	public List<AdminDTO> selectAdminList();
	
	public AdminDTO selectAdminDetail(Long admNo);
	
	public int insertAdmin(AdminDTO params);
	
	public int updateAdmin(AdminDTO params);
	
	public int deleteAdmin(Long admNo);

}
