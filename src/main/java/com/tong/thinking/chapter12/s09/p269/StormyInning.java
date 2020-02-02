package com.tong.thinking.chapter12.s09.p269;

public class StormyInning extends Inning implements Storm {


    public StormyInning() throws BaseballException {

    }

    public StormyInning(String s) throws Foul, BaseballException {

    }

    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void event() {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    public void walk() {

    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul popFoul) {
            System.out.println("Pop Foul");
        } catch (BaseballException e) {
            System.out.println("general base exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike strike) {
            strike.printStackTrace();
        } catch (Foul foul) {
            foul.printStackTrace();
        } catch (BaseballException e) {
            e.printStackTrace();
        }

    }
}
