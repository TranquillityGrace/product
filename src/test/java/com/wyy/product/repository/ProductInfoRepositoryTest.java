package com.wyy.product.repository;

import com.wyy.product.ProductApplicationTests;
import com.wyy.product.dataobject.ProductInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductInfoRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test

    public void productTest(){
        List<ProductInfo> list =  productInfoRepository.findByProductStatus(new Integer(0));
        System.out.println("商品数量= " + list.size());
    }


}