class Mammalia{
    int legs;
    boolean tails;
    boolean brain;
    int neurons;
    double precision;
    int birthDate;
    String favoriteFoods;
    
    public void eat(){}
    public void walk(){}
    public void sleep(){}
    public void give_birth(){}
}

class Monotremata extends Mammalia{}
class Theria extends Mammalia{}

class Marsupialia extends Theria{}
class Placentalia extends Theria{}

class Atlantogenata extends Placentalia{}
class Boreoeutheria extends Placentalia{}

class Afrotheria extends Atlantogenata{}
class Xenarthra extends Atlantogenata{}

class Euarchontoglires extends Boreoeutheria{}
class Laurasiatheria extends Boreoeutheria{}

class Euarchonta extends Euarchontoglires{}
class Glires extends Euarchontoglires{}

class Scrotifera extends Laurasiatheria{}
class Eulipotyphia extends Laurasiatheria{}

class Chirpotera extends Scrotifera{}
class Euungulata extends Scrotifera{}
class Ferae extends Scrotifera{}

class Cetartiodactyla extends Euungulata{}
class Perissodactyla extends Euungulata{}

class Pholidota extends Ferae{}
class Carnivora extends Ferae{}