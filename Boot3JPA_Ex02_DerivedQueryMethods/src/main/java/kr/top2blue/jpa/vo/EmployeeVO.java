package kr.top2blue.jpa.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeVO {
	private @Id @GeneratedValue Long id;
	private String name;
	private String dept;
	private int salary;
	
	public EmployeeVO(String name, String dept,int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
}
