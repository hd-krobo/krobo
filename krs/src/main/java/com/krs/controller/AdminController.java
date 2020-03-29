package com.krs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.krs.domain.AdminDTO;
import com.krs.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping(value = "/admin/list")
	public String openAdminList(Model model) {
		List<AdminDTO> adminList = adminService.getAdminList();
		model.addAttribute("adminList", adminList);
		
		return "admin/list";
	}
	
}
