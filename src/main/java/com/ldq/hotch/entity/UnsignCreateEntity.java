package com.ldq.hotch.entity;

/**
 * @author LinDingQiang
 * @time 2018/11/29 15:21
 * @email dingqiang.l@verifone.cn
 */
public class UnsignCreateEntity {
    private String SignatureMethod;
    private String MerchID;//商户
    private String TermID;//终端
    private String BatchNo;//	批次号
    private String TransNo;//	流水号
    private String RefNo;//	系统参考号
    private String Time;//交易时间
    private String Date;//交易日期
    private String OrderNo;//商品订单号
    private String PayOrderNo;//支付订单号
    private String OrderGenTm;//订单生成时间
    private String OrderOvTm;//订单超时时间
    private String URL;//
    private String OrderStutas;//
    private String Amount;//
    private String PoundageAmount;//	手续费
    private String OtherFeeAmount;//其他金额
    private String LateFeeAmount;//滞纳金
    private String ext;//扩展字段
    private String ext1;//	扩展字段1
    private String ext2;//扩展字段2

    public String getSignatureMethod() {
        return SignatureMethod;
    }

    public void setSignatureMethod(String signatureMethod) {
        SignatureMethod = signatureMethod;
    }

    public String getMerchID() {
        return MerchID;
    }

    public void setMerchID(String merchID) {
        MerchID = merchID;
    }

    public String getTermID() {
        return TermID;
    }

    public void setTermID(String termID) {
        TermID = termID;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String batchNo) {
        BatchNo = batchNo;
    }

    public String getTransNo() {
        return TransNo;
    }

    public void setTransNo(String transNo) {
        TransNo = transNo;
    }

    public String getRefNo() {
        return RefNo;
    }

    public void setRefNo(String refNo) {
        RefNo = refNo;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getPayOrderNo() {
        return PayOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        PayOrderNo = payOrderNo;
    }

    public String getOrderGenTm() {
        return OrderGenTm;
    }

    public void setOrderGenTm(String orderGenTm) {
        OrderGenTm = orderGenTm;
    }

    public String getOrderOvTm() {
        return OrderOvTm;
    }

    public void setOrderOvTm(String orderOvTm) {
        OrderOvTm = orderOvTm;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getOrderStutas() {
        return OrderStutas;
    }

    public void setOrderStutas(String orderStutas) {
        OrderStutas = orderStutas;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getPoundageAmount() {
        return PoundageAmount;
    }

    public void setPoundageAmount(String poundageAmount) {
        PoundageAmount = poundageAmount;
    }

    public String getOtherFeeAmount() {
        return OtherFeeAmount;
    }

    public void setOtherFeeAmount(String otherFeeAmount) {
        OtherFeeAmount = otherFeeAmount;
    }

    public String getLateFeeAmount() {
        return LateFeeAmount;
    }

    public void setLateFeeAmount(String lateFeeAmount) {
        LateFeeAmount = lateFeeAmount;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }
}
