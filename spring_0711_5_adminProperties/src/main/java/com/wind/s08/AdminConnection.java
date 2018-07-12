package com.wind.s08;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
                                                                                   //처음 만들때,                                         ,환경변수
public class AdminConnection implements InitializingBean, DisposableBean, EnvironmentAware {
	
	//Environment 객체 사용하여 스프링 빈 생성.
	private Environment env;
	private String adminId;
	private String adminPw;
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment()");
		setEnv(environment);
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}

	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		
	}

}
