package ru.job4j.max;

/**
 * Created by artursafiullin on 2017-02-27.
 */
public class Max {
    public int maxNumber;

    public int max(int first, int second) {

        this.maxNumber = first > second ? first : second;
        return getResult();
    }

    public int getResult() {
        return maxNumber;
    }
    public int max(int first, int second, int third) {

        int maxOneTwo = this.max(first, second);
        int result = this.max(maxOneTwo, third);
        return result;
    }
    //public class MaxBad {

      //  public int max(int one, int two) {
       //     return one > two ? one : two;
      //  }

       // public int max(int one, int two, int three) {
       //     return max(one, max(two, three));
       // }
    }

    //public void max (int first, int second, int maxNumber2) {

        //return maxNumber > maxNumber2 ? maxNumber : maxNumber2;

    //public int max(int a, int b, int c) {
        //return max(a, max(b, c));
    //}


    //public void showNumber() {
    //    System.out.println("Max number is  : " + maxNumber);
    //}


//}
