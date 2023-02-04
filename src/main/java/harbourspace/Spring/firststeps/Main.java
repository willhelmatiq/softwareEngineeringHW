package harbourspace.Spring.firststeps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Main.class);
        var spellChecker = context.getBean("spellChecker", SpellChecker.class);
        var document = context.getBean("document", Document.class);
        document.spellChecker.checkSpelling();
//        spellChecker.checkSpelling();
    }
}
