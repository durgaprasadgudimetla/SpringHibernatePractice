/*package com.example.demo.utility;

import java.util.Properties;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Employee;

@Component
//@EnableTransactionManagement
public class HibernateUtil {

	@Value("${db.driver}")
	private String dbDriver;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String userName;
	@Value("${spring.datasource.password}")
	private String pwd;
	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String dailect;
	@Value("${spring.jpa.show-sql}")
	private String showSql;
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String hibernateDDL;
	@Value("${entitymanager.packagescan}")
	private String packageToScan;

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@PostConstruct
	public void setSessionFactory() {
		Configuration cfg = new Configuration();
		Properties prop = new Properties();
		prop.setProperty(Environment.DRIVER, dbDriver);
		prop.setProperty(Environment.URL, url);
		prop.setProperty(Environment.USER, userName);
		prop.setProperty(Environment.PASS, pwd);
		prop.setProperty(Environment.DIALECT, dailect);
		prop.setProperty(Environment.HBM2DDL_AUTO, hibernateDDL);
		prop.setProperty(Environment.HBM2DDL_AUTO, hibernateDDL);
		prop.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		cfg.setProperties(prop);
		cfg.addAnnotatedClass(Employee.class);
		ServiceRegistry serviceReg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sessionFactory = cfg.buildSessionFactory(serviceReg);
	}*/
	
	/*
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(DRIVER);
	        dataSource.setUrl(URL);
	        dataSource.setUsername(USERNAME);
	        dataSource.setPassword(PASSWORD);
	        return dataSource;
	    }

	    @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan(PACKAGES_TO_SCAN);
	        Properties hibernateProperties = new Properties();
	        hibernateProperties.put("hibernate.dialect", DIALECT);
	        hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
	        hibernateProperties.put("hibernate.hbm2ddl.auto", HBM2DDL_AUTO);
	        sessionFactory.setHibernateProperties(hibernateProperties);

	        return sessionFactory;
	    }

	    @Bean
	    public HibernateTransactionManager transactionManager() {
	        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	        transactionManager.setSessionFactory(sessionFactory().getObject());
	        return transactionManager;
	    }*/

//}
