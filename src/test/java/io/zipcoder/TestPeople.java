package io.zipcoder;

import io.zipcoder.People;
import io.zipcoder.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd() {
        Person adam = new Person(0, "Adam");
        Person bill = new Person(1, "Bill");
//        People<Person> ppl = new People<>();
//        ppl.add(adam);
//        ppl.add(bill);
//        Assert.assertTrue(ppl.count() == 2);
    }

    @Test
    public void testRemove() {
        Person adam = new Person(0, "Adam");
        Person bill = new Person(1, "Bill");
//        People<Person> ppl = new People<>();
//        ppl.add(adam);
//        ppl.add(bill);
//        ppl.remove(adam);
//        Assert.assertTrue(ppl.count() == 1);
    }

    @Test
    public void testFindById() {
        Person adam = new Person(0, "Adam");
        Person bill = new Person(1, "Bill");
//        People<Person> ppl = new People<>();
//        ppl.add(adam);
//        ppl.add(bill);
//        Assert.assertTrue(ppl.findById(0).equals(adam));
//        Assert.assertFalse(ppl.findById(1).equals(adam));
    }


}
