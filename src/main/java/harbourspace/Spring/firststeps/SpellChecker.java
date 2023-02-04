package harbourspace.Spring.firststeps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    @Autowired
    @Qualifier("urbanDictionary")
    Dictionary dictionary;
    void checkSpelling() {
        dictionary.dictInfo();
    }
}
