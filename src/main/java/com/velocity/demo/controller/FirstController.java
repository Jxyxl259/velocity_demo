package com.velocity.demo.controller;

import com.velocity.demo.controller.bean.ShoppingCart;
import com.velocity.demo.controller.bean.Sku;
import com.velocity.demo.controller.bean.SortedEntry;
import com.velocity.demo.controller.bean.Vendor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @description: 测试velocity控制器
 * @author: jiangxy
 * @create: 2019-02-12 10:40
 */
@Controller
@RequestMapping("/first/velocityTest")
public class FirstController {

    @RequestMapping({"/myVelocity" })
    public ModelAndView test(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("first_velocity");
        model.addObject("key", "我来了，velocity！");

        ShoppingCart cart = new ShoppingCart();
        Vendor vendors = new Vendor();
        SortedEntry sorted = new SortedEntry();
        Sku s = new Sku();
        s.setPrice(new BigDecimal(5));
        List<String> personalInfo = new ArrayList<>();
        personalInfo.add("A面刻字:aaaaaa");
        s.getAttributes().put("personal", personalInfo);
        sorted.setItem(s);
        List<SortedEntry> sortedEntries = new ArrayList<>();
        sortedEntries.add(sorted);
        vendors.setSorteds(sortedEntries);
        cart.setVendors(Collections.singletonList(vendors));

        model.addObject("cart", cart);

        return model;
    }

}
