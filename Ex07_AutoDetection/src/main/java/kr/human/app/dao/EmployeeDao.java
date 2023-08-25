package kr.human.app.dao;

import kr.human.app.vo.EmployeeVO;

public interface EmployeeDao {
    void saveInDatabase(EmployeeVO employeeVO);
}