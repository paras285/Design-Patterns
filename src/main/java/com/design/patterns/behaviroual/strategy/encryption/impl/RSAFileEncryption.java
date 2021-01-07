package com.design.patterns.behaviroual.strategy.encryption.impl;

import org.springframework.stereotype.Component;

import com.design.patterns.behaviroual.strategy.encryption.FileEncryptStrategy;
import com.design.patterns.behaviroual.strategy.enums.EncryptionTechniques;

@Component("RSAFileEncryption")
public class RSAFileEncryption implements FileEncryptStrategy{

	@Override
	public String encryptFile() {
		return "Encrypting file using RSA algorithm";
	}

	@Override
	public EncryptionTechniques encryptionTechnique() {
		return EncryptionTechniques.RSA_ENCRYPTION;
	}

}
