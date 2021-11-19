public class Merge {
  public Merge() {

  }
  public Merge(int[] obj) {
    long startTime = System.currentTimeMillis();
    mergeSort(obj);
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.println("Merge: " + executionTime);
    }
    
  public void mergeSort(int[] obj) {
    int[] temp = obj.clone();
    //Create Half of the array
    if (temp.length > 1) {
      int[] firstHalf = new int[temp.length/2];
      System.arraycopy(temp,0, firstHalf,0, temp.length/2);
      mergeSort(firstHalf);
      int secondHalfLength =temp.length - temp.length/2;
      int[] secondHalf = new int[secondHalfLength];
      System.arraycopy(temp, temp.length/2, secondHalf, 0 , secondHalfLength );
      mergeSort(secondHalf);
      merge(firstHalf,secondHalf,temp);

    }
  }
    public void merge(int[] list1,int[] list2, int[] temp){
      int current1 = 0;
      int current2 = 0;
      int current3 = 0;
      while ( current1 < list1.length && current2 <list2.length) 
      {
          if (list1[current1] < list2[current2])
            temp[current3++] = list1[current1++];
          else
            temp[current3++] = list2[current2++];
      }
      while (current1 <list1.length) 
        temp[current3++] = list1[current1++];
      while (current2 <list2.length) 
        temp[current3++] = list2[current2++];
    }
  
}