package ifi999.fakestore.cart.app.service;

import ifi999.fakestore.cart.api.dto.CartDto;
import ifi999.fakestore.cart.api.dto.CreateCartRequest;
import ifi999.fakestore.cart.api.dto.DeleteCartRequest;
import ifi999.fakestore.cart.api.dto.UpdateCartRequest;

import java.util.List;

public interface CartService {

    List<CartDto> getCarts(); // paging, sort 관련 파라미터 필요
    CartDto getCart(Long id);
    CartDto createCart(CreateCartRequest dto);
    CartDto updateCart(UpdateCartRequest dto);
    CartDto deleteCart(DeleteCartRequest dto);

}
