package kr.top2blue.DI1.service;

import kr.top2blue.DI1.vo.Messaging;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Communication {
	private Messaging messaging;
	//커뮤니케이션은 메세징 있어야함
	
	public void communicate() {
		messaging.sendMessage();
	}
}
