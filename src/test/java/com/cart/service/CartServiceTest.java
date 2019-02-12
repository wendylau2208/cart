/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cart.service;

import com.cart.object.Cart;
import com.cart.service.impl.CartServiceImpl;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wendy
 */
public class CartServiceTest {
    
    CartService service;
    
    @Before
    public void setUp() {
        service = new CartServiceImpl();
    }
    
    @After
    public void tearDown() {
        service = null;
    }
    
    public void generateData(){
        service.add("Topi Putih", 1);
        service.add("Kemeja Hitam", 1);
        service.add("Sepatu Merah", 1);
        service.add("Sepatu Merah", 1);
        service.add("Sepatu Merah", 1);
    }

    @Test
    public void whenAddNewCartSuccess_thenExpectationSatisfied() {
        generateData();
        
        Cart objSepatu = service.findByName("Sepatu Merah");
        Cart objTopi = service.findByName("Topi Putih");
        Cart objKemeja = service.findByName("Kemeja Hitam");
        
        assertEquals(1,objKemeja.getCount());
        assertEquals(1,objTopi.getCount());
        assertEquals(3,objSepatu.getCount());
    }
    
    @Test
    public void whenAddDeleteCartSuccess_thenExpectationSatisfied() {
        generateData();
        service.delete("Kemeja Hitam");
        
        Cart objKemeja = service.findByName("Kemeja Hitam");
        assertEquals(null,objKemeja);
    }
    
    @Test
    public void whenShowCartSuccess_thenExpectationSatisfied() {
        generateData();
        Map<String, Integer> datas = service.showAll();
        Map<String, Integer> template = new HashMap<>();
        template.put("Sepatu Merah", 3);
        template.put("Topi Putih", 1);
        template.put("Kemeja Hitam", 1);
        assertEquals(datas, template);
    }
}
