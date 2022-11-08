package com.theys.apiminicurso.service;

import com.theys.apiminicurso.exceptions.ApiException;
import com.theys.apiminicurso.exceptions.PermissionException;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;

@Service
public class SecurityService {

    public void validar(String key) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(key.getBytes(), 0, key.length());
            String keyCripto = new BigInteger(1, md5.digest()).toString(16);
            if (!keyCripto.equals("303b1c4fa97d159baf33dc6cd229049f"))
                throw new PermissionException("Permissão negada");
        }  catch (Exception e) {
            e.printStackTrace();
            throw new ApiException("Erro ao validar permissão");
        }
    }

}
