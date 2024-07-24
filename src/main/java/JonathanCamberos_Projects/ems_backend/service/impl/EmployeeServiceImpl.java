package JonathanCamberos_Projects.ems_backend.service.impl;

import JonathanCamberos_Projects.ems_backend.dto.EmployeeDto;
import JonathanCamberos_Projects.ems_backend.exception.ResourceNotFoundException;
import JonathanCamberos_Projects.ems_backend.repository.EmployeeRepository;
import JonathanCamberos_Projects.ems_backend.entity.Employee;
import JonathanCamberos_Projects.ems_backend.mapper.EmployeeMapper;
import JonathanCamberos_Projects.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee does not exists with given id : " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
