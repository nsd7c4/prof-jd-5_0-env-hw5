package com.rginc.profjd5_0envhw5;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//### Шаг 6
//
//Написать непроверяемое исключение, которое выбрасывается, если сотрудник не найден.
//
//Возвращает статус 404 Not Found.
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends Exception {

}
