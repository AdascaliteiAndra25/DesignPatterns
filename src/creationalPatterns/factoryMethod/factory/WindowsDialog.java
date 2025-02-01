package creationalPatterns.factoryMethod.factory;

import creationalPatterns.factoryMethod.buttons.Button;
import creationalPatterns.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
