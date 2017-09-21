package org.nevermind.config;


import org.nevermind.dao.GoodsDao;
import org.nevermind.dao.GoodsDaoImpl;
import org.nevermind.dao.UserDao;
import org.nevermind.dao.UserDaoImpl;
import org.nevermind.service.GoodsService;
import org.nevermind.service.GoodsServiceImpl;
import org.nevermind.service.UserService;
import org.nevermind.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserDao getUserDaoIml() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return new UserDaoImpl(dataSource);
    }

    @Bean
    public GoodsService getGoodsService() {
        return new GoodsServiceImpl();
    }

    @Bean
    public GoodsDao getGoodsDaoImpl() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return new GoodsDaoImpl(dataSource);
    }

}
