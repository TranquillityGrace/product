package com.wyy.product.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 *
 * @Author WYY
 * @Date 2019-08-13 11:02
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String message;

    private T data;
}
