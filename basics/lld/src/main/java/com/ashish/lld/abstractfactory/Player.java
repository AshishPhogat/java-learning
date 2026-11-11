package com.ashish.lld.abstractfactory;

// wrong to manage state using a string variable.
public class Player {

    private SportsShoe sportsshoe;
    private Shoe casualshoe;
    private String occasion;

    public Player(ShoeFactory factory){
        sportsshoe = factory.createSportsShoe();
        casualshoe = factory.createCasualShoe();
    }

    public void wearSportsShoe(){
        occasion = "Sports";
        sportsshoe.wear();
    }

    public void wearCasualShoe(){
        occasion = "Casual";
        casualshoe.wear();
    }

    public void removeShoe(){
        if(occasion.equals("Sports")){
            sportsshoe.remove();
        } else {
            casualshoe.remove();
        }
    }

    public void run() throws Exception{
        if(occasion.equals("Sports")){
            sportsshoe.run();
        } else {
            throw new Exception("Player cannot run in casual shoes");
        }
    }



    public static void main(String[] args) {
        // Player wants to run.
        ShoeFactory factory1 = new AddidasFactory();
        ShoeFactory factory2 = new NikeFactory();
        Player player = new Player(factory1);
        // Player wants to wear sports shoe.
        player.wearSportsShoe();
        try {
            player.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Player wants to wear casual shoe.
        player.removeShoe();
        player.wearCasualShoe();
        try {
            player.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
