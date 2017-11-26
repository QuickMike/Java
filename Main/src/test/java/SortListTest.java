
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortListTest {

    @Test
    public void testCorrectTrueListDelDIE() throws Exception {
        Person person = new Person() {
            @Override
            public boolean action(Person person, Object action, boolean enemy) {
                return false;
            }
        };
        person.setHealth(0);
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(person);
        person = new Person() {
            @Override
            public boolean action(Person person, Object action, boolean enemy) {
                return false;
            }
        };
        list.add(person);
        boolean expected = true;
        boolean result = SortList.listDelDIE(list);
        assertThat(result, is (expected));

    }

    @Test
    public void testCorrectFalseListDelDIE() throws Exception {
        Person person = new Person() {
            @Override
            public boolean action(Person person, Object action, boolean enemy) {
                return false;
            }
        };
        person.setHealth(1);
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(person);
        boolean expected = false;
        boolean result = SortList.listDelDIE(list);
        assertThat(result, is (expected));
    }
}