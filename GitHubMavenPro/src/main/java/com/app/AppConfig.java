package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="s1")
	public Student s()
	{
		Student st=new Student();
		st.setRollno(1);
		st.setName("bhagyashri");
		st.setAddress("pune");
		st.setMobile("7349865432");
		return st;
		
	}
}
