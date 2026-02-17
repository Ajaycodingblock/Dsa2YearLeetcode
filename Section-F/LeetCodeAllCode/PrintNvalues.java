class PrintNvalues{
    static int sumAll(int n) { 
    if (n == 10)
    {
       return 55; 
    }
    return n + sumAll(n-1);
    
    }
    public static void main(String[] args) {
        System.out.println(sumAll(8));
  
    }
}
