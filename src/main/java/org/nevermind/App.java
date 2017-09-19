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
        goods.setName("Grisha");
        goods.setPrice(322.2);
        goods.setMerchant("aagasgag");

        Goods goods1 = new Goods();
        goods1.setName("Vasian");
        goods1.setPrice(0);
        goods1.setMerchant("zzzzzz");

        goodsService.save(goods);

    }
}
