package org.nevermind.dao;


import org.nevermind.entity.Goods;

import java.util.List;

public interface GoodsDao {

    void save(Goods goods);

    Goods getGoodsById(int id);

    Goods getGoodsByName(String name);

    Goods getGoodsByPrice(Double price);

    Goods getGoodsByMerchant(String merchant);

    int update(Goods newGoods);

    List<Goods> getAll();

    void delete(int id);

    void delete(String name);

    void delete(Goods goods);


}
