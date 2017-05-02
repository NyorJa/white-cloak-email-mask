public class EmailMasker {
    public String maskEmail(String email) {
        int atIndex = email.indexOf('@');
        StringBuilder sb = new StringBuilder(email);
        for (int i = 1; i < atIndex - 1; i++) {
            if (sb.charAt(i) != '.') {
                sb.setCharAt(i, '*');
            }
        }
        return sb.toString();
    }
}
