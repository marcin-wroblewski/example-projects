package upwm.fun.myshop.basket;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import upwm.fun.myshop.product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by marci on 04.06.2017.
 */
@JsonSerialize(using = BasketSerializer.class)
public class Basket {
    private Map<Long, Item> basket = new HashMap<>();

    public Basket add(Product product, int count) {
        this.basket.computeIfAbsent(product.getId(), p -> new Item(product, 0)).add(count);
        return this;
    }

    public Basket add(Product product) {
        return this.add(product, 1);
    }

    public Basket remove(Product product, int count) {
        if (this.basket.containsKey(product.getId())) {
            this.basket.get(product.getId()).remove(count);
        }
        return this;
    }

    public Basket remove(Product product) {
        return this.remove(product, 1);
    }

    public List<Item> getItems() {
        return this.basket.keySet().stream()
                .map(k -> this.basket.get(k))
                .sorted()
                .collect(Collectors.toList());
    }

    public class Item implements Comparable<Item> {
        private Product product;
        private int count;

        private Item(Product product, int count) {
            this.product = product;
            this.count = count;
        }

        public Product getProduct() {
            return product;
        }

        public Item add(int count) {
            this.count += count;
            return this;
        }

        public Item remove(int count) {
            if (count > this.count) {
                throw new RuntimeException(String.format("Cannot remove %d items. There is only %d of them in the " +
                        "basket", count, this.count));
            }
            this.count -= count;
            return this;
        }

        public int getCount() {
            return count;
        }

        @Override
        public int compareTo(Item o) {
            return this.product.getName().compareTo(o.product.getName());
        }
    }
}
