public class Verse {


    public String actionAfterTake(int beer) {
        return beer==0 ? "Go to the store, buy some more," : "Take one down, pass it around,";
    }

    private String containers(int n){
        return n == 1 ? " bottle" : " bottles";
    }

    public int beerLeft(int beers) {
        return beers == 0 ? 99 : beers - 1;
    }

    public String beersOnWall(int beers) {
        return beers + containers(beers);
    }

    public String beerLeftOnWall(int beers) {
        return beerLeft(beers) + containers(beerLeft(beers));
    }
}
