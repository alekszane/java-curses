package main;/*
* Класс реализует калькулятор
* */

public class Calculator{
    /*результат вычисления*/

    private int result;

    /*Суммируем аргуенты
    @param  и params аргументы суммирования*/

    public void add (int ... params){
        for (Integer param : params){
            this.result += param;
        }
    }

    /*Получить результат
    @return результат вычисления*/

    public int getResult(){
        return this.result;
    }
    /*Очистить результат вычислений*/

    public void cleanResult(){
        this.result = 0;
    }

}