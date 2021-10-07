package designpatterns.observerDP;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private String message;
    List<Observer> observers;

    public MyTopic() {
        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer obj : observers) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }
    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:" + msg);
        this.message=msg;
        notifyObservers();
    }

}
