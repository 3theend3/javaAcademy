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
                out.print(actionAfterTake(beers));
                out.println("99" + containers(beers) + " of beer on the wall.\r\n");
                
            }
            else if(beers==1){

                out.print(beers + containers(beers) + " of beer on the wall,");
                out.println(beers + containers(beers) + " of beer,");
                out.print(actionAfterTake(beers));
                out.println(beerLeft(beers) + containers(beerLeft(beers)) + " of beer on the wall.\r\n");
            }else if (beerLeft(beers) == 1){

                out.print(beers + containers(beers) + " of beer on the wall,");
                out.println(beers + containers(beers) + " of beer,");
                out.print(actionAfterTake(beers));
                out.println(beerLeft(beers) + containers(beerLeft(beers)) + " of beer on the wall.\r\n");
            }
            else{
                out.print(beers + containers(beers) + " of beer on the wall,");
                out.println(beers + containers(beers) + " of beer,");
                out.print(actionAfterTake(beers));
                out.println(beerLeft(beers) + containers(beerLeft(beers)) + " of beer on the wall.\r\n");
            }
        }
    }

    public static String actionAfterTake(int beer) {
        return beer==0 ? "Go to the store, buy some more," : "Take one down, pass it around,";
    }

    public static int beerLeft(int beers) {
        return beers - 1;
    }

    private static String containers(int n){
        return n == 1 ? " bottle" : " bottles";
    }

}