package function;

public class calc{
  public String getResult(int a, int b){
    double sum=a + b;
    double div=sum/2;
    double mul=div*10000;
    if(mul > 200){
      return "greater than 200";
    }
    else {
        return "less than 200";
    }
  }
}
    