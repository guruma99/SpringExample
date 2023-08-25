package kr.human.boot.dao;

import org.springframework.data.repository.CrudRepository;
import kr.human.boot.vo.Student;

public interface StudentDAO extends CrudRepository<Student, Integer>{

}
