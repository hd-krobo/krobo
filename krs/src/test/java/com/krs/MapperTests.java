package com.krs;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import com.krs.domain.AdminDTO;
import com.krs.mapper.AdminMapper;

@SpringBootTest
public class MapperTests {

	@Autowired
	private AdminMapper adminMapper;
	
	/*@Test
	public void testInsertAdmin() {
		AdminDTO params = new AdminDTO();
		params.setAdmId("hgd02");
		params.setAdmPwd("1234");
		params.setAdmType("1");
		params.setAdmName("hdg2");
		params.setInsBy("hdpark");

		int result = adminMapper.insertAdmin(params);
		System.out.println("결과: " + result);
	}*/
	
	@Test
	public void testSelectAdminList() {
		int count = adminMapper.selectAdminTotalCount();
		if (count > 0) {
			List<AdminDTO> adminList = adminMapper.selectAdminList();
			if (CollectionUtils.isEmpty(adminList) == false) {
				for (AdminDTO admin : adminList) {
					System.out.println("=========================");
					System.out.println(admin.getAdmId());
					System.out.println(admin.getAdmName());
					System.out.println(admin.getAdmType());
					System.out.println("=========================");
				}
			}
		}
	}
	
}
