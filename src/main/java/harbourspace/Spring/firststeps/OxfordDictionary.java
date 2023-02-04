package harbourspace.Spring.firststeps;

import org.springframework.stereotype.Component;

@Component
public class OxfordDictionary implements Dictionary{
    @Override
    public void dictInfo() {
        System.out.println("Oxford Dictionary");
    }
}
