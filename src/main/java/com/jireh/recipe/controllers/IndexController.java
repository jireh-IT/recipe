package com.jireh.recipe.controllers;

import com.jireh.recipe.model.Category;
import com.jireh.recipe.model.UnitOfMeasure;
import com.jireh.recipe.repositories.CategoryRepository;
import com.jireh.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        Optional<Category> optionalCategory = categoryRepository.findByDescription("African");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByUom("TeaSpoon");

        System.out.println("Cat Id is: "+optionalCategory.get().getId());
        System.out.println("UOM Id is: "+optionalUnitOfMeasure.get().getId());
        return "index";
    }
}
