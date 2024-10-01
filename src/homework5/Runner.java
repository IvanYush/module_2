package homework5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        
        //Запрещено изменять модификаторы доступа!
        //Практически все будет через рефлексию
        //Создать банк с 1500 денег
        //Создать вора
        //Дописать метод stealMoney у вора так, чтобы он крал все деньги из банка себе
        //(увеличивал у себя деньги и обнулял деньги банка)
        //Вызвать здесь метод stealMoney
        //Распечатать вора и банк

        //Итог:
        //Вор - 1500 денег
        //Банк - 0 денег

        Bank bank = createBank(BigDecimal.valueOf(1500));
        Thief thief = createThief();
        System.out.println(bank + " и " + thief + " до ограбления");
        stealMoneyStart(thief, bank);
        System.out.println(bank + " и " + thief + " после ограбления");
    }

    //Создать банк
    private static Bank createBank(BigDecimal money) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Constructor<Bank> bankConstructor = bankClass.getDeclaredConstructor(BigDecimal.class);
        bankConstructor.setAccessible(true);
        return bankConstructor.newInstance(money);
    }

    //Создать вора
    private static Thief createThief() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Constructor<Thief> thiefConstructor = thiefClass.getDeclaredConstructor();
        thiefConstructor.setAccessible(true);
        return thiefConstructor.newInstance();
    }

    //запуск метода stealMoney
    private static void stealMoneyStart(Thief thief, Bank bank) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Method stealMoney = thiefClass.getDeclaredMethod("stealMoney", Bank.class, Thief.class);
        stealMoney.setAccessible(true);
        stealMoney.invoke(thief, bank, thief);
    }
}
