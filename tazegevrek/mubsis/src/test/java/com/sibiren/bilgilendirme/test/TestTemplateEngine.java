package com.sibiren.bilgilendirme.test;

import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:appcontext/product-test-config.xml"})
@Component
public class TestTemplateEngine {
	
	
}
