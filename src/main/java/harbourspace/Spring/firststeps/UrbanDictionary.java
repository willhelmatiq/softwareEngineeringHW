package harbourspace.Spring.firststeps;

import org.springframework.stereotype.Component;

@Component
public class UrbanDictionary implements Dictionary{
    @Override
    public void dictInfo() {
        System.out.println("Urban Dictionary");
    }
}
