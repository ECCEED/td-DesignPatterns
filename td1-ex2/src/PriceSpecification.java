
// Spécification pour filtrer par prix maximum
class PriceSpecification implements Specification<Product> {
    private double maxPrice;

    public PriceSpecification(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return product.getPrice() <= maxPrice;
    }
}

