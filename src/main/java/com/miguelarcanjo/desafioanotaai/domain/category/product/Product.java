package com.miguelarcanjo.desafioanotaai.domain.category.product;

import com.miguelarcanjo.desafioanotaai.domain.category.Category;
import com.miguelarcanjo.desafioanotaai.domain.category.CategoryDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;
    private Integer price;
    private Category category;

    public Product(ProductDTO data){
        this.title = data.title();
        this.description = data.description();
        this.ownerId = data.ownerId();
        this.price = data.price();
    }
}
