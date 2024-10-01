interface bank{
    void SBI implements bank{
        double r,amt,interest;
        void calculate interest()
        {
            r=0.7;
            interest=amt*r;
            
        }
    }
    classs axis implements bank
    {
        double r,amt,interrest;
        void calculateinterest()
        {
            r=0.12,amt=10,000;
            interest=amt*r;
            System.out.println("interest"+interest);
        }
    }
    class driver
    {
        public static void main(String[]args)
        {
            SBI sbi=new SBI();
            sbi.calculate interest();
            axis a=new axis();
            a.calculateinterest();
        }
    }
