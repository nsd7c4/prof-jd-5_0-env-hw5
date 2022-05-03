package com.rginc.profjd5_0envhw5;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//### Шаг 8
//
//Написать непроверяемое исключение, которое выбрасывается, если в массиве есть сотрудник, когда сотрудника пытаются добавить в массив.
//
//Возвращает статус 400 Bad Request.
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExistedEmployee extends Exception {
}
