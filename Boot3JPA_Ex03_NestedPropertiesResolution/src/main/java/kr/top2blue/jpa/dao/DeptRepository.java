package kr.top2blue.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import kr.top2blue.jpa.vo.Dept;

public interface DeptRepository extends CrudRepository<Dept, Integer> {
	Dept findByName(String name);
}