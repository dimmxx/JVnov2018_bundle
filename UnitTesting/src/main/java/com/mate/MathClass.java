package com.mate;

public class MathClass {

    private int calls;

    public int getCalls() {
        return calls;
    }

    private void setCalls(int calls) {
        this.calls = calls;
    }

    public int sum (int num1, int num2){
        setCalls(getCalls() + 1);
        return num1 + num2;
    }

    public long factorial (int number){
        setCalls(getCalls() + 1);
        if(number < 0) throw new IllegalArgumentException();
        long result = 1;
        if(number > 1){
            for(int i = 1; i <= number; i++){
                result = result * i;
            }
        }
        return result;
    }


}
