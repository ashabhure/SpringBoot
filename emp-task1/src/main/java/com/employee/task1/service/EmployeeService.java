package com.employee.task1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.task1.dto.Employee;

@Service
public class EmployeeService {
	private List<Employee> empList=new ArrayList<Employee>();
    public void saveEmpInfo(Employee emp) {
    	empList.add(emp);
    }

public List<Employee> getEmployee(){
	return empList;	
}   //update emp info by new value using old value
public void updateEmployee(Employee emp) {
	Employee oldemp=getEmployeeById(emp.getId());
	oldemp.setId(emp.getId());
	oldemp.setName(emp.getName());
	oldemp.setSalary(emp.getSalary());
	oldemp.setCity(emp.getCity());
}
	
	//}       //for deleting empinfo by id
  public void deleteEmployee(int id) {
   Employee emp=getEmployeeById(id);
   empList.remove(emp);
}
	
		public Employee getEmployeeById(int id)
		{    Employee emp=null;
			for(Employee e:empList) {
				if(id==e.getId()) {
					emp =e;
					
				}
		}
			return emp;
	}
}




