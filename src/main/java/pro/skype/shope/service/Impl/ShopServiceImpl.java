package pro.skype.shope.service.Impl;

import org.springframework.stereotype.Service;
import pro.skype.shope.service.ShopService;
import pro.skype.shope.service.ShoppingCart;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    private final ShoppingCart shoppingCart;
    public ShopServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    @Override
    public List<Integer> add(List<Integer> goods) {
        return shoppingCart.add(goods);
    }

    @Override
    public List<Integer> get() {
        return shoppingCart.get();
    }
}
