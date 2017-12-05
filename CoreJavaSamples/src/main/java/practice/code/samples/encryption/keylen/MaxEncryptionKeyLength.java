package practice.code.samples.encryption.keylen;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

public class MaxEncryptionKeyLength {

	public static void main(String[] args) {
		try {
			int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
			System.out.println("maxKeyLen: " + maxKeyLen);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

}
