public class EmailMasker {
    public String maskEmail(String email) {
        StringBuilder sb = new StringBuilder(email);
        int beforeAtIndexPos = sb.indexOf("@") - 1;
        for (int i = 1; i < beforeAtIndexPos; i++) {
            if (sb.charAt(i) != '.') {
                sb.setCharAt(i, '*');
            }
        }
        return sb.toString();
    }
}
