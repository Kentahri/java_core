package vt.java_core.map;

import vt.java_core.object.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
        if (ageCompare != 0) {
            return ageCompare;
    }
        return o1.getName().compareTo(o2.getName());
    }
}
