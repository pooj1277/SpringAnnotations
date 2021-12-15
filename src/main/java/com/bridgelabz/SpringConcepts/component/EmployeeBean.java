package com.bridgelabz.SpringConcepts.component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework. stereotype.Component;
@Component
public class EmployeeBean{
	private int Eid;
	private String Ename;

	@Autowired
	private DepartmentBean deptBean;
	public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

	public EmployeeBean() {}


	@Autowired
	public EmployeeBean(DepartmentBean deptBean) {
		logger.trace("*** Autowiring by using @Autowire annotation on constructor ***"); 
		this.deptBean = deptBean;
	}

	public int getEid() {
		return Eid;
	}
	public void setEid(int Eid) {
		this.Eid = Eid;		
	}
	
	public String getEname() {
		return Ename;
	}
	public void setEname(String Ename) {
		this.Ename = Ename;
	}	
	public DepartmentBean getdeptBean() {
		return deptBean;
	}
	public void setDeptBean(DepartmentBean deptBean) {
		logger.trace("*** Autowiring by using @Autowire annotation on Setter **");
		this.deptBean = deptBean;
	}
	
	public void showEmployeeDetails(){
		logger.debug("Employee Id: {}", Eid);
		logger.debug("Employee Name : {}", Ename);
		deptBean.setDeptName("Information Technology");
		logger.debug("Department: {}", deptBean.getDeptName());
	}


	
}
