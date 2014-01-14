import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by sayalija on 1/14/14.
 */
public class PersonEqualsAndHashCodeTest {

    @Test
    public void testHashCodeWillReturnTrueForSamePersonTwoTimes() throws Exception {
        Person Swamiji = new Person("Swamiji", 34);
        int hash1 = Swamiji.hashCode();
        int hash2 = Swamiji.hashCode();
        Assert.assertEquals(true, hash1 == hash2);
    }

    @Test
    public void testHashCodeWillReturnFalseForDifferentPersons() throws Exception {
        Person Swamiji = new Person("Swamiji", 34);
        Person Kunal = new Person("Kunal", 25);
        int hash1 = Swamiji.hashCode();
        int hash2 = Kunal.hashCode();
        Assert.assertEquals(false, hash1 == hash2);
    }

    @Test
    public void testEqualsReturnTrueForSameObject() throws Exception {
        Person p1 = new Person("Swamiji", 34);
        Person p2 = new Person("Swamiji", 34);
        Assert.assertEquals(true, p1.equals(p2));
    }

    @Test
    public void testEqualsReturnFalseForDifferentObject() throws Exception {
        Person Swamiji = new Person("Swamiji", 34);
        Person Kunal = new Person("Kunal", 25);
        Assert.assertEquals(false, Swamiji.equals(Kunal));
    }

}
