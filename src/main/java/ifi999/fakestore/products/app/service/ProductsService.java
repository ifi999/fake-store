package ifi999.fakestore.products.app.service;

import ifi999.fakestore.products.api.dto.CreateProductsRequest;
import ifi999.fakestore.products.api.dto.DeleteProductsRequest;
import ifi999.fakestore.products.api.dto.ProductsDto;
import ifi999.fakestore.products.api.dto.UpdateProductsRequest;

import java.util.List;

public interface ProductsService {

    List<ProductsDto> getProducts();  // paging, sort 관련 파라미터 필요
    ProductsDto getProduct(Long id);
    ProductsDto createProduct(CreateProductsRequest dto);
    ProductsDto updateProduct(UpdateProductsRequest dto);
    ProductsDto deleteProduct(DeleteProductsRequest dto);


}
