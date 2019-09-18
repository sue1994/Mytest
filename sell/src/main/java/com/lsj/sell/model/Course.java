package com.lsj.sell.model;

import java.util.Date;
import lombok.Data;

/**  
 * 班级表
 * @author  lisujing 
 * @version V1.0   
 * @Date    2018-5-6 上午9:06:16  
 */
@Data
public class Course {
	private Integer id;
	private String courseName;
	/*private Curriculum curriculumId;
	private Period periodId;
	private Campus campusId;
	private Classroom classroomId;*/
	private Employee worker;
	/**
	 * 班额
	 */
	private Integer courseNum;
	//private Dictionary courseStatus;
	private Integer showStatus;
	private Date beginDate;
	private Date endDate;
	private Integer teachType;//0每天1每周
	private String classtimeBegin;
	private String classtimeEnd;
	private String description;
	private Integer sortNo;
	private Date createDate;
	private Date modifyDate;
	private String courseCode;
	private Integer courseRealNum = 0;
	private String courseClassTime ;
	private String teacherNames ;
	private Integer ignoreLesson = 0;
	
}
