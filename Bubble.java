
public class Bubble{
public Bubble(){

 }
public Bubble(int[] obj){
  long startTime = System.currentTimeMillis();
  int[] temp = obj.clone();

  for(int i=1; i < temp.length; i++) {

    for(int k= 0; k < temp.length - i;k++) {

      if (temp[k] > temp[k+1]) {
        
        int x = temp[k];
        int y = temp[k+1];
        temp[k] = y;
        temp[k+1] = x;
      }
    }
  }
  long endTime = System.currentTimeMillis();
  long executionTime = endTime - startTime;
  System.out.println("Bubble: " + executionTime);
 }
 /*
public String toString() { 

  return sd
 }
 public void sort(int[] obj){
   
 } */
}