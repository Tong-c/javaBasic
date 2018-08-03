package com.tong.logic.chapterFifteen.lock;

 /**
   * @Description:    轉賬的錯誤寫法
   * @Author:     仝闖
   * @Create:     2018/8/3 0003 下午 5:45
   */
public class AccountMgr {

    public static class NoEnoughMoneyException extends Exception{}

    public static void transfer(Account from , Account to ,double money) throws NoEnoughMoneyException {
        from.lock();
        try{
            to.lock();
            try {
                if (from.getMoney() >= money){
                    from.reduce(money);
                    to.add(money);
                }else {
                    throw new NoEnoughMoneyException();
                }
            }finally {
                to.unlock();
            }
        }finally {
            from.unlock();
        }
    }


    public static boolean tryTransfer(Account from, Account to, double money) throws NoEnoughMoneyException {
        if(from.tryLock()){
            try {
                if(to.tryLock()){
                    try {
                        if(from.getMoney() >= money){
                            from.reduce(money);
                            to.add(money);
                        }else {
                            throw new NoEnoughMoneyException();
                        }
                    }finally {
                        to.unlock();
                    }
                }
            }finally {
                from.unlock();
            }
        }
        return false;
    }
}
