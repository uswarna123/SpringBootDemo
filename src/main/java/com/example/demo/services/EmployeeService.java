package com.example.demo.services;

import com.example.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    Employee employee=new Employee();
    List<Employee> list;
    public String displayEmployee(int employeeId)
    {
        setEmployeeList();
        System.out.println("List of employee : "+ list.size());
        Employee emp = getEmployeeById(list, employeeId);

           return "Found Employee "+emp;
    }

    public Employee getEmployeeById(List<Employee> list, int id) {

        for (Employee employee1 : list) {
            if (employee1.getEmployeeID() == id )  {
                return employee1;
            }
        }

        return new Employee();
    }


    public List<Employee> setEmployeeList() {

            list =new ArrayList<>();

        for (int i=1;i<4;i++)
        {
            Employee emp=new Employee();
            emp.setEmployeeID(i);
            emp.setEmployeeName("tom"+i);
            emp.setEmployeeAge(20+i);
            emp.setEmployeeAddress("Address"+i);
            list.add(emp);
        }
        return list;
    }

}
