package com.jireh.recipe.repositories;

import com.jireh.recipe.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {


    Optional<UnitOfMeasure> findByUom(String uom);
}
