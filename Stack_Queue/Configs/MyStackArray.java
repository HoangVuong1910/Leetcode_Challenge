package Stack_Queue.Configs;

public class MyStackArray implements IStackQueue {

    private int[] array;
    private int SIZE;
    private int topIndex;

    public MyStackArray(int size){
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    @Override
    public boolean push(int val) {
        // TODO Auto-generated method stub
        if(!isFull()){
            topIndex++;
            array[topIndex] = val;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if(!isEmpty()){
            int val = array[topIndex];
            topIndex--;
            return val;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return topIndex == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return topIndex < 0;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i = 0; i <= topIndex; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    
}
