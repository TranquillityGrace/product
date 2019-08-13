package com.wyy.product.service.impl;

import com.wyy.product.dataobject.ProductInfo;
import com.wyy.product.enums.ProductInfoStatusEnum;
import com.wyy.product.repository.ProductInfoRepository;
import com.wyy.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品服务
 *
 * @Author WYY
 * @Date 2019-08-13 10:43
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;


    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductInfoStatusEnum.UP.getCode());
    }
}
