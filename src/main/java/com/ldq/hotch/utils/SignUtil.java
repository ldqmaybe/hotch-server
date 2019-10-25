package com.ldq.hotch.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author LinDingQiang
 * @time 2018/11/29 16:35
 * @email dingqiang.l@verifone.cn
 */
public class SignUtil {
    private static String pubkey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAg3I9pTRnaRMBWNfegP6XE/bPf/l4HyOq2G+RngaDmrbZxC+yQHt2W6G9F7WQzp7mD/t8mqK6lZg78BQLAArfWnPI116YIbyxyFvK3b9uY245WoznMEMvx+NvrQSoGVe6Dt6/M4+fD74144+8MBRB4mnETCN2OmAmIutKJikHgpPW2Oy+RSuzMpuBqzU+Prb+QP88gUuzbmgjvK3rqeQVbYNjI1bos6DAzjza+7E9aKhY9tSqmyKy/k80Hv4YnXTq0VWPJZQLV5qtJbzHI3534ArW7Pq4WIoyF434tVRIfnKvRpeEWP91YeShOfI4FZO4IBbsrw5q+e7A7W+tlfEYGQIDAQAB";
    private static String prikey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCDcj2lNGdpEwFY196A/pcT9s9/+XgfI6rYb5GeBoOattnEL7JAe3Zbob0XtZDOnuYP+3yaorqVmDvwFAsACt9ac8jXXpghvLHIW8rdv25jbjlajOcwQy/H42+tBKgZV7oO3r8zj58PvjXjj7wwFEHiacRMI3Y6YCYi60omKQeCk9bY7L5FK7Mym4GrNT4+tv5A/zyBS7NuaCO8reup5BVtg2MjVuizoMDOPNr7sT1oqFj21KqbIrL+TzQe/hiddOrRVY8llAtXmq0lvMcjfnfgCtbs+rhYijIXjfi1VEh+cq9Gl4RY/3Vh5KE58jgVk7ggFuyvDmr57sDtb62V8RgZAgMBAAECggEAKTNfuy6n0zmPzIctSQWD2VAdTiGl0yzc2iZuYDfufEogC+xfVPLd8G7L1Gim0PzhY9USA25KSaWD9AZ0RDkkNTfhlhAiY0DAAOs0tTjRovzjoUxVEr2cdm0FjhfNkNP8j7il+cVkuAyI26Er/W38ELnSO4NKBZYpnfxeK4PkxLqZW8/NKUXJni7FaPni2S7tWhgkt7Zqa/gdLnCQMLaf9xePhLzqrM2gT10kkZjBDQ4WqvfsgLRMUJ8B40e3QezYxTtYlzaZCSibBMI+gMnBKJOzXf01wUybNpBWYmDFMDoMColILB2GeSTzO92V0DceewaOamBpKaXTj/DeMFZuuQKBgQDbiHF+/GOIirzdWe0SiJkKmv4MRvIcTGrwGOepdEimbDvFaq+M4JxS0n5drufxq1E8kmDAcLfatvf7NZ0+FZBMMMfl3giLcpZvgCxKxABefdZdkOsTvTgG0ckKwf9qO2Yq+A6tlk52Hv80tecXsIDGdvQnU/52xryTUBcbdWjfCwKBgQCZR/FaPUFDjkRwU/uHq21azGUNCUjKH6O1ULRBWJdQBv5OLvCxqvwXSJGAYaG1JdwP15jI4jNzJfmmM8IT3Jw65zAlhXe01l2LEf7PohAVN5LDqd5Lq2rwCYhAV5aspk7Wc2gHhTsyRgTZWeLHF7i1Xc0JlmW5mgW4/t7QExCr6wKBgCs+z4zCTyEgo1+/TTIvcmZibdUhTKRCcXZmkYwR+hW+kG+tOnO381NlX7s4rzwuEUyrUR/XlIAjNupnf1gxi0FXAqnHeUtvAS9pwk/gGGqEw2ufFo/G4HiHbuENojDdDp08TDfpuf8O0BskEifafyOZXzM4GpJvR8qFJmgkUspNAoGAaWGl1FWixhBMizGiD59TOoalvrWwXo4sHh8THo4K0ZFNS3FIN84HLPbOWgZFh+Y0iou+VfX2S2dDYPnap48XtgN1/YXqS+DJRTClEBkql3uyomTqGPoMNmVHUH0ncSGRuCx1zB3UGfc7pDcBC8IKUl7f9YR6AYWcA5julP1Wi+sCgYEAyysEFyNAlTaDrtVMqYcRZ2Gufqoi/2qUzFFQnT6HTuhiB+S67p0VYaTPI4/XllrftkfiVYmt/gI2YuGhzrgO3vF6ucsqrNfnFdeA2HUomcO4XkFygt/die1pgAZ+XRL232F1kIWSbmIoerVBubc+vAZpEtVjVVJNgMMPSz29Nrs=";

    /**
     * 数据签名加密
     *
     * @param data       要加密的数据
     * @param privateKey 私钥
     * @return 加密后数据
     */
    public static String sign(String data, String privateKey) {
        return sign(data, null, privateKey);
    }

    /**
     * 将数据拼装成指定格式
     *
     * @param data       原始数据
     * @param signMethod 签名算法
     * @return sign 加密后的数据
     */
    public static String sign(String data, String signMethod, String privateKey) {
        String unSign;
        String sign;
        boolean flag;
        if (StringUtils.isEmpty(privateKey)) {
            privateKey = prikey;
        }
        if ("SHA256withRSA".equals(signMethod)) {
            unSign = getSHA256withRSAData(data);
            sign = SHA256withRSA.sign(privateKey, unSign);
            flag = SHA256withRSA.verifySign(pubkey, unSign, sign);
            System.out.println("明文：" + unSign + "\n 密文：" + sign + "\n验签:" + flag);
        } else {
            sign = data;
        }
        return sign;
    }

    /**
     * @param srcMsg     明文
     * @param signMsg    密文
     * @param publicKey  解密的公钥
     * @param signMethod 算法
     */
    public static boolean verifySign(String srcMsg, String signMsg, String publicKey, String signMethod) {
        boolean flag = false;
        if (!StringUtils.isEmpty(publicKey)) {
            publicKey = pubkey;
        }
        if ("SHA256withRSA".equals(signMethod)) {
            try {
                String unSign = getSHA256withRSAData(srcMsg);
                flag = SHA256withRSA.verifySign(publicKey, unSign, signMsg);
                System.out.println( "明文：" + unSign + "\n验签:" + flag);
            } catch (Exception e) {
                e.printStackTrace();
                return flag;
            }
            return flag;
        } else {
            return true;
        }
    }

    /**
     * 获取SHA256withRSA算法加密的数据
     *
     * @param data 要加密的数据
     * @return 加密后的数据
     */
    private static String getSHA256withRSAData(String data) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject) parser.parse(data);
        StringBuilder sb = new StringBuilder();
        if (jsonObject != null && jsonObject.size() > 0) {
            Gson gson = new Gson();
            Type type = new TypeToken<Map<String, String>>() {
            }.getType();
            Map<String, String> map = gson.fromJson(jsonObject, type);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (StringUtils.isEmpty(value)) {
                    value = "";
                }
                sb.append(key).append("=").append(value).append("&");
            }
        }
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }
}
