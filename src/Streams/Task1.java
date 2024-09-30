package Streams;

import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("1", "John", List.of(new Order("1", 100), new Order("2", 200))),
                new User("2", "Mike", List.of(new Order("3", 300), new Order("4", 400))),
                new User("3", "Alex", List.of(new Order("5", 1500), new Order("6", 600))),
                new User("3", "Alexander", List.of(new Order("5", 1500), new Order("6", 600))),
                new User("4", "Jim", Collections.emptyList())
        );

//        List<String> id = users.stream()
//                .filter(n -> !n.getOrders().isEmpty())
//                .map(User::getId)
//                .distinct()
//                .peek(System.out::println)
//                .collect(Collectors.toList());

//        List<Order> orders = users.stream()
//                .flatMap(user -> user.getOrders().stream())
//                .filter(order -> order.getAmount() > 100)
//                .toList();

//        Integer sum = users.stream()
//                .flatMap(user -> user.getOrders().stream())
//                .map(order -> order.getAmount())
//                .reduce((x, y) -> x + y)
//                .get();
//
//        Integer sum1 = users.stream()
//                .flatMap(user -> user.getOrders().stream())
//                .mapToInt(Order::getAmount)
//                .sum();

//        List<String> list = users.stream()
//                .filter(user -> user.getOrders().stream()
//                        .mapToInt(Order::getAmount).sum() > 1000)
//                .map(user -> user.getId())
//                .distinct()
//                .collect(Collectors.toList());
//
//        List<User> users2 = users.stream()
//                .filter(user -> user.getOrders().stream()
//                        .mapToInt(Order::getAmount).sum() > 1000)
//                .distinct()
//                .collect(Collectors.toList());
//
//        Map<String, List<Order>> map = users.stream()
//                .collect(Collectors.toMap(user -> user.getId(), user -> user.getOrders(), (x, y) -> y));


//        Map<String, Integer> map1 = users.stream()
//                .collect(Collectors.toMap(user -> user.getId(), user -> user.getOrders()
//                        .stream().mapToInt(Order::getAmount).sum(), (x, y) -> y));
//        System.out.println(map1);


//        List<User> userList = users.stream()
//                .sorted((x , y) -> y.getOrders().stream().mapToInt(Order::getAmount).sum() -
//                        x.getOrders().stream().mapToInt(Order::getAmount).sum())
//                .distinct()
//                .toList();
//
//        System.out.println(userList);
        //попробовать через Comparable!!!

    }

    //Task1 - Отфильтровать пользователей и вывести идентификаторы тех, у которых есть хотя бы один заказ




//Task2 - Вывести список всех заказов с amount больше 100





//Task3 - Посчитать общий общую сумму по всем заказам





//Task4 - Вывести список идентификаторов пользователей, у которых сумма заказов больше 1000




//Task5 - вывести мапу всех заказов по id пользователя





//Task6 - вывести мапу, где ключ - объект пользователя, значение - сумма заказов




//Task7 - вывести список пользователей отсортированный по убыванию суммы заказов




//Task8 - сгруппировать пользователей по именам. Вывести число повторений
}

