import java.util.ArrayList;
import java.lang.Math;

/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/

public class projectEuler3{
  public projectEuler3(){
  }

  public static void main(String[] args){

    projectEuler3 p3 = new projectEuler3();
//    long foo = 15L;
    long foo = 600851475143L;
    p3.primeFactors(foo);
  }
  public long primeFactors(long largeNumber){
    long largestPrimeFactor = 1L;
    ArrayList<Long> primeNumbers = new ArrayList<Long>();
    primeNumbers.add(2L);
//    System.out.print(primeNumbers.get(0) + "\n");

    for (long i = 3L; i < Math.sqrt(largeNumber); i++)
    {

      boolean isPrime = true;
      if (largeNumber % i == 0)
      {
        for(int j = 0; j < primeNumbers.size(); j++)
        {
          if (primeNumbers.get(j) < Math.sqrt(largeNumber/i) && (largeNumber/i) % primeNumbers.get(j) == 0)
          {
            j += primeNumbers.size();
            isPrime = false;
          }
        }
        if (isPrime){
          primeNumbers.add(i);
          if (largeNumber % (largeNumber/i) == 0 && (largeNumber/i) > largestPrimeFactor)
          {
            largestPrimeFactor = (largeNumber/i);
          }
        }
      }

      isPrime = true;
      for (int j = 0; j < primeNumbers.size(); j++){
        if (primeNumbers.get(j) < Math.sqrt(i) && i % primeNumbers.get(j) == 0){
          j += primeNumbers.size();
          isPrime = false;
        }
      }
      if (isPrime){
        primeNumbers.add(i);
        if (largeNumber % i == 0 && i > largestPrimeFactor)
        {
          largestPrimeFactor = i;
        }
      }
    }
    System.out.print(largestPrimeFactor + "\n");
    return largestPrimeFactor;
  }

}
