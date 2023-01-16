package videoCourse_02.lessons.lesson07_multithreading.synchronizer.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.SCISSORS);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.SCISSORS);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.STONE);
        friend2Action.add(Action.STONE);
        new BestFriend("Ivan", friend1Action, exchanger);
        new BestFriend("Petr", friend2Action, exchanger);
    }
}

enum Action {
    STONE, SCISSORS, PAPER
}

class BestFriend extends Thread {
    private final String name;
    private final List<Action> myActions;
    private final Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.STONE && friendAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && friendAction == Action.PAPER)
                || (myAction == Action.PAPER && friendAction == Action.STONE)) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}