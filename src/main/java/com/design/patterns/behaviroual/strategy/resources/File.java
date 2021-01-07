package com.design.patterns.behaviroual.strategy.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.behaviroual.strategy.encryption.FileEncryptStrategy;
import com.design.patterns.behaviroual.strategy.enums.EncryptionTechniques;

@RestController
@RequestMapping(value="strategy")
public class File {

	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	@Qualifier(value="AESFileEncryption")
	FileEncryptStrategy aesFileEncryption;
	
	@Autowired
	@Qualifier(value="RSAFileEncryption")
	FileEncryptStrategy rsaFileEncryption;
	
	@RequestMapping(value="encryptFile")
	public String encryptFile(@RequestBody String encryptionTechnique) {
		String encryptedFile = null;
		if(encryptionTechnique.equals(EncryptionTechniques.AES_ENCRYPTION.toString())) {
			encryptedFile = aesFileEncryption.encryptFile();
		}else{
			encryptedFile = rsaFileEncryption.encryptFile();
		}
		return encryptedFile;
	}
}
