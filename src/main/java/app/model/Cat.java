package app.model;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public String speak() {
        return "Im a Cat";
    }

}
