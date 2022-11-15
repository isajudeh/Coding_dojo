package com.coding_dojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding_dojo.languages.models.language;
import com.coding_dojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
private final LanguageRepository languageRepository;
public LanguageService(LanguageRepository languageRepository) {
	this.languageRepository = languageRepository;
	 }

// returns all the Language
public List<language> allLanguages() {
    return languageRepository.findAll();
}

// creates a Language
public language createLanguage(language b) {
    return languageRepository.save(b);
}

//Delete a Language
public void deleteLanguage(Long id) {
	languageRepository.deleteById(id);
}

//Update a Language
public language updateLanguage(language b) {
    return languageRepository.save(b);
}

// retrieves a book
public language findLanguage(Long id) {
    Optional<language> optionalBook = languageRepository.findById(id);
    if(optionalBook.isPresent()) {
        return optionalBook.get();
    } else {
        return null;
    }
}

}
