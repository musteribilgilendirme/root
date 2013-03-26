package com.tazegevrek.common.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.util.StringUtils;



@Configuration
public class HibernateConfiguration {

	@Value("#{dataSource}")
	private DataSource dataSource;
	
	//org.hibernate.dialect.MySQLInnoDBDialect
	@Value("${hibernate.dialect}")
	private String hibernateDialect;
	
	@Value("${hibernate.show_sql}")
	private String showSql;
	
	@Value("${hibernate.format_sql}")
	private String  formatSql;
	
	@Value("${hibernate.annotated_packages}")
	private String annotatedPackages;
	
	@Value("${hibernate.schemaUpdate}")
	private boolean schemaUpdate;
	
	@Value("${hibernate.cache.use_second_level_cache}")
	private boolean secondLevelCache;
	
	@Value("${hibernate.cache.use_query_cache}")
	private boolean queryCache;
	
	@Value("${hibernate.cache.region.factory_class}")
	private String cacheFactoryClass;
	

	@Bean
	public AnnotationSessionFactoryBean sessionFactory() {
		Properties props = new Properties();
		props.put("hibernate.dialect", hibernateDialect);
		props.put("hibernate.format_sql", showSql);
		props.put("hibernate.show_sql", formatSql);
		props.put("hibernate.cache.use_second_level_cache",secondLevelCache);
		props.put("hibernate.cache.use_query_cache",queryCache);
		props.put("hibernate.cache.region.factory_class",cacheFactoryClass);
		
		AnnotationSessionFactoryBean bean = new AnnotationSessionFactoryBean();

		String[] packagesToScan = annotatedPackages.split(",");
		if(StringUtils.hasText(annotatedPackages)){
			bean.setPackagesToScan(packagesToScan);
		}
		
		/*
		try {
			bean.setAnnotatedClasses(new Class[]{Class.forName("com.tazegevrek.mubsis.domain.entity.Referans")});
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		bean.setHibernateProperties(props);
		bean.setDataSource(this.dataSource);
		bean.setSchemaUpdate(schemaUpdate);
		
		return bean;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		return new HibernateTransactionManager( sessionFactory().getObject() );
	}

}
