import java.io.PrintStream;

class Bottles
{
    public static void main(String args[])
    {
        writeLyrics(System.out);
    }

    public static void writeLyrics(PrintStream out) {
        for (int beers=99; beers>-1;beers--)
        {
            if (beers==0)
            {
                out.print(beers + containers(beers) + " of beer on the wall,");
                out.println(beers + containers(beers) + " of beer,");
                out.print("Go to the store, buy some more,");
                out.println("99" + containers(beers) + " of beer on the wall.\r\n");
                
            }
            else if(beers==1){

                out.print(beers + containers(beers) + " of beer on the wall,");
                out.println(beers + containers(beers) + " of beer,");
                out.print("Take one down, pass it around,");
                out.println(beers-1 + containers(beers-1) + " of beer on the wall.\r\n");
            }else if (beers - 1 == 1){

                out.print(beers + containers(beers) + " of beer on the wall,");
                out.println(beers + containers(beers) + " of beer,");
                out.print("Take one down, pass it around,");
                out.println(beers-1 + containers(beers-1) + " of beer on the wall.\r\n");
            }
            else{
                out.print(beers + containers(beers) + " of beer on the wall,");
                out.println(beers + containers(beers) + " of beer,");
                out.print("Take one down, pass it around,");
                out.println(beers-1 + containers(beers-1) + " of beer on the wall.\r\n");
            }
        }
    }

    private static String containers(int n){
        return n == 1 ? " bottle" : " bottles";
    }

}