package org.nevermind.config;


import org.nevermind.dao.GoodsDao;
import org.nevermind.dao.GoodsDaoImpl;
import org.nevermind.dao.UserDao;
import org.nevermind.dao.UserDaoImpl;
import org.nevermind.entity.Goods;
import org.nevermind.service.GoodsService;
import org.nevermind.service.UserService;
import org.nevermind.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

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
        return new GoodsService() {
            @Override
            public void save(Goods goods) {

            }

            @Override
            public Goods getById(int id) {
                return null;
            }

            @Override
            public Goods getByName(String name) {
                return null;
            }

            @Override
            public Goods getByPrice(double price) {
                return null;
            }

            @Override
            public Goods getByMerchant(String merchant) {
                return null;
            }

            @Override
            public int update(Goods newGoods) {
                return 0;
            }

            @Override
            public List<Goods> getAll() {
                return null;
            }

            @Override
            public void delete(int id) {

            }

            @Override
            public void delete(String name) {

            }
        };
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
