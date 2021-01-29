public class BigClass {

    private int number = 0;
    private String text = null;

    public BigClass(){
        this(0,null);
    }

    public BigClass(int number){
        this.number = number;
    }

    public BigClass(String text){
        this.text = text;

    }
    public BigClass(int number, String text){
        this.number = number;
        this.text = text;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number >= 0 ){
            this.number = number;
        }else{
            System.out.println("Inga negativa tal!");
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void textUpperCase(String text){
        this.text = text.toUpperCase();
        System.out.println(text);
    }

    public String setTextNull(String text){
        return this.text = null;
    }

    public int add(int number1){
        if(number1 >= 0){
            this.number = this.number + number1;
        } else {
            System.out.println("Inga negativa tal!");
         }
        return number;
    }

    @Override
    public String toString() {
        return "BigClass{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
