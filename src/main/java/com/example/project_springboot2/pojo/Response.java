package com.example.project_springboot2.pojo;

import lombok.Data;


/**
 * @author Zhuo
 */
@Data
public class Response<T> {

    private Integer code;

    private String message;

    private T data;

    /**
     * 成功
     */
    public static Response<String> success() {
        Response<String> result = new Response<>();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        return result;
    }

    /**
     * 成功，有返回数据
     */
    public static <V> Response<V> success(V data) {
        Response<V> result = new Response<>();
        result.code = ResultCode.SUCCESS.getCode();
        result.message = ResultCode.SUCCESS.getMessage();
        result.data = data;
        return result;
    }



    /**
     * 失败
     */
    public static<V> Response<V> failure(V data) {
        Response<V> result = new Response<>();
        result.setCode(ResultCode.FAILURE.getCode());
        result.setMessage(ResultCode.FAILURE.getMessage());
        return result;
    }

    /**
     * 失败，自定义失败信息
     */
    public static Response<String> failure(String message) {
        Response<String> result = new Response<>();
        result.setCode(ResultCode.FAILURE.getCode());
        result.setMessage(message);
        return result;
    }

    /**
     * 失败，使用已定义枚举
     */
    public static Response<String> failure(ResultCode resultCode) {
        Response<String> result = new Response<>();
        result.setCode(resultCode.getCode());
        result.setMessage(resultCode.getMessage());
        return result;
    }
}
