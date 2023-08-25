package kr.human.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정 파일들은 @Configuration으로 등록한다.
// @ComponentScan(basePackages = {"kr.human.app.dao","kr.human.app.service"})
@ComponentScan(basePackages = {"kr.human.app"})
public class AppConfig {

}
