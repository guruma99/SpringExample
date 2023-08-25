package kr.top2blue.jpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.top2blue.jpa.dao.EmployeeRepository;
import kr.top2blue.jpa.vo.EmployeeVO;
import lombok.extern.slf4j.Slf4j;

@Service("employeeService")
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<EmployeeVO> selectList() {
		log.info("서비스 selectList() 호출");
		List<EmployeeVO> list = new ArrayList<>();
		try {
			Iterable<EmployeeVO> it = repository.findAll();
			for (EmployeeVO vo : it)
				list.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("서비스 selectList() 리턴 : {}", list);
		return list;
	}

	@Override
	public EmployeeVO selectById(Long id) {
		log.info("서비스 selectById({}) 호출", id);
		EmployeeVO employeeVO = null;
		try { 
			//Optioanl: 클래스로 받으면 Null point exception 처리가 쉽게 가능하다. 
			//findById 마우스올려서 리턴타입확인
			Optional<EmployeeVO> optional = repository.findById(id);
//			optional.isEmpty(); // 비었는지 판단
//			optional.isPresent(); // 존재 여부를 판단
			if (optional.isPresent()) { // 있니? 물어보고
				employeeVO = optional.get(); //get 가져온다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("서비스 selectById({}) 리턴 : {}", id, employeeVO);
		return employeeVO;
	}

	@Override
	public EmployeeVO insert(EmployeeVO employeeVO) {
		log.info("서비스 insert({}) 호출 : {}", employeeVO);
		try {
			if (employeeVO != null) {
				repository.save(employeeVO);
				log.info("저장 성공 : {}", employeeVO);
			}
		} catch (Exception e) {
			log.info("저장 실패 : {}", employeeVO);
			e.printStackTrace();
		}
		log.info("서비스 insert({}) 리턴 : {}", employeeVO, employeeVO);
		return employeeVO;
	}

	@Override
	public EmployeeVO update(EmployeeVO employeeVO) {
		log.info("서비스 update({}) 호출 : {}", employeeVO);
		try {
			if (employeeVO != null) {
				// 수정처리는 해당 글번호의 글을 가져온 후 있을 경우 다시 저장을 한다.
				Optional<EmployeeVO> optional = repository.findById(employeeVO.getId());
				if (optional.isPresent()) {
					repository.save(employeeVO); // 다시 저장
					log.info("수정 성공 : {}", employeeVO);
				}
			}
		} catch (Exception e) {
			log.info("수정 실패 : {}", employeeVO);
			e.printStackTrace();
		}
		log.info("서비스 update({}) 리턴 : {}", employeeVO, employeeVO);
		return employeeVO;
	}

	@Override
	public EmployeeVO delete(long id) {
		log.info("서비스 delete({}) 호출 : {}", id, id);
				// 삭제처리는 해당글번호의 글을 가져온 후 있을 경우 삭제를 한다.
				// 1. 해당 글번호 가져오기
				Optional<EmployeeVO> optional = repository.findById(id);
				// 2. 존재확인
				if (optional.isPresent()) {
					// 3. 삭제
					repository.deleteById(optional.get().getId());
					log.info("{}번 삭제 성공!!", id);
				}
		return optional.isEmpty() ? null : optional.get();
	}

	@Override
	public List<EmployeeVO> findByDept(String deptName) {
		log.info("서비스 findByDept({}) 호출", deptName);
//		List<EmployeeVO> list = new ArrayList<>();
		List<EmployeeVO> list = null;
		try {
			//findByDept 커서올려 확인 ==> List 타입
			
			/*Iterable<EmployeeVO> it = repository.findByDept(deptName);
			for (EmployeeVO vo : it)
				list.add(vo);
			*/
			
			list = repository.findByDept(deptName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("서비스 findByDept({}) 리턴 : {}", deptName, list);
		return list;
	}

	@Override
	public List<EmployeeVO> findBySalaryGreaterThan(int salary) {
		log.info("서비스 findBySalaryGreaterThan({}) 호출", salary);
		List<EmployeeVO> list = new ArrayList<>();
		try {
			Iterable<EmployeeVO> it = repository.findBySalaryGreaterThan(salary);
			for (EmployeeVO vo : it)
				list.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("서비스 findBySalaryGreaterThan({}) 리턴 : {}", salary, list);
		return list;
	}

	@Override
	public List<EmployeeVO> findByDeptAndSalaryLessThan(String deptName, int salary) {
		log.info("서비스 findByDeptAndSalaryLessThan({}) 호출", deptName+", "+salary);
		List<EmployeeVO> list = new ArrayList<>();
		try {
			Iterable<EmployeeVO> it = repository.findByDeptAndSalaryLessThan(deptName, salary);
			for (EmployeeVO vo : it)
				list.add(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("서비스 findByDeptAndSalaryLessThan({}) 리턴 : {}", deptName+", "+salary, list);
		return list;
	}
}
