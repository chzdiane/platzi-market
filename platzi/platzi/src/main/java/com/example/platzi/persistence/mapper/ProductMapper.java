package com.example.platzi.persistence.mapper;

import com.example.platzi.domain.Category;
import com.example.platzi.domain.Product;
import com.example.platzi.persistence.entity.Categoria;
import com.example.platzi.persistence.entity.Producto;

import java.util.List;

@Mapper(componentModel = "spring", uses={CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target="productId"),
            @Mapping(source = "nombre", target="name"),
            @Mapping(source = "idCategoria", target="categoryId"),
            @Mapping(source = "precioVenta", target="price"),
            @Mapping(source = "cantidadStock", target="stock"),
            @Mapping(source = "estado", target="active"),
            @Mapping(source = "categoria", target="category"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore=true)
    Producto toProducto(Product product);
}
