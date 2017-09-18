package org.nevermind.service;


import org.nevermind.dao.GoodsDao;
import org.nevermind.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {


    private final GoodsDao goodsDao;

    @Autowired
    public GoodsServiceImpl(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }


    @Override
    public void save(Goods goods) {
        /*for (Goods goods1 : goodsDao.getAll()) {
            if ((goods.getName().equals(goods1.getName())) && (goods.getPrice() == goods1.getPrice())) {
                System.out.println("This goods already int DB.");
                System.out.println("Update the name: ");
            } else {
                goodsDao.save(goods);
            }
        }*/
        goodsDao.save(goods);
    }

    @Override
    public Goods getById(int id) {
        return goodsDao.getGoodsById(id);
    }

    @Override
    public Goods getByName(String name) {
        if (name.length() <= 20) {
            return goodsDao.getGoodsByName(name);
        } else {
            System.out.println("Name must be no more than 20 symbols");
            return null;
        }
    }

    @Override
    public Goods getByPrice(double price) {
        if (price > 0) {
            return goodsDao.getGoodsByPrice(price);
        } else {
            System.out.println("Price must be more then 0");
            return null;
        }
    }

    @Override
    public Goods getByMerchant(String merchant) {
        if (merchant.length() <= 20) {
            return goodsDao.getGoodsByMerchant(merchant);
        } else {
            System.out.println("Merchant must be no more than 20 symbols");
            return null;
        }
    }

    @Override
    public int update(Goods newGoods) {
        return goodsDao.update(newGoods);
    }

    @Override
    public List<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public void delete(int id) {
        goodsDao.delete(id);
    }

    @Override
    public void delete(String name) {
        goodsDao.delete(name);
    }

}
