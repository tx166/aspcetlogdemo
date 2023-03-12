package com.demo.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author TangXin
 * @Date 2023-03-11 16:21
 * @Description
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BizResponse<T> implements Serializable {
    private static final long serialVersionUID = -2791031728952041674L;

    private String statusCode;
    private String statusText;
    private T data;



    /**
     * 构造01
     */
    public BizResponse(String statusCode, String statusText) {
        this.statusCode = statusCode;
        this.statusText = statusText;
        this.data = null;
    }

    /**
     * 构造02
     */
    public BizResponse(String statusCode, String statusText, T data) {
        this.statusCode = statusCode;
        this.statusText = statusText;
        this.data = data;
    }

    /**
     * 构造03
     */
    public BizResponse(BusinessCode businessCode) {
        this.statusCode = businessCode.getCode();
        this.statusText = businessCode.getDesc();
        this.data = null;
    }

    /**
     * 构造04
     */
    public BizResponse(BusinessCode businessCode, T data) {
        this.statusCode = businessCode.getCode();
        this.statusText = businessCode.getDesc();
        this.data = data;
    }

}
