interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Strum");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Keys");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Playable g = new Guitar();
        g.play();

        Playable p = new Piano();
        p.play();
    }
}