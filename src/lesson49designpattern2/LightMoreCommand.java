package lesson49designpattern2;

public class LightMoreCommand implements Command {
    private Light light;

    public LightMoreCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.ishigiAritr();
    }
}
