public class isOdd {
    public boolean isOdd(int num) {
        boolean odd = true;
        while((num & 1) == 1) {
            odd = true;
            break;
        }

        while((num & 1) != 1) {
            odd = false;
            break;
        }
        return odd;
    }
}
