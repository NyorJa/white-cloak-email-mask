public class EmailMasker {
    public String maskEmail(String email) {
        int beforeAtIndexPos = email.indexOf('@') - 1;
        StringBuilder sb = new StringBuilder(email);
        for (int i = 1; i < beforeAtIndexPos; i++) {
            if (sb.charAt(i) != '.') {
                sb.setCharAt(i, '*');
            }
        }
        return sb.toString();
    }
}
