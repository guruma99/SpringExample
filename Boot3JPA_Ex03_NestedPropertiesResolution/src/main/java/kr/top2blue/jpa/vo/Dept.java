package kr.top2blue.jpa.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dept {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;

	public Dept(String name) {
		super();
		this.name = name;
	}
}