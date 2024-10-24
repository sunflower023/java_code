package oop.task.exp.e02.kg.core;

public class Entity extends Node{
    private string type;
    private string name;
    private string attribute;

    public Entity(int id){
        super(id);
    }

    public Entity(int id, string attribute, string name, string type) {
        super(id);
        this.attribute = attribute;
        this.name = name;
        this.type = type;
    }

    public string getType() {
        return type;
    }

    public void setType(string type) {
        this.type = type;
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
