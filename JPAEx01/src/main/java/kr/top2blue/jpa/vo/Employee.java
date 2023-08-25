package kr.top2blue.jpa.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // 이 클래스를 엔티티 객체로 사용하겠다.
@Data //getter, setter 만들기
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id //자카르타? 버전 바뀐거?
	@GeneratedValue //자동으로 만들어진다. 퀵필드?
	private Long id;
	private String name;
	private String dept;
	
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
}
