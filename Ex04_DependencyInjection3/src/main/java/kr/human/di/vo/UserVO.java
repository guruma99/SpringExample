package kr.human.di.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 동일한 타입이 여러개 있는 경우
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserVO {
	private int id;
	private String name;
	private String email;
}
