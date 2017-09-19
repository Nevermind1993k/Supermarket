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
        /*List<Goods> goodsList = goodsDao.getAll();
        for (Goods allGoods : goodsList) {
            if (allGoods.getName().equals(goods.getName())) {
                System.out.println("Goods with the same name and price already exists");
            } else {
                System.out.println("Goods saved");
                goodsDao.save(goods);
            }
        }*/

        if ((goods.getPrice() > 0) && (goods.getName().length() <= 20) && (goods.getMerchant().length() <= 20)) {
            System.out.println("Goods saved.");
            goodsDao.save(goods);
        } else {
            System.out.println("Goods can't be saved. Because 1 or more condition doesn't satisfy ");
            System.out.println("Price must be more then 0. Name and Merchant must be no more than 20 symbols");
        }

    }


    @Override
    public Goods getById(int id) {
        return goodsDao.getGoodsById(id);
    }

    @Override
    public Goods getByName(String name) {
        return goodsDao.getGoodsByName(name);
    }

    @Override
    public Goods getByPrice(double price) {
        return goodsDao.getGoodsByPrice(price);
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
