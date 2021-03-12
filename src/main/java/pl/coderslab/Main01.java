package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main01 {

    public static void main(String[] args) {
        User user = new User("Maciej","maciejnowak@gmail.com","qwe123");

        UserDao userDao = new UserDao();
//        userDao.create(user);

        System.out.println(userDao.read(1));




    }


}
