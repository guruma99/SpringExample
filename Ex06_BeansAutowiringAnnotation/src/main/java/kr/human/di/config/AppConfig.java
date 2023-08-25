package kr.human.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 이 클래스는 환경설정 파일입니다.
@ComponentScan(basePackages = {"kr.human.di.vo"}) // 배열로 지정한 모든 패키지의 클래스를 찾아서 등록해라!!!
public class AppConfig {

}
