package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int firstSymbol = System.in.read();
        int secondSymbol;

        while (firstSymbol >= 0){
            secondSymbol = System.in.read();

            if (!(firstSymbol == 13 && secondSymbol == 10)){
                System.out.write(firstSymbol);
            }

            firstSymbol = secondSymbol;
        }
        System.out.flush();


    }
}
