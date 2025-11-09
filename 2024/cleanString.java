public class cleanString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String clean = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(clean);
    }
}
