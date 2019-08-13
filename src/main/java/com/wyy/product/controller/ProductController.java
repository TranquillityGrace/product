package com.wyy.product.controller;

import com.wyy.product.dataobject.ProductInfo;
import com.wyy.product.service.ProductService;
import com.wyy.product.vo.ProductVo;
import com.wyy.product.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品服务
 *
 * @Author WYY
 * @Date 2019-08-13 9:35
 */
@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 获取商品服务
     */
    @GetMapping("/up")
    public ResultVo<ProductVo> findUpAllProduct(){
        List<ProductInfo> list = productService.findUpAll();
        log.info("获取在架商品信息结果= " + list.size());

        //构造数据
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMessage("success");
        resultVo.setData(list);
        return resultVo;
    }
}
