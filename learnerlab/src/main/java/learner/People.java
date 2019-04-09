package learner;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class People {

    ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        Person wantedPerson = null;
        for (Person i : personList) {
            if (i.equals(id)) {
                wantedPerson = i;
            }
        }
        return wantedPerson;
    }

    public boolean contains(Person person){
        for(Person i : personList){
            if(i.equals(person)){
                return true;
            }
        }
        return false;
    }

    public void remove(Person person){
        for(Person i : personList){
            if(i.equals(person)){
                personList.remove(i);
            }
        }
    }

    public void remove(long id){
        for(Person i : personList){
            if(i.getId() == id){
                personList.remove(i);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Object[] toArray(){
        Object[] person = personList.toArray();
        return person;
    }


}
