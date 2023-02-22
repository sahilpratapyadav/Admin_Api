package in.ashokit.binding;

import java.util.Date;

import lombok.Data;
@Data
public class CreatPlan {
	
	private Integer planId;
	private Integer categoryId;
	private String planName;
	private Date planStartDate;
	private Date planEndDate;
	private char activeSw;

	private Date createDate;
	private Date updateDate;
	private String createBy;
	private String updateBy;
}
