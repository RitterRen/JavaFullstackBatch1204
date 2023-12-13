package Question4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<User> list = Arrays.asList(
                new User(1, 30),
                new User(2, 30),
                new User(3, 28)
        );
        // sort users by age, if two users have the same age, then sort by id. All in ascending order
        Collections.sort(list, (user1, user2) -> {
            if (user1.age == user2.age) {
                return user1.id - user2.id;
            }

            return user1.age - user2.age;
        });

        System.out.println(list);
    }
}
