package org.nevermind.dao;

import org.nevermind.entity.Goods;
import org.nevermind.mappers.GoodsMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class GoodsDaoImpl implements GoodsDao {

    private JdbcTemplate jdbcTemplate;

    public GoodsDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void save(Goods goods) {
        String sql = "INSERT INTO goods (name, price, merchant) VALUES (?,?,?);";
        jdbcTemplate.update(sql, goods.getName(), goods.getPrice(), goods.getMerchant());
    }

    @Override
    public Goods getGoodsById(int id) {
        String sql = "SELECT * FROM goods WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new GoodsMapper(), id);
    }

    @Override
    public Goods getGoodsByName(String name) {
        String sql = "SELECT * FROM goods WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new GoodsMapper(), name);
    }

    @Override
    public Goods getGoodsByPrice(Double price) {
        String sql = "SELECT * FROM goods WHERE price = ?";
        return jdbcTemplate.queryForObject(sql, new GoodsMapper(), price);
    }

    @Override
    public Goods getGoodsByMerchant(String merchant) {
        String sql = "SELECT * FROM demo.goods WHERE price = ?";
        return jdbcTemplate.queryForObject(sql, new GoodsMapper(), merchant);
    }

    @Override
    public int update(Goods newGoods) {
        String sql = "UPDATE demo.goods SET name = ?, price = ?, merchant = ? WHERE id = ?";
        return jdbcTemplate.update(sql, newGoods.getName(), newGoods.getPrice(), newGoods.getMerchant(), newGoods.getId());
    }

    @Override
    public List<Goods> getAll() {
        String sql = "SELECT * FROM demo.goods";
        return jdbcTemplate.query(sql, new GoodsMapper());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM demo.goods WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void delete(String name) {
        String sql = "DELETE FROM demo.goods WHERE name = ?";
        jdbcTemplate.update(sql, name);
    }

    @Override
    public void delete(Goods goods) {
        String sql = "DELETE FROM goods WHERE id=?";
        jdbcTemplate.update(sql, goods.getId());
    }
}
