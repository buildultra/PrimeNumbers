public class PrimeNumbers {

    public static void main (String[] args)
    {
        int i = 0;
        int num = 0;
        int display = 100;
        String  prime = "";

        for (i = 1; i <= display; i++)
        {
            int counter = 0;

            for(num = i; num >= 1; num--)
            {
                if(i % num == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                //Appended the Prime number to the String
                prime = prime + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(prime);
    }
}
