import java.util.Random;   

class Main {
  public static void main(String[] args) {

    Random random = new Random();
    int arr[] = new int[10000];
    for(int i=0; i < arr.length;++i) {
      arr[i] = random.nextInt(10);
    }
     //Generate 10,000 random numbers between 0-10
    System.out.println("//10k Numbers//");
    Insertion obj = new Insertion(arr);
    Bubble obj1 = new Bubble(arr);
    Merge obj2 = new Merge(arr);
    Quick obj3 = new Quick(arr);
    //HeapSort<E> obj4 = Arrays.asList(arr);
    Selection obj5 = new Selection(arr);
    
    int arr1[] = new int[20000];
    for(int i=0; i < arr.length;++i) {
      arr1[i] = random.nextInt(10);
    }
     //Generate 20,000 random numbers between 0-10
    System.out.println("//20k Numbers//");
    Insertion obj0 = new Insertion(arr1);
    Bubble obj11 = new Bubble(arr1);
    Merge obj22 = new Merge(arr1);
    Quick obj33 = new Quick(arr1);
    //HeapSort<E> obj44 = Arrays.asList(arr1);
    Selection obj55 = new Selection(arr1);

    int arr2[] = new int[30000];
    for(int i=0; i < arr.length;++i) {
      arr1[i] = random.nextInt(10);
    }
     //Generate 30,000 random numbers between 0-10
    System.out.println("//30k Numbers//");
    Insertion obj00 = new Insertion(arr2);
    Bubble obj111 = new Bubble(arr2);
    Merge obj222 = new Merge(arr2);
    Quick obj333 = new Quick(arr2);
    //HeapSort<E> obj444 = Arrays.asList(arr2);
    Selection obj555 = new Selection(arr2);

    int arr3[] = new int[40000];
    for(int i=0; i < arr.length;++i) {
      arr1[i] = random.nextInt(100);
    }
     //Generate 40,000 random numbers between 0-10
    System.out.println("//40k Numbers//");
    Insertion obj000 = new Insertion(arr3);
    Bubble obj1111 = new Bubble(arr3);
    Merge obj2222 = new Merge(arr3);
    Quick obj3333 = new Quick(arr3);
    //HeapSort<E> obj4444 = Arrays.asList(arr2);
    Selection obj5555 = new Selection(arr3);

    int arr4[] = new int[50000];
    for(int i=0; i < arr.length;++i) {
      arr1[i] = random.nextInt(10);
    }
     //Generate 50,000 random numbers between 0-10
    System.out.println("//50k Numbers//");
    Insertion obj0000 = new Insertion(arr4);
    Bubble obj11111 = new Bubble(arr4);
    Merge obj22222 = new Merge(arr4);
    Quick obj33333 = new Quick(arr4);
    //HeapSort<E> obj44444 = Arrays.asList(arr4);
    Selection obj55555 = new Selection(arr4);


    int arr5[] = new int[60000];
    for(int i=0; i < arr.length;++i) {
      arr1[i] = random.nextInt(10);
    }
     //Generate 60,000 random numbers between 0-10
    System.out.println("//60k Numbers//");
    Insertion obj00000 = new Insertion(arr5);
    Bubble obj111111 = new Bubble(arr5);
    Merge obj222222 = new Merge(arr5);
    Quick obj333333 = new Quick(arr5);
    //HeapSort<E> obj444444 = Arrays.asList(arr5);
    Selection obj555555 = new Selection(arr5);

    int arr6[] = new int[100000];
    for(int i=0; i < arr.length;++i) {
      arr1[i] = random.nextInt(10);
    }
     //Generate 100,000 random numbers between 0-10
    System.out.println("//100k Numbers//");
    Insertion obj000000 = new Insertion(arr6);
    Bubble obj1111111 = new Bubble(arr6);
    Merge obj2222222 = new Merge(arr6);
    Quick obj3333333 = new Quick(arr6);
    //HeapSort<E> obj4444444 = Arrays.asList(arr6);
    Selection obj5555555 = new Selection(arr6);

    
    
    
  }

}