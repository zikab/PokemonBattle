package pokemonbattle;
import java.util.Scanner;

//Written by Zainah Bokhari zikab@live.com for learning purposes only
//find code at github https://github.com/zikab/PokemonBattle.git

public class PokemonBattle {

    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        Trainer trainer1 = new Trainer("Ash",new Pokemon("poke1",100,25,""));
        Trainer brook = new Trainer("Misty",new Pokemon("Starmie",100,25,"water"));

        System.out.println("Professor Oak: Trainer, what is your name?");
        trainer1.name = inputString.nextLine();
        System.out.println("Professor Oak: Hello "+ trainer1.name+"! now Choose your pokemon's type (1-fire 2-grass 3-water) enter number: ");
        int type = inputInt.nextInt();
        while(trainer1.pokemon.type.equals("")){
            if(type==1){
                trainer1.pokemon.type = "fire";
                trainer1.pokemon.name="charmander";
            }else if(type==2){
                trainer1.pokemon.type = "grass";
                 trainer1.pokemon.name="bulbasaur";
            }else if(type==3){
                trainer1.pokemon.type = "water";
                 trainer1.pokemon.name="squirtle";
            }else{
                System.out.println("Professor Oak: invalid input");
                System.out.println("Professor Oak: please enter 1 or 2 or 3");
                type = inputInt.nextInt();
            }
        }
        System.out.println("Professor Oak: "+trainer1.name+", you are going to battle "+brook.name+", let's see who wins!");
        System.out.println("Professor Oak: let the battle begin!\n");
        trainer1.battle(brook);
    }
    
}
