package app.model;
import org.springframework.stereotype.Component;

    @Component("dog")
    public class Dog extends Animal {
        @Override
        public String speak() {
            return "Woof!";
        }
    }

