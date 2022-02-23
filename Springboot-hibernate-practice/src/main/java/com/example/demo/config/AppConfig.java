package com.example.demo.config;



import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	/*@Bean
	public SessionFactory sessionFactory(EntityManagerFactory emf) {
		return emf.unwrap(SessionFactory.class);
	}*/
	
	/*@Autowired
	private EntityManagerFactory entityManagerFactory;*/

	/*@Bean
	public SessionFactory getSessionFactory(EntityManagerFactory entityManagerFactory) {
	    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
	        throw new NullPointerException("factory is not a hibernate factory");
	    }
	    return entityManagerFactory.unwrap(SessionFactory.class);
	}*/
	
	/*@Bean
    public DataSource dataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setMaximumPoolSize(100);
        ds.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        ds.addDataSourceProperty("url", "jdbc:mysql://localhost:3306/test");
        ds.addDataSourceProperty("user", "root");
        ds.addDataSourceProperty("password", "password");
        ds.addDataSourceProperty("cachePrepStmts", true);
        ds.addDataSourceProperty("prepStmtCacheSize", 250);
        ds.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
        ds.addDataSourceProperty("useServerPrepStmts", true);
        return ds;
    }
	
	@Bean
	@ConfigurationProperties("spring.datasource")
	public HikariDataSource dataSource() {
		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}*/
	
	/*@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource() {
		
		 DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create(); 
		    dataSourceBuilder.username("");
		    dataSourceBuilder.password(""); 
		    return dataSourceBuilder.build(); 
		//return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "entityManagerFactory")
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		//emf.setJpaVendorAdapter(jpaVendorAdapter);
		emf.setPackagesToScan("com.example.demo");
		//emf.setPersistenceUnitName("default");
		emf.afterPropertiesSet();
		return emf.getObject();
	}*/
	
//	@Bean
//	public HibernateJpaSessionFactoryBean sessionFactory() {
//	    return new HibernateJpaSessionFactoryBean();
//	}

}
