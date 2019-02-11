/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart.service.impl;

import com.cart.object.Cart;
import com.cart.service.CartService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wendy
 */
public class CartServiceImpl implements CartService{

    private List<Cart> listCart;
    
    public CartServiceImpl(){
        listCart = new ArrayList<>();
    }
    
    @Override
    public void add(String name, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Integer> showAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cart> getAll() {
        return this.listCart;
    }

    @Override
    public Cart findByName(String name) {
        Cart cart = null;
        
        return cart;
    }
    
}
