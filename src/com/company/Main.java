package com.company;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class Main
{
    private static final DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main (String[] args) throws FileNotFoundException {
        Backpack backpack = new Backpack();
        System.out.println("Все наши предметы (Индекс, Цена, Вес, Удельная Ценность, Положен/Не положен): ");
        backpack.print();
        System.out.println("Максимально возможный вес - " + backpack.getMaxweight());
        while (backpack.max() != 0)
        {
            backpack.print();
            System.out.println("Текущий вес рюкзака - " + backpack.getSumweight());
            System.out.println("Текущая ценность рюкзака - " + backpack.getSum());
            System.out.println("Значение критерия ранца - " + df2.format(backpack.getSumepsilon()));
        }
    }
}
