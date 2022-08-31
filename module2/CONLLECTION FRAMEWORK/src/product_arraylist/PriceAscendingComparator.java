package product_arraylist;

import java.util.Comparator;
import java.util.List;

public class PriceAscendingComparator implements Comparator<Product>{
    @Override
    public int compare(Product productOne, Product productTwo) {
        if (productOne.getPrice() > productTwo.getPrice()) {
            return 1;
        } else if (productOne.getPrice() == productTwo.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
    }
