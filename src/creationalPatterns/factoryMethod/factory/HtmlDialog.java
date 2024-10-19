package creationalPatterns.factoryMethod.factory;

import creationalPatterns.factoryMethod.buttons.Button;
import creationalPatterns.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
