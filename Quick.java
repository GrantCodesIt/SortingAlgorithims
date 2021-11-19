public class Quick {
  public Quick() {

  }
  public Quick(int[] obj) {
    long startTime = System.currentTimeMillis();
    quickSort(obj);
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.println("Quick: " + executionTime);
  }
  public void quickSort(int[] list) {
    quickSort(list, 0, list.length -1);
  }
  public void quickSort(int[] list,int first, int last){
    if (last > first) {
      int pivotIndex = partition(list, first, last);
      if((pivotIndex - first) <= (last-pivotIndex)) {
      quickSort(list, first, pivotIndex -1);
      first = pivotIndex +1;
      }
      else {
      quickSort(list, pivotIndex +1 , last);
      last = pivotIndex -1;
      }
    }
  }
  public int partition(int[] list, int first, int last) {
    int pivot = list[first+(last-first)/2];
    int low = first +1;
    int high = last;
    while ( high > low) {
      while ( low <= high && list[low] <= pivot)
        low++;
      while (low <= high && list[high] > pivot)
        high--;
      if( high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
    }
    while ( high > first&& list[high] >= pivot)
      high--;
    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      return high;
    }
    else { return first;}
  }
}