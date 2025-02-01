package creationalPatterns.factoryMethod.factory;

import creationalPatterns.factoryMethod.buttons.Button;


public abstract class Dialog {

    public void renderWindow() {

        //...
        Button okButton = createButton();
        okButton.render();
    }

    //Subclasses will override this method in order to create specific button obj
    public abstract Button createButton();
}

