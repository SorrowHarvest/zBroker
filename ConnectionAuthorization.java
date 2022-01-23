package ServerHTTP;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class ConnectionAuthorization {
	
	
	public static final int ARGON2_BLOCK_SIZE = 1024;
    public static final int ARGON2_QWORDS_IN_BLOCK = ARGON2_BLOCK_SIZE / 8;
    
    
	static float player_id = 0.00001F;
	static String playerUsername = "Zhaza";
	static String playerDonationRank = "Owner";
	
	static byte seed_byte_0; static byte seed_byte_1;
	static byte seed_byte_2; static byte seed_byte_3;
	static byte seed_byte_4; static byte seed_byte_5;
	static byte seed_byte_6; static byte seed_byte_7;
	
	private static byte[] blockchain = new byte[ARGON2_BLOCK_SIZE];
	private static byte[] transaction = new byte[ARGON2_QWORDS_IN_BLOCK];
	
	private char[] wallet = new char[95];
	
	static short bit_0; static short bit_1; static short bit_2; static short bit_3;
	static short bit_4; static short bit_5; static short bit_6; static short bit_7;
	static short bit_8; static short bit_9; static short bit_A; static short bit_B;
	static short bit_C; static short bit_D; static short bit_E; static short bit_F;
	
	static byte[] encodeAddress(char[] broker) throws Throwable {
		String wallet = broker.toString();
		String collection = Base64.getEncoder().encodeToString(broker.toString().getBytes("utf-8"));
		return collection.getBytes();
	}
	
	static byte[] securityDeposit(byte[] collection) {
		byte[] wedger = Base64.getDecoder().decode(collection);
		return wedger;
	}
	
	static char[] cipher(float player_id, String playerUsername, char[] broker) {
		if(player_id < 0.00001F) player_id = 0.00001F;
		// Encode 
		
		char seed = (char) seed_byte_0;
		
		char[] datastream = new char[28];
		char[] root = {(char) seed_byte_1 , (char) seed_byte_2 };
		char[] stem = {
				(char) seed_byte_3 ,
				(char) seed_byte_4 ,
				(char) seed_byte_5 ,
				(char) seed_byte_6 
		};
		
		char leaf = (char) seed_byte_7;
		
		char[] creationBIT = new char[16];
		for(int cbt = 0; cbt != creationBIT.length; cbt++) {
			char var = (char) bit_0;
			creationBIT[cbt] = var;
		}
		
		String pest = stem.toString() + datastream.toString();
		
		return datastream;
	}
	public static void main(String[] args) {
		String filePath = "C:/Windows/Notepad.exe";
        try {
             
            Process p = Runtime.getRuntime().exec(filePath);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
