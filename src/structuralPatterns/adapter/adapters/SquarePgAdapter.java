package structuralPatterns.adapter.adapters;

import structuralPatterns.adapter.round.RoundPeg;
import structuralPatterns.adapter.square.SquarePeg;

public class SquarePgAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePgAdapter(SquarePeg peg){
        this.peg=peg;
    }

    public double getRadius(){
        double result;
        result=(Math.sqrt(Math.pow((peg.getWidth() / 2), 2)* 2));
        return result;
    }
}
