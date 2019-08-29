package com.devd.spring.bookstoreorderservice.service;

import com.devd.spring.bookstoreorderservice.model.Cart;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-06-17
 */
public interface CartService {

    Cart getCartByCartId(String cartId);

    String createCart();

    Cart getCartByUserName(String userName);

}