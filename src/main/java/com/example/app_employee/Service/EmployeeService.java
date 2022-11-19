package com.example.app_employee.Service;

import com.example.app_employee.exception.UserNotFoundExecption;
import com.example.app_employee.model.Employee;
import com.example.app_employee.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private IRepository iRepository;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return iRepository.save(employee);
    }

    public List<Employee> getListEmplyees(){
        return iRepository.findAll();
    }

    public Employee updatEmplye(Employee employee){
        return iRepository.save(employee);
    }

    public void deletEmplyee(Long id){
        iRepository.deleteById(id);

    }

    public Employee getEmplyeeById(Long id){
        return  iRepository.findEmplyeeById(id)
                .orElseThrow(() -> new UserNotFoundExecption("User id :"+id+"Nor found"));
    }
}
