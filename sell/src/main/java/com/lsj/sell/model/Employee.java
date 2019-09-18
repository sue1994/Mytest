package com.lsj.sell.model;

import lombok.Data;

import java.util.Date;

@Data
public class Employee{
	
	private static final long serialVersionUID = -9145259199031883863L;
	private Integer id;
	private String employeeName;
	private String englishName;
	private String idCard;
	private Date birthDate;
	private Integer sex;
	private String tel;
	private String officePhone;
	private String qq;
	private String wx;
	private String email;
	private String cardAuthority;
	private Date validStartTime;
	private Date validEndTime;
	private String cardAddr;
	private String nation;
	//private Dictionary politicalStatus;
	//private Dictionary maritalStatus;
	private String spouseName;
	private String spouseCard;
	private String nowAddress;
	private String contactName;
	private String contactPhone;
	private String bankAccount;
	private String personSpeciality;
	private String personProfile;
	private Integer attId;
	private Date createDate;
}
