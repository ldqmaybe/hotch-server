package com.ldq.hotch.utils;

import com.google.gson.Gson;
import com.ldq.hotch.entity.UnsignCreateEntity;
import com.ldq.hotch.entity.UnsignQueryEntity;
import com.ldq.hotch.entity.response.Response;

/**
 * @author LinDingQiang
 * @time 2019/3/18 10:58
 * @email dingqiang.l@verifone.cn
 */
public class TransformUtils {

    public static String getUnsignQueryData(Response response) {
        UnsignQueryEntity entity = new UnsignQueryEntity();
        entity.setSignatureMethod(response.getSignatureMethod());
        entity.setMerchID(response.getMerchID());
        entity.setTermID(response.getTermID());
        entity.setBatchNo(response.getBatchNo());
        entity.setTransNo(response.getTransNo());
        entity.setRefNo(response.getRefNo());
        entity.setAgreementCode(response.getAgreementCode());
        entity.setPayOrderNo(response.getPayOrderNo());
        entity.setProjectCode(response.getProjectCode());
        entity.setSonProjectCode(response.getSonProjectCode());
        entity.setTime(response.getTime());
        entity.setDate(response.getDate());
        entity.setRegionCode(response.getRegionCode());
        entity.setBillStatus(response.getBillStatus());
        entity.setQueAmount(response.getQueAmount());
        entity.setCurrencyCode(response.getCurrencyCode());
        entity.setPoundageAmount(response.getPoundageAmount());
        entity.setOtherFeeAmount(response.getOtherFeeAmount());
        entity.setLateFeeAmount(response.getLateFeeAmount());
        entity.setPayerName(response.getPayerName());
        entity.setPayerAccNo(response.getPayerAccNo());
        entity.setPayeeAccNo(response.getPayeeAccNo());
        entity.setPayeeName(response.getPayeeName());
        entity.setPayeeBankCode(response.getPayeeBankCode());
        entity.setPayeeUnitName(response.getPayeeUnitName());
        entity.setPayeeUnitCode(response.getPayeeUnitCode());
        entity.setExt(response.getExt());
        entity.setExt1(response.getExt1());
        entity.setExt2(response.getExt2());
        return new Gson().toJson(entity);
    }

    public static String getUnsignCreateData(Response response) {
        UnsignCreateEntity entity = new UnsignCreateEntity();
        entity.setSignatureMethod(response.getSignatureMethod());
        entity.setMerchID(response.getMerchID());
        entity.setTermID(response.getTermID());
        entity.setBatchNo(StringUtils.isEmpty(response.getBatchNo())?"":response.getBatchNo());
        entity.setTransNo(response.getTransNo());
        entity.setRefNo(response.getRefNo());
        entity.setTime(response.getTime());
        entity.setDate(response.getDate());
        entity.setOrderNo(response.getOrderNo());
        entity.setPayOrderNo(response.getPayOrderNo());
        entity.setOrderGenTm(response.getOrderGenTm());
        entity.setOrderOvTm(response.getOrderOvTm());
        entity.setURL(response.getURL());
        entity.setOrderStutas(response.getOrderStutas());
        entity.setAmount(response.getAmount());
        entity.setPoundageAmount(response.getPoundageAmount());
        entity.setOtherFeeAmount(response.getOtherFeeAmount());
        entity.setLateFeeAmount(response.getLateFeeAmount());
        entity.setExt(response.getExt());
        entity.setExt1(response.getExt1());
        entity.setExt2(response.getExt2());
        return new Gson().toJson(entity);
    }
}
