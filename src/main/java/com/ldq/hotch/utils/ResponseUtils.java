package com.ldq.hotch.utils;

import com.google.gson.Gson;
import com.ldq.hotch.entity.newrequest.NewRequest;
import com.ldq.hotch.entity.newrequest.NewResponse;
import com.ldq.hotch.entity.request.Request;
import com.ldq.hotch.entity.response.Response;

/**
 * @author LinDingQiang
 * @time 2019/9/12 16:57
 * @email dingqiang.l@verifone.cn
 */
public class ResponseUtils {
    public final static int QUERY = 1;
    public final static int CREATE = 2;
    public static final int CONFIRM = 3;

    public static String makeResponse(int transType, NewRequest request) {
        NewResponse response = new NewResponse();
        response.setMsgVer(request.getMsgVer());
        response.setSndDt(DateUtils.getCurrentTime("yyyyMMddhhmmssSSS"));
        response.setTrxtyp(request.getTrxtyp());
        response.setRspCode("00");
        response.setRspMsg("success");

        NewResponse.RespDtail respDtail = new NewResponse.RespDtail();
        NewRequest.ReqDetail reqDetail = request.getReqDetail();
        respDtail.setSignatureMethod(reqDetail.getSignatureMethod());
        respDtail.setMerchID(reqDetail.getMerchID());
        respDtail.setTermID(reqDetail.getTermID());
        respDtail.setBatchNo(StringUtils.isEmpty(reqDetail.getBatchNo()) ? "000001" : reqDetail.getBatchNo());
        respDtail.setTransNo(reqDetail.getTransNo());
        respDtail.setRefNo("907245441782");

        if (transType == QUERY) {
            response.setRespDtail(getReqQueryDetail(respDtail, request.getReqDetail()));
        } else if (transType == CREATE) {
            response.setRespDtail(getReqCreateDetail(respDtail, request.getReqDetail()));
        } else if (transType == CONFIRM) {
            response.setRespDtail(getReqConfirmDetail(respDtail, request.getReqDetail()));
        }
        Gson gson = new Gson();
        return gson.toJson(response);
    }

    private static NewResponse.RespDtail getReqConfirmDetail(NewResponse.RespDtail respDtail, NewRequest.ReqDetail reqDetail) {
        respDtail.setTime(DateUtils.getCurrentTime("hhmmss"));
        respDtail.setDate(DateUtils.getCurrentTime("MMdd"));
        respDtail.setOrigTransType(reqDetail.getOrigTransType());
        respDtail.setOrderNo(reqDetail.getOrderNo());
        respDtail.setPayOrderNo(reqDetail.getPayOrderNo());
        respDtail.setOrderStutas("2");
        respDtail.setAmount(reqDetail.getAmount());
        respDtail.setProjectName("我是 project name");
        respDtail.setProjectUserId("我是project userId");
        respDtail.setCurrencyCode("156");
        respDtail.setAgreementCode(reqDetail.getAgreementCode());
        respDtail.setProjectCode(reqDetail.getProjectCode());
        respDtail.setSonProjectCode(reqDetail.getSonProjectCode());
        respDtail.setExt("ext");
        respDtail.setExt1("ext1");
        respDtail.setExt2("ext2");
        respDtail.setSign("我是确认返回签名数据");
        return respDtail;
    }

    private static NewResponse.RespDtail getReqCreateDetail(NewResponse.RespDtail respDtail, NewRequest.ReqDetail reqDetail) {
        respDtail.setTime(DateUtils.getCurrentTime("yyyyMMddhhmmss"));
        respDtail.setDate(DateUtils.getCurrentTime("yyyy-MM-dd"));
        respDtail.setOrderNo((reqDetail.getMerchID() + DateUtils.getCurrentTime("yyyyMMdd") + (int) ((Math.random() * 9 + 1) * 1000000)));
        respDtail.setPayOrderNo((reqDetail.getMerchID() + DateUtils.getCurrentTime("yyyyMMdd") + (int) ((Math.random() * 9 + 1) * 1000000)));
        respDtail.setOrderGenTm(DateUtils.getCurrentTime("yyyyMMddHHmmss"));
        respDtail.setOrderOvTm(DateUtils.getCurrentTime("yyyyMMddHHmmss"));
        respDtail.setURL("http://sdfs.dmzgovpay.dev.jh/online/pay.html");
        respDtail.setOrderStutas("1");
        respDtail.setAmount("0.02");
        respDtail.setPoundageAmount("0.02");
        respDtail.setOtherFeeAmount("0.02");
        respDtail.setLateFeeAmount("0.02");
        respDtail.setLateFeeAmount("0.02");
        respDtail.setExt("ext");
        respDtail.setExt1("ext1");
        respDtail.setExt2("ext2");
        respDtail.setSign("我是生产订单返回签名数据");
        return respDtail;
    }

    private static NewResponse.RespDtail getReqQueryDetail(NewResponse.RespDtail respDtail, NewRequest.ReqDetail reqDetail) {
        respDtail.setAgreementCode(reqDetail.getAgreementCode());
        respDtail.setPayOrderNo((reqDetail.getMerchID() + DateUtils.getCurrentTime("yyyyMMdd") + (int) ((Math.random() * 9 + 1) * 1000000)));
        respDtail.setProjectCode(reqDetail.getProjectCode());
        respDtail.setSonProjectCode(reqDetail.getSonProjectCode());
        respDtail.setTime(DateUtils.getCurrentTime("yyyyMMddhhmmss"));
        respDtail.setDate(DateUtils.getCurrentTime("yyyy-MM-dd"));
        respDtail.setRegionCode("370300");
        respDtail.setBillStatus("0");
        respDtail.setQueAmount("0.01");
        respDtail.setCurrencyCode("156");
        respDtail.setPoundageAmount("0.01");
        respDtail.setOtherFeeAmount("0.01");
        respDtail.setLateFeeAmount("0.01");
        respDtail.setPayerName("我是PayerName");
        respDtail.setPayerAccNo("09876543");
        respDtail.setPayeeAccNo("12300009976744");
        respDtail.setPayeeName("我是PayeeName");
        respDtail.setPayeeBankCode("我是PayeeBankCode");
        respDtail.setPayeeUnitName("我是PayeeUnit");
        respDtail.setPayeeUnitCode("我是PayeeUnitCode 0001");
        respDtail.setExt("ext");
        respDtail.setExt1("ext1");
        respDtail.setExt2("ext2");
        respDtail.setSign(reqDetail.getSign());
//        respDtail.setSign("我是查询返回签名数据");
        return respDtail;
    }

