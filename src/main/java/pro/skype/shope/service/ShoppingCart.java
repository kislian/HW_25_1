package pro.skype.shope.service;

import java.util.List;

public interface ShoppingCart {
    List<Integer> add(List<Integer> goods);

    List<Integer> get();
}
