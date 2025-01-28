/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dell
 */
class ProductFilter {
    public List<Product> filter(List<Product> products, Specification<Product> spec) {
        return products.stream()
                .filter(spec::isSatisfied)
                .collect(Collectors.toList());
    }
}

