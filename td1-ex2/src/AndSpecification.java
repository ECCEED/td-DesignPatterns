public class AndSpecification implements Specification<Product> {
    Specification<Product> spec1;
    Specification<Product> spec2;
    public AndSpecification(Specification<Product> spec1, Specification<Product> spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;

    }
    @Override
    public boolean isSatisfied(Product product) {
        return spec1.isSatisfied(product) && spec2.isSatisfied(product);
    }

}
