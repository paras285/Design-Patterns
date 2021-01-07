package com.design.patterns.behaviroual.strategy.encryption;

import com.design.patterns.behaviroual.strategy.enums.EncryptionTechniques;

public interface FileEncryptStrategy {

	public String encryptFile();
	public EncryptionTechniques encryptionTechnique();
}
