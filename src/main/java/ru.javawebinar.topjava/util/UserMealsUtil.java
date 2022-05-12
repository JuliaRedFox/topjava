package ru.javawebinar.topjava.util;

import org.springframework.cglib.core.Local;
import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2022, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2022, Month.MAY, 30,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2022, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2022, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2022, Month.MAY, 30,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2022, Month.MAY, 30,20,0), "Ужин", 500));
                getFilteredMealsWithExceeded(mealList, LocalTime.of(7,0), LocalTime.of(12,0),2000);
            // .toLocalDate();
            //.toLocalTime();
    }
    public static List<UserMealWithExceed> getFilteredMealsWithExceeded(List<UserMeal> mealList){
        //TODO return List with correctly exceeded field
        return null;
    }
}