    public static String makeResponse(int transType, Request request) {
        Response response = new Response();
        response.setMsgVer(request.getMsgVer());
        response.setSndDt(DateUtils.getCurrentTime("yyyyMMddhhmmssSSS"));
        response.setTrxtyp(request.getTrxtyp());
        response.setRspCode("00");
        response.setRspMsg("success");

        response.setSignatureMethod(request.getSignatureMethod());
        response.setMerchID(request.getMerchID());
        response.setTermID(request.getTermID());
        response.setBatchNo(request.getBatchNo());
        response.setTransNo(request.getTransNo());
        response.setRefNo("907245441782");

        if (transType == QUERY) {
            response = getRespQueryDetail(response, request);
        } else if (transType == CREATE) {
            response = getRespCreateDetail(response, request);
        } else if (transType == CONFIRM) {
            response = getRespConfirmDetail(response, request);
        }
        Gson gson = new Gson();
        return gson.toJson(response);
    }

    private static Response getRespConfirmDetail(Response response, Request request) {
        response.setTime(DateUtils.getCurrentTime("hhmmss"));
        response.setDate(DateUtils.getCurrentTime("MMdd"));
        response.setOrigTransType(request.getOrigTransType());
        response.setOrderNo(request.getOrderNo());
        response.setPayOrderNo(request.getPayOrderNo());
        response.setOrderStutas("2");
        response.setAmount(request.getAmount());
        response.setProjectName("我是 project name");
        response.setProjectUserId("我是project userId");
        response.setCurrencyCode("156");
        response.setAgreementCode(request.getAgreementCode());
        response.setProjectCode(request.getProjectCode());
        response.setSonProjectCode(request.getSonProjectCode());
        response.setExt("ext");
        response.setExt1("ext1");
        response.setExt2("ext2");
        response.setSign("我是确认返回签名数据");
        return response;
    }

    private static Response getRespCreateDetail(Response response, Request request) {
        response.setTime(DateUtils.getCurrentTime("yyyyMMddhhmmss"));
        response.setDate(DateUtils.getCurrentTime("yyyy-MM-dd"));
        response.setOrderNo((request.getMerchID() + DateUtils.getCurrentTime("yyyyMMdd") + (int) ((Math.random() * 9 + 1) * 1000000)));
        response.setPayOrderNo((request.getMerchID() + DateUtils.getCurrentTime("yyyyMMdd") + (int) ((Math.random() * 9 + 1) * 1000000)));
        response.setOrderGenTm(DateUtils.getCurrentTime("yyyyMMddHHmmss"));
        response.setOrderOvTm(DateUtils.getCurrentTime("yyyyMMddHHmmss"));
        response.setURL("http://sdfs.dmzgovpay.dev.jh/online/pay.html");
        response.setOrderStutas("1");
        response.setAmount("0.02");
        response.setPoundageAmount("0.02");
        response.setOtherFeeAmount("0.02");
        response.setLateFeeAmount("0.02");
        response.setLateFeeAmount("0.02");
        response.setExt("ext");
        response.setExt1("ext1");
        response.setExt2("ext2");
        String sign = SignUtil.sign(TransformUtils.getUnsignCreateData(response),"SHA256withRSA",null);
        response.setSign(sign);
//        response.setSign("我是生产订单返回签名数据");
        return response;
    }

    private static Response getRespQueryDetail(Response response, Request request) {
        response.setAgreementCode(request.getAgreementCode());
        response.setPayOrderNo((StringUtils.null2String(request.getMerchID()) + DateUtils.getCurrentTime("yyyyMMdd") + (int) ((Math.random() * 9 + 1) * 1000000)));
        response.setProjectCode(request.getProjectCode());
        response.setSonProjectCode(request.getSonProjectCode());
        response.setTime(DateUtils.getCurrentTime("yyyyMMddhhmmss"));
        response.setDate(DateUtils.getCurrentTime("yyyy-MM-dd"));
        response.setRegionCode("370300");
        response.setBillStatus("0");
        response.setQueAmount("0.01");
        response.setCurrencyCode("156");
        response.setPoundageAmount("0.01");
        response.setOtherFeeAmount("0.01");
        response.setLateFeeAmount("0.01");
        response.setPayerName("我是PayerName");
        response.setPayerAccNo("09876543");
        response.setPayeeAccNo("12300009976744");
        response.setPayeeName("我是PayeeName");
        response.setPayeeBankCode("我是PayeeBankCode");
        response.setPayeeUnitName("我是PayeeUnit");
        response.setPayeeUnitCode("我是PayeeUnitCode 0001");
        response.setExt("ext");
        response.setExt1("ext1");
        response.setExt2("ext2");
        String sign = SignUtil.sign(TransformUtils.getUnsignQueryData(response),"SHA256withRSA",null);
        response.setSign(sign);
//        response.setSign("我是查询返回签名数据");
        return response;
    }
}
