package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Payroll implements Iterable<Employee> {

   public List<Employee> employeeList = new ArrayList<Employee>();

    public  void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }

    }



