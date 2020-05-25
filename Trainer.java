package pokemonbattle;

//Written by Zainah Bokhari zikab@live.com for learning purposes only
//find code at github https://github.com/zikab/PokemonBattle.git

public class Trainer {
    Pokemon pokemon;
    String name;
    Trainer(String name, Pokemon pokemon){
        this.name=name;
        this.pokemon=pokemon;
    }
    public void battle(Trainer opponent){
        int turn=1;
        while(!(pokemon.health<=0) && !(opponent.pokemon.health<=0)){
            if(turn==1){
                pokemon.attack(opponent.pokemon);
                turn=2;
            }else{//turn==2
                opponent.pokemon.attack(pokemon);
                turn=1;
            }
        }
        if(pokemon.health<=0){
            System.out.println("\n"+opponent.name+" have won the battle!");
        }else{
            System.out.println("\n"+name+" have won the battle!");
        }
    }
}
