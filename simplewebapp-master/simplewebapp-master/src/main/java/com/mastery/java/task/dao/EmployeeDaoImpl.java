package com.mastery.java.task.dao;

import com.mastery.java.task.dto.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

    private SessionFactory sessionFactory;
    @Override
    public void addEmployee(Employee employee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(employee);
        logger.info("Book successfully saved. Book details: " + employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(employee);
        logger.info("Book successfully update. Book details: " + employee);
    }

    @Override
    public void removeEmployee(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Employee employee = (Employee) session.load(Employee.class, id);

        if(employee!=null){
            session.delete(employee);
        }
        logger.info("Book successfully removed. Book details: " + employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Session session =this.sessionFactory.getCurrentSession();
        Employee employee = (Employee) session.load(Employee.class, id);
        logger.info("Book successfully loaded. Book details: " + employee);

        return employee;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Employee> listEmployees() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Employee> employeeList = session.createQuery("from Employee").list();

        for(Employee employee: employeeList){
            logger.info("Book list: " + employee);
        }

        return employeeList;
    }
}
