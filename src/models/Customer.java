package models;

public class Customer {

    protected String name;
    protected int doc_number;
    protected int id;

    public Customer() {

    }

    public Customer(String name, int doc_number, int id) {
        this.name = name;
        this.doc_number = doc_number;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getDoc_number() {
        return doc_number;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoc_number(int doc_number) {
        this.doc_number = doc_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", doc_number=" + doc_number +
                ", id=" + id +
                '}';
    }
}
