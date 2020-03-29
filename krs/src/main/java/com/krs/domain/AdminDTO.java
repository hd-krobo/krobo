package com.krs.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AdminDTO {

	private Long admNo;
	private String admId;
	private String admPwd;
	private String admType;
	private String admName;
	private String admTel;
	private String admEmail;
	private String insBy;
	private LocalDateTime insTime;
	private String updBy;
	private LocalDateTime updTime;
	private String delYn;
	private String delBy;
	private LocalDateTime delTime;
	private LocalDateTime lastLoginTime;
	
}
