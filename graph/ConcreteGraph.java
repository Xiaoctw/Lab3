package src.graph;

import src.edge.Edge;
import src.vertex.Vertex;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConcreteGraph implements Graph<Vertex,Edge> {
    private Set<Vertex> vertices=new HashSet<>();
    protected Set<Edge> edges=new HashSet<>();
    @Override
    public boolean addVertex(Vertex v) {
        if (vertices.contains(v)) {
            return false;
        }
        vertices.add(v);
        return true;
    }

    @Override
    public boolean removeVertex(Vertex v) {
        if (!vertices.contains(v)){
            return false;
        }
        vertices.remove(v);
        return true;
    }

    @Override
    public Set<Vertex> vertices() {
        return this.vertices;
    }

    @Override
    public Map<Vertex, Double> sources(Vertex target) {
        return null;
    }

    @Override
    public Map<Vertex, Double> targets(Vertex source) {
        return null;
    }

    @Override
    public boolean addEdge(Edge edge) {
        if (edges.contains(edge)){
            return false;
        }
        edges.add(edge);
        return true;
    }

    @Override
    public boolean removeEdge(Edge edge) {
        if (!edges.contains(edge)){
            return false;
        }
        edges.remove(edge);
        return true;
    }
    @Override
    public Set<Edge> edges() {
        return edges;
    }
}
