package br.com.dbccompany.app.config;

import java.util.Properties;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"br.com.dbccompany.services", "br.com.dbccompany.dao"})
@EnableTransactionManagement
public class DataBaseConfig {
	
	@Bean
	 public DriverManagerDataSource getDataSource() {
	       DriverManagerDataSource dataSource = new DriverManagerDataSource();
	          dataSource.setDriverClassName("org.h2.Driver");
	          dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
	          dataSource.setUsername("sa");
	          dataSource.setPassword("");
	      return dataSource;
	 }
	 @Bean
	 @Autowired
	 public PlatformTransactionManager getTransactionManager(EntityManagerFactory emf) throws NamingException{
	      JpaTransactionManager jpaTransaction = new JpaTransactionManager();
	      jpaTransaction.setEntityManagerFactory(emf);
	      return jpaTransaction;
	 }
	@Bean
	 public LocalContainerEntityManagerFactoryBean getEMF() {
	 
	     LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
	     emf.setDataSource(getDataSource());
	     emf.setPersistenceUnitName("spring-jpa-unit");
	     emf.setJpaVendorAdapter(getHibernateAdapter());
	         Properties jpaProperties = new Properties();
	        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect;AUTO_SERVER=TRUE");
	        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
	        jpaProperties.put("hibernate.show_sql", "true");
	        jpaProperties.put("hibernate.format_sql","true");
	      emf.setJpaProperties(jpaProperties);
	   return emf;
	 }
	  @Bean
	  public JpaVendorAdapter getHibernateAdapter() {
	      return new HibernateJpaVendorAdapter();
	  }

}
