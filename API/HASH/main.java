public class main {

    public static void main(String args[]) throws Exception {

        SHA sha256 = new SHA("SHA-256");

        String test = "This is a test sentence";
    
        test = sha256.get_hash(test);
        System.out.println(test);
    }
}