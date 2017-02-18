package party.infoo.spring.DI.entity;

import java.util.*;

/**
 * Created by infoo on 2017/2/18.
 */
public class People {
  private String name;
  private Dog dog;
  private Cat cat=new Cat();
  private Tiger tiger;
  private Panda panda;
  private List<String> books=new ArrayList<String>();
  private Set<String> hobbies=new HashSet<String>();
  private Map<String,String> works=new HashMap<String,String>();
  private Properties address=new Properties();

    public People() {
        super();
    }

    public People(Dog dog1) {
        this.dog = dog1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog1() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public Panda getPanda() {
        return panda;
    }

    public void setPanda(Panda panda) {
        this.panda = panda;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getWorks() {
        return works;
    }

    public void setWorks(Map<String, String> works) {
        this.works = works;
    }

    public Properties getAddress() {
        return address;
    }

    public void setAddress(Properties address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                ", tiger=" + tiger +
                ", panda=" + panda +
                ", books=" + books +
                ", hobbies=" + hobbies +
                ", works=" + works +
                ", address=" + address +
                '}';
    }
}
