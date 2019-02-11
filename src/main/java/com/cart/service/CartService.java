/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart.service;

import com.cart.object.Cart;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wendy
 */
public interface CartService {
    public void add(String name, int count);
    public void delete(String name);
    public Map<String,Integer> showAll();
    public List<Cart>getAll();
    public Cart findByName(String name);
}
