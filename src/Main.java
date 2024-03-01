  class clock{
    private int second;
    private int minute;
    private int hour;
    public clock(){
        second=0;
        minute=0;
        hour=0;
    }
    class test{
        clock a=new clock();

    }
    public void increse(){
        second+=1;
        if(second==60){
            second=0;
            minute+=1;
            if(minute==60){
                minute=0;
                hour+=1;
                if(hour==24){
                    hour=0;
                }
            }
        }
    }
    public void display(){
        System.out.println((hour>9 ? hour:"0"+hour) +":" + (minute>9 ? minute:"0"+minute)+":"+(second>9 ? second:"0"+second));
    }
}
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        clock clock1=new clock();
//        for(int i=0;i<24;i++){
//            for(int j=0;j<60;j++){
//                for(int k=0;k<61;k++){
//                    clock1.display();
//                    clock1.increse();
//                }
//            }
//        }
        int a=0;
        while (true){
            System.out.print(a);
            a++;
        }
    }
}