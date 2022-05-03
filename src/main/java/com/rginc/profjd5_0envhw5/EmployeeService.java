package com.rginc.profjd5_0envhw5;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//### Шаг 4
//
//Создать сервис EmployeeService, который хранит внутри поле с массивом сотрудников.
@Service
public class EmployeeService {
    private Employee book[] = new Employee[10];

    //5.1 Добавить сотрудника.
    public String addEmployee(String firstName, String lastName) throws EmployeeBookIsFull, ExistedEmployee {
        boolean full = true;
        String result = new String();
        Employee e = new Employee(firstName, lastName);
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                full = false;
                book[i] = e;
                result = e.toString();
                break;
            } else {
                if (e.equals(book[i])) {
                    throw new ExistedEmployee();
                }
            }
            if (full) {
                throw new EmployeeBookIsFull();
            }
        }
        return result;
    }


    //5.2. Удалить сотрудника.
    public String removeEmployee(String firstName, String lastName) throws EmployeeNotFound {
        String result = "1";
        Employee e = new Employee(firstName, lastName);
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].equals(e)) {
                    book[i] = null;
                    result = e.toString();
                    break;
                }
            } else {
                throw new EmployeeNotFound();
            }
        }
        return result;
    }

    //5.3. Найти сотрудника.
    public String findEmployee(String firstName, String lastName) throws EmployeeNotFound {
        String result = "2";
        Employee e = new Employee(firstName, lastName);
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].equals(e)) {
                    result = e.toString();
                    break;
                }
            } else {
                throw new EmployeeNotFound();
            }
        }
        return result;
    }

    public String allEmployee() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            result.append(book[i] + "\n");
        }
        return result.toString();
    }
}
