package kr.human.boot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.human.boot.dao.StudentDAO;
import kr.human.boot.vo.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDAO studentDAO;
	
	// 모두 얻기
	public List<Student> selectAll(){
		List<Student> list = new ArrayList<>();
		// studentDAO.findAll().forEach(list::add);
		Iterable<Student> it = studentDAO.findAll();
		Iterator<Student> it2 = it.iterator();
		while(it2.hasNext()) {
			list.add(it2.next());
		}
		return list;
	}
	
	// 1개 얻기
	public Optional<Student> selectByIdx(int idx){
		return studentDAO.findById(idx);
	}
	
	// 저장하기
	public Student insert(Student student) {
		return studentDAO.save(student);
	}
	// 수정하기
	public Student update(Student student) {
		Optional<Student> vo = studentDAO.findById(student.getIdx());
		if(!vo.isPresent()) {
			return null;
		}
		Student student2 = vo.get();
		student2.setFirstName(student.getFirstName());
		student2.setLastName(student.getLastName());
		student2.setSection(student.getSection());
		return studentDAO.save(student2);
	}
	// 삭제하기
	public Student delete(Student student) {
		Optional<Student> vo = studentDAO.findById(student.getIdx());
		if(!vo.isPresent()) {
			return null;
		}
		Student student2 = vo.get();
		studentDAO.delete(student2);
		return student2;
	}
}
