/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart.service.impl;

import com.cart.object.Cart;
import com.cart.service.CartService;
import java.util.ArrayList;
import java.util.HashMap;
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
        Cart cart = new Cart(name, count);
        boolean flagDuplicate = false;
        for(int i=0; i<listCart.size();i++){
            if(listCart.get(i).getName().equals(name)){
                cart.setCount(listCart.get(i).getCount()+count);
                listCart.set(i, cart);
                flagDuplicate = true;
            }
        }
        if(!flagDuplicate){
            listCart.add(cart);
        }
    }

    @Override
    public void delete(String name) {
        for(int i=0; i<listCart.size();i++){
            if(listCart.get(i).getName().equals(name)){
                listCart.remove(i);
            }
        }
    }

    @Override
    public Map<String, Integer> showAll() {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(Cart cart : listCart){
            result.put(cart.getName(), cart.getCount());
        }
        return result;
    }

    @Override
    public List<Cart> getAll() {
        return this.listCart;
    }

    @Override
    public Cart findByName(String name) {
        for(Cart cart : listCart){
            if(cart.getName().equals(name)){
                return cart;
            }
        }
        return null;
    }
    
}
