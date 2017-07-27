import java.util.Base64;

public class main {
    public static void main(String args[]) throws Exception {

        Base64.Encoder encoder = Base64.getEncoder();

        String plaintext = "This is a test sentence.";
        String decrytext;
        byte[] ciphertext;

        byte[] key = AES.initKey();
        ciphertext = AES.encrypt(plaintext.getBytes(), key);
        decrytext = new String(AES.decrypt(ciphertext, key));

        System.out.println("金鑰：" + encoder.encodeToString(key));
        System.out.println("明文：" + plaintext);
        System.out.println("密文：" + encoder.encodeToString(ciphertext));
        System.out.println("解密：" + decrytext);
    }
}
