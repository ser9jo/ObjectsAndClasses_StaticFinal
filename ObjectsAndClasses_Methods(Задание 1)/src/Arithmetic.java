public class Arithmetic {
    public int a;
   public int b;

   public Arithmetic(int firstNum, int secondNum) {
       this.a = firstNum;
       this.b = secondNum;
   }

   public int addition () {
       return a + b;
   }

   public int muptiplication () {
       return a * b;
   }

   public int max () {
       return a > b ? a : b;
   }

   public int min () {
       return a < b ? a : b;
   }
}

