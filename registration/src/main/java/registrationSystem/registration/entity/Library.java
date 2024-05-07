package registrationSystem.registration.entity;

import jakarta.persistence.*;

@Entity
@Table(name="library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="author")
    private String author;

    @Column(name="price")
    private String price;


    public Library(){

    }

    public Library(int id, String name,String author,String price){
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price=price;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }


    @Override
    public String toString(){
        return "Library{"+"id"+"name"+name+'\''+"author"+author+'\''+"price"+price+'\''+"}";
    }


}
