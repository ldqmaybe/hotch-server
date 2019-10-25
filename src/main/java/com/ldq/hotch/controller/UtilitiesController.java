package com.ldq.hotch.controller;

import com.google.gson.Gson;
import com.ldq.hotch.entity.newrequest.NewRequest;
import com.ldq.hotch.entity.request.Request;
import com.ldq.hotch.utils.ResponseUtils;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 代缴费直连方式
 *
 * @author LinDingQiang
 * @time 2019/10/25 9:54
 * @email dingqiang.l@verifone.cn
 */
@RestController
public class UtilitiesController {

    /**
     * 查询
     *
     * @param jsonParam
     * @return
     */
    @RequestMapping(value = "/UnderQueryOrdr", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String underQueryOrdr(@RequestBody String jsonParam) {
        // 直接将json信息打印出来
        System.out.println("客户端【查询】请求数据：" + jsonParam);
        Gson gson = new Gson();
        String result;
        try {
            //存在ReqDetail
            NewRequest request1 = gson.fromJson(jsonParam, NewRequest.class);
            result = ResponseUtils.makeResponse(ResponseUtils.QUERY, request1);
            System.out.println("服务端【查询】响应数据，存在ReqDetail：" + result);
        } catch (Exception e) {
            //不存在ReqDetail
            Request request = gson.fromJson(jsonParam, Request.class);
            result = ResponseUtils.makeResponse(ResponseUtils.QUERY, request);
            System.out.println("服务端【查询】响应数据，不存在ReqDetail：" + result);
        }
        return result;
    }

    /**
     * 下单
     *
     * @param jsonParam
     * @return
     */
    @RequestMapping(value = "/Underorder", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String createQueryOrdr(@RequestBody String jsonParam) {
        System.out.println("客户端【下单】请求数据：" + jsonParam);
        Gson gson = new Gson();
        String result;
        try {
            //存在ReqDetail
            NewRequest request1 = gson.fromJson(jsonParam, NewRequest.class);
            result = ResponseUtils.makeResponse(ResponseUtils.CREATE, request1);
            System.out.println("服务端【下单】响应数据，存在ReqDetail：" + result);
        } catch (Exception e) {
            //不存在ReqDetail
            Request request = gson.fromJson(jsonParam, Request.class);
            result = ResponseUtils.makeResponse(ResponseUtils.CREATE, request);
            System.out.println("服务端【下单】响应数据，不存在ReqDetail：" + result);
        }
        return result;
    }

    /**
     * 通知
     *
     * @param jsonParam
     * @return
     */
    @RequestMapping(value = "/payInform", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String payInform(@RequestBody String jsonParam) {
        System.out.println("客户端【确认】请求数据：" + jsonParam);
        Gson gson = new Gson();
        String result;
        try {
            //存在ReqDetail
            NewRequest request1 = gson.fromJson(jsonParam, NewRequest.class);
            result = ResponseUtils.makeResponse(ResponseUtils.CONFIRM, request1);
            System.out.println("服务端【确认】响应数据，存在ReqDetail：" + result);
        } catch (Exception e) {
            //不存在ReqDetail
            Request request = gson.fromJson(jsonParam, Request.class);
            result = ResponseUtils.makeResponse(ResponseUtils.CONFIRM, request);
            System.out.println("服务端【确认】响应数据，不存在ReqDetail：" + result);
        }
        return result;
    }

}
