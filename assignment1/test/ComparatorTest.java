import junit.framework.Assert;
import org.junit.Test;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

/**
 * Created by sayalija on 1/14/14.
 */
class AddPeople {

    public static List addPeopleToList(Person... persons) {
        List<Person> people = new ArrayList<Person>();
        Collections.addAll(people, persons);
        return people;
    }
}

public class ComparatorTest {
    Person Swamiji = new Person("Swamiji", 3);
    Person Kunal = new Person("Kunal", 50);
    Person Srijayantha = new Person("Srijayantha", 35);
    List people = AddPeople.addPeopleToList(Srijayantha, Kunal, Swamiji);

    @Test
    public void testCompareToByNameOfPerson() throws Exception {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        Assert.assertEquals(true, Kunal.equals(people.get(0)));
        Assert.assertEquals(true, Srijayantha.equals(people.get(1)));
        Assert.assertEquals(true, Swamiji.equals(people.get(2)));
    }
}
