/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import javax.naming.Name;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 1200),
                new Product("Phone", "Electronics", 800),
                new Product("Table", "Furniture", 150),
                new Product("Laptop", "Electronics", 1500)

                );

        ProductFilter filter = new ProductFilter();

        // Filtrage par catégorie
        List<Product> electronics = filter.filter(products, new CategorySpecification("Electronics"));
        System.out.println("Produits électroniques : " + electronics.size());

        // Filtrage par prix
        List<Product> affordableProducts = filter.filter(products, new PriceSpecification(1000));
        System.out.println("Produits à moins de 1000 EUR : " + affordableProducts.size());
        //Filtrage par nom
        List<Product> specificName = filter.filter(products, new NameSpecification("Laptop"));
        System.out.println("Produits avec le nom laptop : " + specificName.size());
        //filtrage par nom et category
        List<Product> specificCatName = filter.filter(products, new CatNameSpecification("Electronics","Laptop"));
        System.out.println("Produits avec le nom laptop et category : " + specificCatName.size() );
        List<Product> andSpecific =filter.filter(products, new AndSpecification(new CategorySpecification("Electronics"),new PriceSpecification(1200)));
        System.out.println("Produits : " + andSpecific.size());
    }

}
