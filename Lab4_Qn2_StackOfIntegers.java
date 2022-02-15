import javax.lang.model.util.Elements;

public class Lab4_Qn2_StackOfIntegers {
    private int[] elements;
    private int counter = 0;

    public Lab4_Qn2_StackOfIntegers() {
        this.elements = new int[16];
    }

    public Lab4_Qn2_StackOfIntegers(int size) {
        this.elements = new int[size];
    }

    public boolean empty(){
        if (counter== 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){
        //Counter is now 10, minus 1 as we are trying to return index 9 (last element)
        return elements[counter - 1];
    }

    public void push(int value){
        //Populate array with value passed in from Main class
        elements[counter] = value;
        //Increment of counter so that when the for loop runs again in Main class, it is populating the next index
        counter += 1;
    }

    public int pop(){
        //Assign variable 'value' to store value of last element of the array
        int value = elements[counter - 1];
        //After popping, replace the original value of the index to 0
        elements[counter-1] = 0;
        //Decrement of counter to return array values in reverse (since we pop from the last element first)
        counter -= 1;
        return value;
    }
}
