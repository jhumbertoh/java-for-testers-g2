package clase6;

public class Zoologico {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.hacerSonido();

        Perro rocky = new Perro();
        rocky.hacerSonido();
        rocky.buscar();
        alimentar(rocky);

        Animal princesa = new Perro();
        princesa.hacerSonido();
        ((Perro)princesa).buscar();
        alimentar(princesa);

        princesa = new Gato();
        princesa.hacerSonido();
        ((Gato)princesa).rasguniar();
        alimentar(princesa);
    }

    public static void alimentar(Animal animal){

        if(animal instanceof Perro){
            System.out.println("Aqui esta tu comida perro");
        }else if(animal instanceof Gato){
            System.out.println("Aqui esta tu comida gato");
        }

    }
}
