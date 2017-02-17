package party.infoo.spring.IOC;

/**
 * Created by infoo on 2017/2/18.
 */
public class Work {
    private People people;

    public void doWork() {
        people.doWork();
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
}
