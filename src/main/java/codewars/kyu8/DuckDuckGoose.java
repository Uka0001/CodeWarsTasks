package codewars.kyu8;

public class DuckDuckGoose {
    /*public static String duckDuckGoose(Player[] players, int goose) {
        // Note: Player objects have a String field called 'name'.
        int a=players.length;
        int b=goose%a-1;
        if(b<0){
            b=b+a;
        }
        return players[b].name;
    }*/
}
//BP
//return players[(goose - 1) % players.length].name;
