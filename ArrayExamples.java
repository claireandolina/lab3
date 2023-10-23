

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static int[] reverseInPlace(int[] arr) { //1,2,3,4,5
    for(int i = 0; i < arr.length/2; i += 1) { //only need to do for half the values to swap all
      int temp=arr[i]; //temp=1, 2
      arr[i]=arr[arr.length-i-1]; //arr[0] = 5, arr[1]=4
      arr[arr.length-i-1]=temp; //arr[4] = 1   //need a placeholder temp var and swap in-place or else the values will keep
                                              //overriding itself as it iterates through. after halfway through,
                                              //the array will have repeating values
    }
    return arr; //also needs return array
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) 
    { //
      newArray[i] = arr[arr.length-i-1]; //this should be say newArray[arr.length-i-1] = arr[i]. setting
                                       // old array equal to new array values now (which is empty)
      //new array's first index = arr's last index
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; } // shouldnt we return just the one element in the array?
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; } //find lowest element in array
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1); // BUG: must divide by arr.length - 2 because not including lowest element
  }


}

