import java.security.MessageDigest;
import java.util.Scanner;  
import java.util.Base64;

public class SHA {

    private static MessageDigest hash;
    static Base64.Encoder encoder = Base64.getEncoder();

    /**
     * 建構方法
     * 設定訊息摘要演算法為 SHA-256
     * NoSuchAlgorithmException - 
     *      if no Provider supports a MessageDigestSpi implementation for the specified algorithm.
     * 
     * HSAH 種類：
     * MD5
     * SHA-1
     * SHA-256
     */
    public SHA(String sha) throws Exception {
            hash = MessageDigest.getInstance(sha);
    }

    public final static String get_hash(String str) {
        hash.update(str.getBytes());
        //return  BytesToString(hash.digest());
        return  encoder.encodeToString(hash.digest());
    }
    
    // 16進制表示
    private static String BytesToString(final byte[] bytes) {
        final StringBuilder sb = new StringBuilder();
        for(final byte b : bytes) {
            if ((b & 0xF0) == 0) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & 0xFF));
        }
        return sb.toString().toLowerCase();
    }    

    // https://docs.oracle.com/javase/7/docs/api/java/security/MessageDigest.html

}
