package com.tazegevrek.mubsis.test;

import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:appcontext/mubsis-test-config.xml"})
@Component
public class TestCustomer extends AbstractTest{

	public void add(){
		
	}
	
	public void remove(){
		
	}
	
	public void find(){
		
		
	}
	
	
}
