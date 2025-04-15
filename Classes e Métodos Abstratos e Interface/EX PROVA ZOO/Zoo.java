public class Zoo {
    private Animal[] animais = new Animal[10];

    public Animal[] getAnimais() {
        return this.animais ;
    }

    public boolean adicionarAnimal(Passaro passaro) {
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] == null) {
                animais[i] = passaro ;
                return true ;
            }
        }

        return false ;
    }

    public boolean adicionarAnimal(Cachorro cachorro) {
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] == null) {
                animais[i] = cachorro ;
                return true ;
            }
        }

        return false ;
    }

    public boolean adicionarAnimal(Cavalo cavalo) {
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] == null) {
                animais[i] = cavalo ;
                return true ;
            }
        }

        return false ;
    }

    public boolean excluirAnimal(Animal animal) {
        boolean deletou = false ;
        
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] != null) {
                if (animais[i].getNome().equals(animal.getNome())) {
                    animais[i] = null ;
                    deletou = true ;
                }
            }
        }
        
        // Reordenar o vetor
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] == null) {
                for (int j = i ; j < animais.length ; j ++) {
                    if (animais[j] != null) {
                        animais[i] = animais[j] ;
                        animais[j] = null ;
                        break;
                    }
                }
            }
        }

        return deletou ;
    }

    public float calcula(Animal animal) {
        boolean isCavalo = animal instanceof Cavalo ;
        boolean isCachorro = animal instanceof Cachorro ;
        boolean isPassaro = animal instanceof Passaro ;

        if (isCavalo || isCachorro) {
            Mamifero mamifero = (Mamifero) animal ;
            return mamifero.correr();
        } else if (isPassaro) {
            Passaro passaro = (Passaro) animal ;
            return passaro.alturaDoVoo();
        }

        return 0.0f ;
    }

    public Animal buscaAnimal(String nome) {
        for (int i = 0 ; i < animais.length ; i ++ ) {
            if (animais[i] != null) {
                if (animais[i].getNome().equals(nome)) {
                    return animais[i] ;
                }
            }
        }

        return null ;
    }
}
