package com.ldq.hotch.entity.newrequest;

/**
 * @author LinDingQiang
 * @time 2019/9/12 16:25
 * @email dingqiang.l@verifone.cn
 */
public class NewRequest {
    private String MsgVer;//报文版本
    private String SndDt;//报文发起日期时间
    private String Trxtyp;//交易类型
    private DeviceInfo DeviceInfo;//设备信息
    private ReqDetail ReqDetail;//请求参数

    public String getMsgVer() {
        return MsgVer;
    }

    public void setMsgVer(String msgVer) {
        MsgVer = msgVer;
    }

    public String getSndDt() {
        return SndDt;
    }

    public void setSndDt(String sndDt) {
        SndDt = sndDt;
    }

    public String getTrxtyp() {
        return Trxtyp;
    }

    public void setTrxtyp(String trxtyp) {
        Trxtyp = trxtyp;
    }

    public NewRequest.DeviceInfo getDeviceInfo() {
        return DeviceInfo;
    }

    public void setDeviceInfo(NewRequest.DeviceInfo deviceInfo) {
        DeviceInfo = deviceInfo;
    }

    public NewRequest.ReqDetail getReqDetail() {
        return ReqDetail;
    }

    public void setReqDetail(NewRequest.ReqDetail reqDetail) {
        ReqDetail = reqDetail;
    }

    public static class DeviceInfo {
        private String FirmCode;
        private String ProdCode;
        private String DeviceType;
        private String TUSN;

        public String getFirmCode() {
            return FirmCode;
        }

        public void setFirmCode(String firmCode) {
            FirmCode = firmCode;
        }

        public String getProdCode() {
            return ProdCode;
        }

        public void setProdCode(String prodCode) {
            ProdCode = prodCode;
        }

        public String getDeviceType() {
            return DeviceType;
        }

        public void setDeviceType(String deviceType) {
            DeviceType = deviceType;
        }

        public String getTUSN() {
            return TUSN;
        }

        public void setTUSN(String TUSN) {
            this.TUSN = TUSN;
        }
    }

    public static class ReqDetail {
        private String VerNO;
        private String SignatureMethod;
        private String Time;
        private String TransNo;
        private String AgreementCode;
        private String ProjectCode;
        private String SonProjectCode;
        private String VerifyCode;
        private String OnLnOrOflnCd;
        private String RegionCode;
        private String MerchID;
        private String TermID;
        private String BatchNo;
        private String RefNo;
        private String ext;
        private String ext1;
        private String ext2;
        private String Sign;
        private String Date;
        private String PayerName;//	缴款人姓名
        private String PayerAccNo;//缴款人账号
        private String OrderNo;//商品订单号
        private String PaymentChannelCode;//支付渠道代码
        private String OprNo;//操作员号
        private String UserID;//用户ID
        private String URL;//页面返回URL地址
        private String CurrencyCode;//货币代码
        private String Amount;//	缴费金额
        private String PoundageAmount;//手续费
        private String OtherFeeAmount;//其他金额
        private String LateFeeAmount;//滞纳金
        private String PayeeAccNo;//收款账号
        private String PayeeName;//收款人名称
        private String PayeeBankCode;//	收款方行别代码
        private String PayeeUnitName;//	收款单位名称
        private String PayeeUnitCode;//收款单位代码
        private String PayOrderNo;//	支付订单号
        private String PayMethodCd;//支付方式代码
        private String PayStatus;//支付状态代码
        private String BankOrVirtualNo;//付款账号
        private String OrigTransType;//	原缴费类别

        public String getVerNO() {
            return VerNO;
        }

        public void setVerNO(String verNO) {
            VerNO = verNO;
        }

        public String getSignatureMethod() {
            return SignatureMethod;
        }

        public void setSignatureMethod(String signatureMethod) {
            SignatureMethod = signatureMethod;
        }

        public String getTime() {
            return Time;
        }

        public void setTime(String time) {
            Time = time;
        }

        public String getTransNo() {
            return TransNo;
        }

        public void setTransNo(String transNo) {
            TransNo = transNo;
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

        public String getVerifyCode() {
            return VerifyCode;
        }

        public void setVerifyCode(String verifyCode) {
            VerifyCode = verifyCode;
        }

        public String getOnLnOrOflnCd() {
            return OnLnOrOflnCd;
        }

        public void setOnLnOrOflnCd(String onLnOrOflnCd) {
            OnLnOrOflnCd = onLnOrOflnCd;
        }

        public String getRegionCode() {
            return RegionCode;
        }

        public void setRegionCode(String regionCode) {
            RegionCode = regionCode;
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

        public String getRefNo() {
            return RefNo;
        }

        public void setRefNo(String refNo) {
            RefNo = refNo;
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

        public String getSign() {
            return Sign;
        }

        public void setSign(String sign) {
            Sign = sign;
        }

        public String getDate() {
            return Date;
        }

        public void setDate(String date) {
            Date = date;
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

        public String getOrderNo() {
            return OrderNo;
        }

        public void setOrderNo(String orderNo) {
            OrderNo = orderNo;
        }

        public String getPaymentChannelCode() {
            return PaymentChannelCode;
        }

        public void setPaymentChannelCode(String paymentChannelCode) {
            PaymentChannelCode = paymentChannelCode;
        }

        public String getOprNo() {
            return OprNo;
        }

        public void setOprNo(String oprNo) {
            OprNo = oprNo;
        }

        public String getUserID() {
            return UserID;
        }

        public void setUserID(String userID) {
            UserID = userID;
        }

        public String getURL() {
            return URL;
        }

        public void setURL(String URL) {
            this.URL = URL;
        }

        public String getCurrencyCode() {
            return CurrencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            CurrencyCode = currencyCode;
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

        public String getPayeeAccNo() {
            return PayeeAccNo;
        }

        public void setPayeeAccNo(String payeeAccNo) {
            PayeeAccNo = payeeAccNo;
        }

        public String getPayeeName() {
            return PayeeName;
        }

        public void setPayeeName(String payeeName) {
            PayeeName = payeeName;
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

        public String getPayOrderNo() {
            return PayOrderNo;
        }

        public void setPayOrderNo(String payOrderNo) {
            PayOrderNo = payOrderNo;
        }

        public String getPayMethodCd() {
            return PayMethodCd;
        }

        public void setPayMethodCd(String payMethodCd) {
            PayMethodCd = payMethodCd;
        }

        public String getPayStatus() {
            return PayStatus;
        }

        public void setPayStatus(String payStatus) {
            PayStatus = payStatus;
        }

        public String getBankOrVirtualNo() {
            return BankOrVirtualNo;
        }

        public void setBankOrVirtualNo(String bankOrVirtualNo) {
            BankOrVirtualNo = bankOrVirtualNo;
        }

        public String getOrigTransType() {
            return OrigTransType;
        }

        public void setOrigTransType(String origTransType) {
            OrigTransType = origTransType;
        }
    }

}
