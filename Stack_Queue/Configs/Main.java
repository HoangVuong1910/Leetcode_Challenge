package Stack_Queue.Configs;

public class Main {
    
    public static void main(String[] args) {
        // MyStackArray myStackArray = new MyStackArray(3);
        // myStackArray.push(1);
        // myStackArray.push(2);
        // myStackArray.push(3);
        // myStackArray.push(4);
        // myStackArray.show();

        // myStackArray.pop();
        // myStackArray.show();
        // myStackArray.pop();
        // myStackArray.show();
        // myStackArray.pop();
        // myStackArray.show();

        MyQueueArray myQueueArray = new MyQueueArray(3);
        myQueueArray.push(1);
        myQueueArray.push(2);
        myQueueArray.push(3);
        myQueueArray.push(4);
        myQueueArray.show();

        myQueueArray.pop();
        myQueueArray.show();
        myQueueArray.pop();
        myQueueArray.show();
        myQueueArray.pop();
        myQueueArray.show();

    }
}
