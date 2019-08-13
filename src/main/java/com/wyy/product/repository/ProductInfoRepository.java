package com.wyy.product.repository;

import com.wyy.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 获取商品信息接口
 *
 * @Author WYY
 * @Date 2019-08-13 10:09
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

}
