package com.design.patterns.behaviroual.strategy.encryption.impl;

import org.springframework.stereotype.Component;

import com.design.patterns.behaviroual.strategy.encryption.FileEncryptStrategy;
import com.design.patterns.behaviroual.strategy.enums.EncryptionTechniques;

@Component("AESFileEncryption")
public class AESFileEncryption implements FileEncryptStrategy{

	@Override
	public String encryptFile() {
		return "Encrypting file using AES algorithm";
	}

	@Override
	public EncryptionTechniques encryptionTechnique() {
		return EncryptionTechniques.AES_ENCRYPTION;
	}

}
