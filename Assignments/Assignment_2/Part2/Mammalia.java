/*
 * Author: Fowzy Alsaud
 * Date: Oct, 9th, 2021
 * Class: CMPS 4143 - Dr. Das
 * Description:
This class will shows the Mammalia (parent) and shows the reset of the tree which we're going to inheritane the main features from  the Mammalia parent
like: legs, tails, brian, neurons, precision, precision, birthDate, favorite Foods and as we can see I have created eat, walk sleep, give_birth functions as required
I made a default constructor that will made other sub classes use later and be able to change the neurons precision and food later, also I built accesser and one
function to change the requiremtns "the neurons, precision and food", so other sub classes will be able to update the value of their animals that I will create later
reset of the code is normal is the sub classes and default constructor.
*/
class Mammalia{
    // VARIABLES FOR THE PARENT CLASS
    int legs;               // STORE THE NUMBER OF THE LEGS 
    boolean tails;          // STORE IF THERE IS A TAILS OR NOT
    boolean brain;          // STORE IF THERE IS BRAIN: TRUE OR FALSE
    int neurons;            // STORES THE NEURONS
    double precision;       // STORE THE PRECISION
    int birthDate;          // STORE THE BIRTH DATE
    String favoriteFoods;   // STORE ANIMAL' FAVORITE FOOD

    // FUNCTION TELLS YOU IF THE ANIMAL BUSY EATING
    public void eat(){
        System.out.println("I'm eating.");
    }
    // FUNCTION TELLS YOU IF THE ANIMALS IS MOVING/WALKING
    public void walk(){
        System.out.println("I'm walking.");
    }
    // FUNCTION TELLS YOU IF THE ANIMAL IS ASLEEP
    public void sleep(){
        System.out.println("Sleeping... ");
    }
    // FUNCTION TELLS YOU IF THE ANIMAL GIVING A BIRTH
    public void give_birth(){
        System.out.println("I'm giving a birth");
    }

    public Mammalia(){}
    // DEF. CONSTRUCTOR 
    public Mammalia(int neurons, double precision, String favoriteFoods){
        this.neurons = neurons;
        this.precision = precision;
        this.favoriteFoods = favoriteFoods;
    }
    // FUNCTION WILL HELPS ME LATER TO CHANGE THE FOLLOWING  the neurons, precision and food
    public void firstChange(int neur, double prec, String favFood){
        this.neurons = neur;
        this.precision = prec;
        this.favoriteFoods = favFood;
    }
    // ACCESSER TO NEURONS
    public int getNeurons(){
        return neurons;
    }
    // ACCESSER TO PRECISION
    public double getPrecision(){
        return precision;
    }
    // ACCESSOR TO FAVORITE FOOD
    public String favoriteFoods(){
        return favoriteFoods;
    }
    // TO GET ALL DATA ON THE CONSOLE
    public void getAllData(){
        System.out.print(neurons+" ");
        System.out.print(precision+" ");
        System.out.print(favoriteFoods+" \n");
    }
}
/**
* Change at least 10 animals’ running speed, hunting process
* and hunting food type for those who are 6-8 level animals.
*/
class Monotremata extends Mammalia{
    public Monotremata(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Theria extends Mammalia{
    public Theria(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Marsupialia extends Theria{
    public Marsupialia(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Placentalia extends Theria{
    public Placentalia(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Atlantogenata extends Placentalia{
    public Atlantogenata(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Boreoeutheria extends Placentalia{
    public Boreoeutheria(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Afrotheria extends Atlantogenata{
    public Afrotheria(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Xenarthra extends Atlantogenata{
    public Xenarthra(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Euarchontoglires extends Boreoeutheria{
    public Euarchontoglires(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Laurasiatheria extends Boreoeutheria{
    public Laurasiatheria(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Euarchonta extends Euarchontoglires{
    public Euarchonta(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Glires extends Euarchontoglires{
    public Glires(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Scrotifera extends Laurasiatheria{
    public Scrotifera(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Eulipotyphia extends Laurasiatheria{
    public Eulipotyphia(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Chirpotera extends Scrotifera{
    public Chirpotera(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Euungulata extends Scrotifera{
    public Euungulata(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Ferae extends Scrotifera{
    public Ferae(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
// LEVEL 8 AS REQUIRED
// in this sub class I added a speed, hunting Type and hunting process as required and made different default Constructor to be able to update these extra features
class Cetartiodactyla extends Euungulata{
    int speed = 0;
    String huntingType;
    String huntingProcess;
    public Cetartiodactyla(int _neurons, double _precision, String _favoriteFoods, int _speed, String _huntingType, String _huntingProcess){
        super(_neurons, _precision, _favoriteFoods);
        speed = _speed;
        huntingType = _huntingType;
        huntingProcess = _huntingProcess;
    }
}
class Perissodactyla extends Euungulata{
    public Perissodactyla(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
class Pholidota extends Ferae{
    public Pholidota(int _neurons, double _precision, String _favoriteFoods){
        super(_neurons, _precision, _favoriteFoods);
    }
}
// LEVEL 8 AS REQUIRED
// in this sub class I added a speed, hunting Type and hunting process as required and made different default Constructor to be able to update these extra features
class Carnivora extends Ferae{
    int speed = 0;
    String huntingType;
    String huntingProcess;
    public Carnivora(int _neurons, double _precision, String _favoriteFoods, int _speed, String _huntingType, String _huntingProcess){
        super(_neurons, _precision, _favoriteFoods);
        speed = _speed;
        huntingType = _huntingType;
        huntingProcess = _huntingProcess;
    }
}