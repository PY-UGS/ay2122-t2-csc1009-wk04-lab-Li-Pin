public class Lab4_Qn2_Main {
    public static void main (String[] args){
        Lab4_Qn2_StackOfIntegers stack = new Lab4_Qn2_StackOfIntegers(10);

        for(int i = 0; i < 10; i++){
            stack.push(i);
        }

        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
