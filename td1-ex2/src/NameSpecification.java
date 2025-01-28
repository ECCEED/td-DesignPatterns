public class NameSpecification implements Specification<Product> {
    private String name;
    public NameSpecification(String name) {
        this.name = name;
    }
    @Override
    public boolean isSatisfied(Product product ){
        return product.getName().equals(name);

    }
}
