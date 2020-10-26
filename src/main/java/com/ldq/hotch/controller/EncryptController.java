package com.ldq.hotch.controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ldq.hotch.encrypt.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/encrypt")
@RestController
public class EncryptController {

    @PostMapping(value = "/upp0013")
    public String enrypt(@RequestBody String plainText) throws EncryptException {
        JsonObject root = JsonParser.parseString(plainText).getAsJsonObject();
        String encryptKey = root.get("encryptKey").getAsString();
        String decryptKey = RsaUtil.decrypt(encryptKey, Encrypt.PRIVATE_KEY);
        System.out.println("解密后的密钥：" + decryptKey);

        String busData = root.get("busData").getAsString();
        String decryptBusData = AesUtil.decrypt(busData, decryptKey);

        JsonObject respDataJsonObject = JsonParser.parseString(decryptBusData).getAsJsonObject();
        System.out.println("解密后的数据：" + respDataJsonObject.toString());

        String decryptPlaitText = respDataJsonObject.get("plainText").getAsString();
        String decryptSignInfo = respDataJsonObject.get("signInfo").getAsString();
        boolean verifySign = SHA256withRSA.verifySign(Encrypt.PUBLIC_KEY, decryptPlaitText, decryptSignInfo);
        System.out.println("是否验签通过：" + verifySign);



         plainText = "服务器的数据";

        JsonObject busDataJson = new JsonObject();
        busDataJson.addProperty("plainText", "客户端数据："+decryptPlaitText+"，"+plainText);
        String signInfo = SHA256withRSA.sign(Encrypt.PRIVATE_KEY, plainText);
        busDataJson.addProperty("signInfo", signInfo);
        System.out.println("签名信息：" + signInfo);

        String aesKey = AesUtil.getAESSecureKey();
        System.out.println("密钥明文：" + aesKey);

        String encryptedAesKey = RsaUtil.encrypt(aesKey, Encrypt.PUBLIC_KEY);
        System.out.println("密钥密文：" + encryptedAesKey);

        String encrypt = AesUtil.encrypt(busDataJson.toString(), aesKey);
        System.out.println("加密数据：" + encrypt);

        JsonObject root1 = new JsonObject();
        root1.addProperty("encryptKey", encryptedAesKey);
        root1.addProperty("busData", encrypt);
        System.out.println("发送数据："+root1.toString());
        return root1.toString();
    }

}
