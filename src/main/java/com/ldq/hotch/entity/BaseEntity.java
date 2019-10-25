package com.ldq.hotch.entity;

/**
 * @author LinDingQiang
 * @time 2018/11/29 15:21
 * @email dingqiang.l@verifone.cn
 */
public class BaseEntity {
    private String Svc_Rsp_St;//	服务响应状态	VarChar2	2	必输	00-	成功01-	失败
    private String Svc_Rsp_CD;//服务响应码	VarChar2	12	非必输
    private String Rsp_Inf;//	响应信息	VarChar2	600	非必输

    public String getSvc_Rsp_St() {
        return Svc_Rsp_St;
    }

    public void setSvc_Rsp_St(String svc_Rsp_St) {
        Svc_Rsp_St = svc_Rsp_St;
    }

    public String getSvc_Rsp_CD() {
        return Svc_Rsp_CD;
    }

    public void setSvc_Rsp_CD(String svc_Rsp_CD) {
        Svc_Rsp_CD = svc_Rsp_CD;
    }

    public String getRsp_Inf() {
        return Rsp_Inf;
    }

    public void setRsp_Inf(String rsp_Inf) {
        Rsp_Inf = rsp_Inf;
    }
}
