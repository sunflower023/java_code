package oop.task.exp.e02.kg.core;

public class Relationship extends Edge{
    private string name;
    private string attribute;

    public Relationship(Node from, Node to){
        super(form,to);
    }

    public Relationship(Node from, Node to, string name, string attribute) {
        super(form,to);
        this.name = name;
        this.attribute = attribute;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getAttribute() {
        return attribute;
    }

    public void setAttribute(string attribute) {
        this.attribute = attribute;
    }
}
