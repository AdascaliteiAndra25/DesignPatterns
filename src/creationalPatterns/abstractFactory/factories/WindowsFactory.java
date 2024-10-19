package creationalPatterns.abstractFactory.factories;

import creationalPatterns.abstractFactory.buttons.Button;
import creationalPatterns.abstractFactory.buttons.WindowsButton;
import creationalPatterns.abstractFactory.checkboxes.Checkbox;
import creationalPatterns.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
