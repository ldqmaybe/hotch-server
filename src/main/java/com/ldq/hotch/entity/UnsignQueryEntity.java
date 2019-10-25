package com.ldq.hotch.entity;

/**
 * @author LinDingQiang
 * @time 2018/11/29 15:21
 * @email dingqiang.l@verifone.cn
 */
public class UnsignQueryEntity {
    private String SignatureMethod;
    private String MerchID;//商户
    private String TermID;//终端
    private String BatchNo;//	批次号
    private String TransNo;//	流水号
    private String RefNo;//	系统参考号
    private String AgreementCode;//	合同号
    private String ProjectCode;//项目号
    private String SonProjectCode;//子项目号
    private String Time;//交易时间
    private String Date;//交易日期
    private String RegionCode;//行政区划代码
    private String PayOrderNo;//支付订单号
    private String BillStatus;//缴费单状态
    private String QueAmount;//	查询金额
    private String PoundageAmount;//	手续费
    private String OtherFeeAmount;//其他金额
    private String LateFeeAmount;//滞纳金
    private String CurrencyCode;//	货币代码
    private String PayerName;//	缴款人姓名
    private String PayerAccNo;//	缴款人账号
    private String PayeeName;//	收款人名称
    private String PayeeAccNo;//	收款账号
    private String PayeeBankCode;//收款方行别代码
    private String PayeeUnitName;//收款单位名称
    private String PayeeUnitCode;//	收款单位代码
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

    public String getAgreementCode() {
        return AgreementCode;
    }

    public void setAgreementCode(String agreementCode) {
        AgreementCode = agreementCode;
    }

    public String getProjectCode() {
        return ProjectCode;
    }

    public void setProjectCode(String projectCode) {
        ProjectCode = projectCode;
    }

    public String getSonProjectCode() {
        return SonProjectCode;
    }

    public void setSonProjectCode(String sonProjectCode) {
        SonProjectCode = sonProjectCode;
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

    public String getRegionCode() {
        return RegionCode;
    }

    public void setRegionCode(String regionCode) {
        RegionCode = regionCode;
    }

    public String getPayOrderNo() {
        return PayOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        PayOrderNo = payOrderNo;
    }

    public String getBillStatus() {
        return BillStatus;
    }

    public void setBillStatus(String billStatus) {
        BillStatus = billStatus;
    }

    public String getQueAmount() {
        return QueAmount;
    }

    public void setQueAmount(String queAmount) {
        QueAmount = queAmount;
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

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getPayerName() {
        return PayerName;
    }

    public void setPayerName(String payerName) {
        PayerName = payerName;
    }

    public String getPayerAccNo() {
        return PayerAccNo;
    }

    public void setPayerAccNo(String payerAccNo) {
        PayerAccNo = payerAccNo;
    }

    public String getPayeeName() {
        return PayeeName;
    }

    public void setPayeeName(String payeeName) {
        PayeeName = payeeName;
    }

    public String getPayeeAccNo() {
        return PayeeAccNo;
    }

    public void setPayeeAccNo(String payeeAccNo) {
        PayeeAccNo = payeeAccNo;
    }

    public String getPayeeBankCode() {
        return PayeeBankCode;
    }

    public void setPayeeBankCode(String payeeBankCode) {
        PayeeBankCode = payeeBankCode;
    }

    public String getPayeeUnitName() {
        return PayeeUnitName;
    }

    public void setPayeeUnitName(String payeeUnitName) {
        PayeeUnitName = payeeUnitName;
    }

    public String getPayeeUnitCode() {
        return PayeeUnitCode;
    }

    public void setPayeeUnitCode(String payeeUnitCode) {
        PayeeUnitCode = payeeUnitCode;
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
