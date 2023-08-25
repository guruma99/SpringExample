package kr.top2blue.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import kr.top2blue.jpa.vo.Employee;


//내부적으로 테이블, 시퀀스 만들어진다. 어플리케이션.yml에 dd-auto 등등 속성들
//로그에 뜨는 메시지로 알 수 있음.
//Hibernate: drop table if exists employee cascade 
//Hibernate: drop sequence if exists employee_seq
//Hibernate: create sequence employee_seq start with 1 increment by 50


//db에 관계된 것은 레파지토리에 작성한다.
//jpa에서는 dao라고 안쓰고 repository라고 명칭한다.
//CrudRepository<인자 첫번째 엔티티자료형, 두번째 퀵필드 자료형>
//CrudRepository 있는 것들을 가져다 쓸수있다.
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}

