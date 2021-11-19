public class Insertion{
public Insertion(){
  
}
public Insertion(int[] obj){
   long startTime = System.currentTimeMillis();
   int[] temp = obj.clone();
   for(int i=0;i <temp.length;++i) {
   int current = temp[i];
    int k = 0;
    for( k = i-1; k >= 0 && temp[k] > current; k--) {
      temp[k+1] = current;
    }
   }
  long endTime = System.currentTimeMillis();
  long executionTime = endTime - startTime;
  System.out.println("Insertion: " + executionTime);
}
  
}