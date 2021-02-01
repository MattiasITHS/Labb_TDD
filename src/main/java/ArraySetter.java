public class ArraySetter {
    public int[] setZeroToOnes(int[] testArray) {
        int[] arrayFixed;
// om array är längre än 10 så kortas arrayen ner till 10.
        if(testArray.length > 10){
            arrayFixed = new int[10];
            for(int i = 0; i < 10; i++){
                arrayFixed[i] = testArray[i];
            }
        }else{
            // sätter alla platser till 1.
            arrayFixed = testArray;
            for(int i = 0; i < arrayFixed.length; i++){
                if(arrayFixed[i] == 0){
                    arrayFixed[i] = 1;
                }
            }
        }

        return arrayFixed;
    }
}
