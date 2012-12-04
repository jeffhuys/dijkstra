package main;

public class EdgeG {

    private final VertexG target;
    private final double cost;

    // Constructor
    public EdgeG(VertexG nTarget, double nCost) {
        this.target = nTarget;
        this.cost = nCost;
    }

    public VertexG getTarget() {
        return this.target;
    }

    public double getCost() {
        return this.cost;
    }
}
