package org.nevermind;


import org.nevermind.config.SpringConfig;
import org.nevermind.dao.GoodsDao;
import org.nevermind.dao.GoodsDaoImpl;
import org.nevermind.entity.Goods;
import org.nevermind.service.GoodsService;
import org.nevermind.service.GoodsServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        GoodsDao goodsDao = context.getBean(GoodsDaoImpl.class);
        GoodsService goodsService = new GoodsServiceImpl(goodsDao);

        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("Grisha123");
        goods.setPrice(123);
        goods.setMerchant("aagasgag123");

        Goods goods1 = new Goods();
        goods1.setName("Robert");
        goods1.setPrice(228.8);
        goods1.setMerchant("hahasaha");

        goodsService.update(goods);
    }
}
