package main;

import java.util.ArrayList;

public class VertexG implements Comparable<VertexG> {

    private double minDistance;
    private final String label;
    private VertexG previous;

    public VertexG(String nLabel) {
        this.label = nLabel;
        this.minDistance = Double.POSITIVE_INFINITY;

        this.edges = new ArrayList<EdgeG>();
    }

    public double getMinDistance() {
        return this.minDistance;
    }

    public void setMinDistance(double nMinDistance) {
        this.minDistance = nMinDistance;
    }

    public String getLabel() {
        return this.label;
    }

    public void setPrevious(VertexG nPrevious) {
        this.previous = nPrevious;
    }

    public VertexG getPrevious() {
        return this.previous;
    }

    @Override
    public int compareTo(VertexG vertex) {
        return Double.compare(vertex.getMinDistance(), this.minDistance);
    }
    // krawędzi
    public ArrayList<EdgeG> edges;
}