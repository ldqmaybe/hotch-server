package com.ldq.hotch.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ldq.hotch.utils.StringUtils;

/**
 * @author LinDingQiang
 * @time 2019/9/5 15:29
 * @email dingqiang.l@verifone.cn
 */
public class ResultEntity<T> {
    private int code;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    private ResultEntity() {
    }

    public static ResultEntity error(int code, String message) {
        ResultEntity resultBean = new ResultEntity();
        resultBean.setCode(code);
        resultBean.setMessage(message);
        return resultBean;
    }

    public static ResultEntity success() {
        return success("success", null);
    }

    public static <V> ResultEntity<V> success(String message) {
        return success(message, null);
    }
    public static <V> ResultEntity<V> success(V data) {
        return success(null, data);
    }
    public static <V> ResultEntity<V> success(String message, V data) {
        ResultEntity<V> resultBean = new ResultEntity<>();
        resultBean.setCode(0);

        if (StringUtils.isEmpty(message)) {
            message = "success";
        }

        resultBean.setMessage(message);
        if (data != null) {
            resultBean.setData(data);
        }
        return resultBean;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
