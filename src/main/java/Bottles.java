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
            out.print(Verse.beersOnWall(beers) + " of beer on the wall,");
            out.println(Verse.beersOnWall(beers) + " of beer,");
            out.print(Verse.actionAfterTake(beers));
            out.println(Verse.beerLeftOnWall(beers) + " of beer on the wall.\r\n");
        }
    }

}