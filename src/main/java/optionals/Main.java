package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ProductRepo repo = new ProductRepo();

        System.out.println(repo.getProductById("1"));
        System.out.println(repo.getProductById("9813"));

        Optional<Product> optionalProduct = repo.getProductById("12");

        if (optionalProduct.isPresent()) {
            Product p1 = optionalProduct.get();
            System.out.println(p1.name());
        }
        else {
            System.out.println("Produkt nicht vorhanden");
        }

        Product p2 = optionalProduct.orElse(new Product("test", "test"));
        System.out.println(p2);
    }
}
