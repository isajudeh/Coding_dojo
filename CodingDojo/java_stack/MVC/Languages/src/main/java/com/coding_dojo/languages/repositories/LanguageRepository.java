package com.coding_dojo.languages.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.coding_dojo.languages.models.language;

@Repository
public interface LanguageRepository extends CrudRepository<language,Long>{
    List<language> findAll();
    List<language> findByNameContaining(String search);
}