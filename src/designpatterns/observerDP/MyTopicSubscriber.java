package designpatterns.observerDP;

public class MyTopicSubscriber implements Observer {
    String subscriberName;
    Subject subscribedTopic;

    public MyTopicSubscriber(String name) {
        this.subscriberName = name;
    }
    @Override
    public void update() {
        String msg = (String) subscribedTopic.getUpdate(this);
        System.out.println(subscriberName+":: Consuming message::"+ msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.subscribedTopic = sub;
    }
}
