package com.design.patterns.behaviroual.strategy;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.design.patterns.behaviroual.strategy.encryption.FileEncryptStrategy;
import com.design.patterns.behaviroual.strategy.enums.EncryptionTechniques;

@Component
public class FileEncryptionFactory {
	
	private Map<EncryptionTechniques, FileEncryptStrategy> encryptionFactoryMap;
	
	@Autowired
	public FileEncryptionFactory(Set<FileEncryptStrategy> encryptionStrategies) {
		encryptionFactoryMap = new EnumMap<>(EncryptionTechniques.class);
		encryptionStrategies.forEach(
					encryptionStrategy -> {
						System.out.println("Initalising strategy "+encryptionStrategy);
						encryptionFactoryMap.put(encryptionStrategy.encryptionTechnique(), encryptionStrategy);
					}
				);
	}
	
	public FileEncryptStrategy getEncryption(EncryptionTechniques encryptionTechnique) {
		return encryptionFactoryMap.get(encryptionTechnique);
	}

}
