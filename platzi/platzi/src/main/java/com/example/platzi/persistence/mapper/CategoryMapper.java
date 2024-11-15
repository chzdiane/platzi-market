package com.example.platzi.persistence.mapper;

import com.example.platzi.domain.Category;
import com.example.platzi.persistence.entity.Categoria;

@Mapper(componentModel="spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target="categoryId"),
            @Mapping(source = "descripcion", target="category"),
            @Mapping(source = "estado", target="active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore=true)
    Categoria toCategoria(Category category);
}
