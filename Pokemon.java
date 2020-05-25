package pokemonbattle;

//Written by Zainah Bokhari zikab@live.com for learning purposes only
//find code at github https://github.com/zikab/PokemonBattle.git

public class Pokemon {
    String name;
    int health;
    int attack;
    String type;
    
    Pokemon(String name,int health,int attack,String type){
        this.name=name;
        this.health = health;
        this.attack=attack;
        this.type=type.toLowerCase();;
    }
    public void attack(Pokemon opponent){
        if(opponent.type.equals(type)){
            opponent.health = opponent.health-attack;
            System.out.println(name+" Attacked "+opponent.name+"\t -"+attack);
            stats(opponent);
        }else if(type.equals("fire") && opponent.type.equals("grass")){
            opponent.health = opponent.health-(attack*2);
            System.out.println(name+" Attacked "+opponent.name+"\t -"+(attack*2));
            stats(opponent);
        }else if(type.equals("grass") && opponent.type.equals("water")){
            opponent.health = opponent.health-(attack*2);
            System.out.println(name+" Attacked "+opponent.name+"\t -"+(attack*2));
            stats(opponent);
        }else if(type.equals("water") && opponent.type.equals("fire")){
            System.out.println(name+" Attacked "+opponent.name+"\t -"+(attack*2));
            opponent.health = opponent.health-(attack*2);
            stats(opponent);
        }else{
            opponent.health = opponent.health-(attack/2);
            System.out.println(name+" Attacked "+opponent.name+"\t -"+(attack/2));
            stats(opponent);
        } 
    }
    public void stats(Pokemon opponent){
        System.out.println(name+"'s health= "+health+"\t"+opponent.name+"'s health= "+opponent.health);
    }
}
