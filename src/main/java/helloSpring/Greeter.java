package helloSpring;

public class Greeter {
    private String name = "";

    public Greeter(String name) {
        this.name = name;
    }

    public String sayWhatsUp() {
        return "Hello " + name + ". Welcome to Spring Framework World.";
    }
}
