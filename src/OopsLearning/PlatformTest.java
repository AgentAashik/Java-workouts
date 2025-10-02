package OopsLearning;

interface Streaming {
    void Movies();
    void Music();
}

interface Learning {
    void Programming();
    void Language();
}

class Platform implements Streaming, Learning {
    @Override
    public void Movies() {
        System.out.println("Netflix subscription");
    }

    @Override
    public void Music() {
        System.out.println("Spotify premium");
    }

    @Override
    public void Programming() {
        System.out.println("Java course");
    }

    @Override
    public void Language() {
        System.out.println("Spanish lessons");
    }
}

public class PlatformTest {
    public static void main(String[] args) {
        Platform service = new Platform();
        service.Movies();
        service.Music();
        service.Programming();
        service.Language();
    }
}
