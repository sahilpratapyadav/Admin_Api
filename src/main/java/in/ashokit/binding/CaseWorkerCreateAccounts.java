package in.ashokit.binding;

import java.util.Date;

import lombok.Data;
@Data
public class CaseWorkerCreateAccounts {
	
private Integer accId;

	
	private Integer categoryId;
	
	private String fullName;
	
	private String email;
	
	private Integer mobileNum;
	
	private char gender;
	
	private Date dob;
	
	private Integer ssn;
	
	private char activeSw;
	
	private Date createDate;
	
	private Date updateDate;
	
	private String createBy;
	
	private String updateBy;
	

}
