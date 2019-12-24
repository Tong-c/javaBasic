package com.tong.logic.chapterFifteen.cooperation;

/**
 * @Description: 同時開始-表示比賽運動員的類
 * @Author: 仝闖
 * @Create: 2018/8/1 0001 下午 5:43
 */
public class Racer extends Thread {

    FireFlag fireFlag;

    public Racer(FireFlag fireFlag) {
        this.fireFlag = fireFlag;
    }

    @Override
    public void run() {
        try {
            this.fireFlag.waitForFire();
            System.out.println("start run " + Thread.currentThread().getName());
        } catch (InterruptedException e) {

        }
    }
}
