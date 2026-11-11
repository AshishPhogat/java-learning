package com.ashish.lld.abstractfactory;

public class AdvancedPlayer {
    private ShoeFactory factory;
    private Shoe myshoes;


    public AdvancedPlayer(ShoeFactory factory) {
        this.factory = factory;
    }

    public void removeShoes(){
        if(myshoes != null){
            myshoes.remove();
            myshoes = null;
        }else{
            System.out.println("No shoes to remove");
        }

        return;
    }

    public void wearSportsShoe(){
        if(myshoes instanceof SportsShoe){
            System.out.println("Already wearing sports shoes");
            return;
        }
        if(myshoes != null) removeShoes();

        myshoes = factory.createSportsShoe();
        myshoes.wear();

    }

    public void wearCasualShoe(){
        if(myshoes!=null && !(myshoes instanceof SportsShoe)) {
            System.out.println("Already wearing casual shoes");
            return;
        }
        if(myshoes != null) removeShoes();
        myshoes = factory.createCasualShoe();
        myshoes.wear();
    }

    public void run() throws Exception{
        if(myshoes == null){
            throw new Exception("Can't Run: Player is not wearing any shoes");
        }

        if(myshoes instanceof SportsShoe){
            ((SportsShoe) myshoes).run();
        } else {
            throw new Exception("Player cannot run in casual shoes");
        }
    }

    public static void main(String[] args) {
        // Player wants to run.
        ShoeFactory factory1 = new AddidasFactory();
        ShoeFactory factory2 = new NikeFactory();
        AdvancedPlayer player = new AdvancedPlayer(factory1);
        // Player wants to wear sports shoe.
        try {
            player.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        player.wearSportsShoe();
        try {
            player.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Player wants to wear casual shoe.
        player.removeShoes();
        player.wearCasualShoe();
        try {
            player.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
