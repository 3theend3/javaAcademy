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
            out.print(beersOnWall(beers) + " of beer on the wall,");
            out.println(beersOnWall(beers) + " of beer,");
            out.print(actionAfterTake(beers));
            out.println(beerLeftOnWall(beers) + " of beer on the wall.\r\n");
        }
    }

    public static String beerLeftOnWall(int beers) {
        return beerLeft(beers) + containers(beerLeft(beers));
    }

    public static String beersOnWall(int beers) {
        return beers + containers(beers);
    }

    public static String actionAfterTake(int beer) {
        return beer==0 ? "Go to the store, buy some more," : "Take one down, pass it around,";
    }

    public static int beerLeft(int beers) {
        return beers == 0 ? 99 : beers - 1;
    }

    private static String containers(int n){
        return n == 1 ? " bottle" : " bottles";
    }

}