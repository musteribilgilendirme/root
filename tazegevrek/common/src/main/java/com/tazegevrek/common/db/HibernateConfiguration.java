package org.tazegevrek.common.db;

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
	

	@Bean
	public AnnotationSessionFactoryBean sessionFactory() {
		Properties props = new Properties();
		props.put("hibernate.dialect", hibernateDialect);
		props.put("hibernate.format_sql", showSql);
		props.put("hibernate.show_sql", formatSql);
		
		AnnotationSessionFactoryBean bean = new AnnotationSessionFactoryBean();

		String[] packagesToScan = annotatedPackages.split(",");
		if(StringUtils.hasText(annotatedPackages)){
			bean.setPackagesToScan(packagesToScan);
		}
		
		//bean.setAnnotatedClasses(new Class[]{Product.class});
		
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
