package com.wind.s08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//xml 대신에 사용, 스프링에서 얘를 가져다 써야하니 annotation으로 알려준다

@Configuration
public class ApplicationConfig {
		
		@Value("${admin.id}")
		private String adminId;
		
		@Value("${admin.pw}")
		private String adminPw;
		
		@Value("${subAdmin.id}")
		private String sub_adminId;
		
		@Value("${subAdmin.pw}")
		private String sub_adminPw;
		
		@Bean
		  public static PropertySourcesPlaceholderConfigurer properties() {
		    PropertySourcesPlaceholderConfigurer configurer = 
		      new PropertySourcesPlaceholderConfigurer(); 
		    Resource[] locations = new Resource[2];
		    locations[0] = new ClassPathResource("admin.properties");
		    locations[1] = new ClassPathResource("subAdmin.properties");
		    configurer.setLocations(locations);
		    return configurer; //spring에서 이걸 써서 프로퍼티들을 가져옴
		  }
		  
		  @Bean
		  public AdminConnection adminConfig() {
		    AdminConnection adminConnection = new AdminConnection(); 
		    adminConnection.setAdminId(adminId);
		    adminConnection.setAdminPw(adminPw);
		    adminConnection.setSub_adminId(sub_adminId);
		    adminConnection.setSub_adminPw(sub_adminPw);
		    return adminConnection;
		  }
}
