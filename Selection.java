public class Selection {
  public Selection() {

  }
  public Selection(int[] obj) {
    long startTime = System.currentTimeMillis();
    sort(obj);
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.println("Selection: " + executionTime);
  }
  public void sort(int[] list) {
    for(int i = 0; i<list.length -1;i++) {
      int currentMin = list[i];
      int currentMinIndex = i;
    for(int j= i +1;j <list.length;j++) {
      if (currentMin > list[j]) {
        currentMin = list[j];
        currentMinIndex = j;
      }
    }
    if (currentMinIndex != i) {
      list[currentMinIndex] = list[i];
      list[i] = currentMin;
    }
    }
  
  }

}