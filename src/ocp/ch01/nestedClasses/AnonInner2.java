package OCP.ch01.nestedClasses;

public class AnonInner2 {

    interface SaleTodayOnly {

        int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
