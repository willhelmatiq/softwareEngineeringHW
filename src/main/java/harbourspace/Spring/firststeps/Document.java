package harbourspace.Spring.firststeps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Document {

    @Autowired
    SpellChecker spellChecker;

    public Document() {
        System.out.println("Document is created!");
    }
}
