//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 double [] numbers = {1.0,2,-3,4,5,6,7,-8,9,-10,11,-12,13,-14,15};
         boolean numbers1 =false;
         int sum = 0;
         int num = 0;
         for(double number:numbers){
             if ( number<0){
                 numbers1=true;
             }if (number > 0){
                 num+=1;
                 sum+=number;
             }
         }
        System.out.println(sum/num);
    }
}