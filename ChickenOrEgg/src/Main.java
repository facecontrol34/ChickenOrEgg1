public class Main {

    public static void main(String[] args) {

        EggWout eggWout = new EggWout();
        eggWout.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            System.out.println("Курица!");
        }


        if(eggWout.isAlive()){
            try {
                eggWout.join();
            }catch (InterruptedException ex){}
            System.out.println("Спор окончен. Победило яйцо!");
        }else{
            System.out.println("Спор окончен. Победила курица!");
        }
    }
}
class EggWout extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
            }
            System.out.println("Яйцо!");
        }
    }
}
