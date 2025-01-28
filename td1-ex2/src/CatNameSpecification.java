public class CatNameSpecification implements Specification<Product>
{
    private String category;
    private String name;
    public CatNameSpecification(String category, String name) {
        this.category = category;
        this.name = name;
    }
    @Override
    public boolean isSatisfied(Product product) {
        return product.getCategory().equals(category) && product.getName().equals(name);
    }
}
