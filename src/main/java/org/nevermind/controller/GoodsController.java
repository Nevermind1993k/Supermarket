package org.nevermind.controller;

import org.nevermind.entity.Goods;
import org.nevermind.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /*@GetMapping("/")
    public String index() {
        return "index";
    }*/

    @GetMapping("good/{id}")
    public String getGoodsById(@PathVariable("id") int id, Model model) {
        model.addAttribute("good", goodsService.getById(id));
        return "showGoods";
    }

    @GetMapping("/goods")
    public String getAllGoods(Model model) {
        model.addAttribute("goods", goodsService.getAll());
        return "goodsList";
    }

    @PostMapping("/newGoods")
    public String createGoods(@ModelAttribute Goods goods) {
        goodsService.save(goods);
        return "redirect:goods";
    }

}
