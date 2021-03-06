public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            digits[i] = (digit + carry) % 10;
            carry = (digit + carry) / 10;
        }
        if (carry == 0) return digits;
        int res[] = new int[digits.length + 1];
        res[0] = carry;
        System.arraycopy(digits, 0, res, 1, digits.length);
        return res;
    }
}
