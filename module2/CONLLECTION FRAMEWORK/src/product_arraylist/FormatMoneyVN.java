package product_arraylist;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatMoneyVN {
    public String formatMoneyVN(double daiGiaBinh) {
        Locale lc = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(lc);
        return numberFormat.format(daiGiaBinh);
    }
}
