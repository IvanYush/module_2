package homework5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Вор
 */
public class Thief {
    private BigDecimal money;

    private Thief() {
        this.money = BigDecimal.ZERO;
    }

    private void stealMoney(Bank bank, Thief thief) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, NoSuchFieldException {
        //узнаём какое количество денег у банка
        Class<Bank> bankClass = Bank.class;
        Field moneyBankField = bankClass.getDeclaredField("money");
        moneyBankField.setAccessible(true);
        Object bankMoneyCount = moneyBankField.get(bank);

        //передаём эти деньги вору
        Field thiefMoney = Thief.class.getDeclaredField("money");
        thiefMoney.setAccessible(true);
        thiefMoney.set(thief, bankMoneyCount);

        //обнуляем счёт банка
        Method bankMoney = bankClass.getDeclaredMethod("setMoney", BigDecimal.class);
        bankMoney.setAccessible(true);
        bankMoney.invoke(bank, BigDecimal.ZERO);
    }

    @Override
    public String toString() {
        return "Thief{" +
                "money=" + money +
                '}';
    }
}
