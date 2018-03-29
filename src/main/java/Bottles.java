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
            Verse verse = new Verse();

            out.print(verse.beersOnWall(beers) + " of beer on the wall,");
            out.println(verse.beersOnWall(beers) + " of beer,");
            out.print(verse.actionAfterTake(beers));
            out.println(verse.beerLeftOnWall(beers) + " of beer on the wall.\r\n");
        }
    }

}