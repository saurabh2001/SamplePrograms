package designpatterns.observerDP;

public class TopicClient {
    public static void main(String[] args) {
        // Ref: https://www.journaldev.com/1739/observer-design-pattern-in-java
        Subject topic = new MyTopic();
        Observer obj1 = new MyTopicSubscriber("saurabh");
        Observer obj2 = new MyTopicSubscriber("raj");

        topic.register(obj1);
        topic.register(obj2);

        obj1.setSubject(topic);
        obj2.setSubject(topic);

        topic.postMessage("Tu tuu tu tuu");
    }
}
