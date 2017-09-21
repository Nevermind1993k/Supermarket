package org.nevermind.service;


import org.nevermind.entity.Goods;

import java.util.List;

public interface GoodsService {

    void save(Goods goods);

    Goods getById(int id);

    Goods getByName(String name);

    Goods getByPrice(double price);

    Goods getByMerchant(String merchant);

    int update(Goods newGoods);

    List<Goods> getAll();

    void delete(int id);

    void delete(String name);

    void delete(Goods goods);


}
