public class MyClass {

    public boolean generateTrue() {
        return true;
    }
    public boolean generateFalse() {
        return false;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int negative(int value) {
        return -(value);
    }
    public int subtract(int a, int b){
        return a - b ;
    }

    public int inc(int value) {
        int incValue = value;
        for(int i = 1; i < 10000; i++){
            incValue = incValue + value;
            System.out.println(incValue);
        }
        return incValue;
    }

}