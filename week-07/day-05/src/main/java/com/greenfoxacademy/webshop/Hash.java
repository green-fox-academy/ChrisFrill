package com.greenfoxacademy.webshop;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        double price = 0;
        HashMap<Integer, Integer> booksToBuy = new HashMap<>();
        booksToBuy.put(0, 1);
        booksToBuy.put(1, 1);

        do {
            for (Map.Entry<Integer, Integer> entry : booksToBuy.entrySet()) {
                if (entry.getValue() > 0) {
                    if (entry.getKey() > 5 || entry.getKey() < 1) {
                        price += 8 * entry.getValue();
                        entry.setValue(0);
                    } else {
                        price += 8;
                        entry.setValue(0);
                    }
                }
            }


        } while (booksToBuy.values().stream().mapToInt(Integer::intValue).sum() > 0);
        System.out.println(price);
    }
}
