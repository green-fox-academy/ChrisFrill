package com.greenfoxacademy.webshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class WebshopController {
    List<ShopItem> shopItems = new ArrayList<>();

    public WebshopController() {
        ShopItem runningShoe = new ShopItem("Nike Unicorn", "Branded unicorn just for you!", 125000, 5);
        ShopItem runningShoe2 = new ShopItem("Pandacorn", "Panda vs unicorn.", 1555000, 0);
        ShopItem printer = new ShopItem("Corncorn", "Pop! Best for movies.", 50000, 2);
        ShopItem unicorn = new ShopItem("Unicorn", "Awesome.", 1000000000, 0);
        ShopItem magicunicorn = new ShopItem("Magic Unicorn", "Awesome magical creature.", 999999999, 10);
        shopItems.add(unicorn);
        shopItems.add(magicunicorn);
        shopItems.add(runningShoe);
        shopItems.add(runningShoe2);
        shopItems.add(printer);
    }

    @GetMapping("/webshop")
    public String getShopItems(ModelMap modelMap, @RequestParam(value = "username", required = false) String username) {
        modelMap.addAttribute("username", username);
        modelMap.addAttribute("shopItems", shopItems );
        return "webshop";
    }

    @GetMapping("/only-available")
    public String getOnlyAvailable(ModelMap modelMap) {
        modelMap.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getQuantity() > 0)
                .collect(Collectors.toList()));
        return "webshop";
    }

    @GetMapping("/cheapest-first")
    public String getCheapestFirst(ModelMap modelMap) {
        modelMap.addAttribute("shopItems", shopItems.stream()
                .sorted()
                .collect(Collectors.toList()));
        return "webshop";
    }

    @GetMapping("/contains-nike")
    public String getNikes(ModelMap modelMap) {
        modelMap.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getName().contains("Nike") || shopItem.getName().contains("nike") ||
                        shopItem.getDescription().contains("Nike") || shopItem.getDescription().contains("nike") )
                .collect(Collectors.toList()));
        return "webshop";
    }

    @GetMapping("/average-stock")
    public String getAverageStock(Model model) {
        double avg = (double) (shopItems.stream().mapToInt(shopItem -> (int)(shopItem.getQuantity())).sum()) / shopItems.size();
        model.addAttribute("stock", avg);
        return "stock";
    }

    @GetMapping("/most-expensive")
    public String getMostExpensive(Model model) {
        model.addAttribute("mostExpensive", shopItems.stream().max(Comparator.comparing(ShopItem::getPrice)).get().getName());
        return "stock";
    }

    @PostMapping("/search")
    public String search(@RequestParam String q, ModelMap modelMap) {
        modelMap.addAttribute("shopItems", shopItems.stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(q.toLowerCase())
                        || shopItem.getDescription().toLowerCase().contains(q.toLowerCase())).collect(Collectors.toList()));
        return "webshop";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam("username") String username) {
        return "redirect:/webshop?username=" + username ;
    }
}
