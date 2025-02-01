package creationalPatterns.abstractFactory.app;

import creationalPatterns.abstractFactory.buttons.Button;
import creationalPatterns.abstractFactory.checkboxes.Checkbox;
import creationalPatterns.abstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button=factory.createButton();
        checkbox=factory.createCheckbox();
    }

    public void paint(){
        button.paint();;
        checkbox.paint();
    }
}
