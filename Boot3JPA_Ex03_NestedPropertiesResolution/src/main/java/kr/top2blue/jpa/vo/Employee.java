package kr.top2blue.jpa.vo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne(cascade = CascadeType.ALL) // 다 대 1 연결
	private Dept dept;
	private int salary;

	public Employee(String name, Dept dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
}